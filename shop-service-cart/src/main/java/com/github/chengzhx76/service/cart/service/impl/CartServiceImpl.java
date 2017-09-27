package com.github.chengzhx76.service.cart.service.impl;

import com.github.chengzhx76.service.cart.service.api.entity.CartInfo;
import com.github.chengzhx76.service.cart.service.api.entity.ShoppingCart;
import com.github.chengzhx76.service.cart.service.api.model.ProductModel;
import com.github.chengzhx76.service.cart.service.api.service.CartService;
import com.github.chengzhx76.service.redis.RedisService;
import com.github.chengzhx76.shop.common.constant.Constant;
import com.github.chengzhx76.shop.common.util.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.io.Serializable;
import java.util.*;

/**
 * Desc: 购物车
 * Author: cheng
 * Date: 2016/6/28
 */
@RestController
public class CartServiceImpl implements CartService {

    @Autowired
    private RedisService redisService;

    @Override
    public Long addProductCount(String userId, String productId) {
        changeChooseStatus(userId, productId);
        return redisService.increase(getCart(userId), getProductFlag(userId, productId));
    }

    @Override
    public Long subProductCount(String userId, String productId) {
        changeChooseStatus(userId, productId);
        return redisService.decrease(getCart(userId), getProductFlag(userId, productId));
    }

    @Override
    public Set<String> getAllProductIds(String userId) {
        Set<String> allStatusProductIds = redisService.getFields(getCart(userId));
        Set<String> allProductIds = new HashSet<>();
        for (String productId : allStatusProductIds) {
            if (productId.startsWith(Constant.CHOOSE)) {
                allProductIds.add(StringUtils.replace(productId, Constant.CHOOSE, ""));
            }else if (productId.startsWith(Constant.NO_CHOOSE)) {
                allProductIds.add(StringUtils.replace(productId, Constant.NO_CHOOSE, ""));
            }
        }
        return allProductIds;
    }

    @Override
    public Set<String> getChooseProductIds(String userId) {
        Set<String> allProductIds = getAllProductIds(userId);
        Set<String> productIds = new HashSet<>();
        for (String productId : allProductIds) {
            if (redisService.exists(getCart(userId), chooseProduct(productId))) {
                productIds.add(productId);
            }
        }
        return productIds;
    }

    @Override
    public Long getCounts(String userId, String productId) {
        Object counts = redisService.getValueByKeyANdField(getCart(userId), getProductFlag(userId, productId));
        return (Long) counts;
    }

    @Override
    public void deleteProduct(String userId, String productId) {
        redisService.deleteField(getCart(userId), getProductFlag(userId, productId));
    }

    @Override
    public ShoppingCart getShoppingCart(String accessId) {
        Map<Serializable, Object> allProduct = redisService.getEntries(getCart(accessId));
        ShoppingCart shoppingCart = new ShoppingCart();
        if (!allProduct.isEmpty()) {
            List<CartInfo> cartInfos = new ArrayList<>();
            Set<Serializable> fields = allProduct.keySet();
            for (Serializable itemName : fields) {
                CartInfo cart = new CartInfo();
                cart.setAccessId(accessId);
                cart.setProductId(itemName.toString().split("_")[1]);
                cart.setQuantity(Integer.parseInt(allProduct.get(itemName).toString()));
                String isChoose = itemName.toString().split("_")[0];
                cart.setChoose("TRUE".equals(isChoose));
                cartInfos.add(cart);
            }
            shoppingCart.setCartInfos(cartInfos);
            shoppingCart.setAccessId(accessId);
            shoppingCart.setTotalQuantity(cartInfos.size());
        }
        return shoppingCart;
    }

    @Override
    public void addProduct(String userId, String productId, Long count) {
        deleteProduct(userId, productId);
        redisService.put(getCart(userId), getProductFlag(userId, productId), count);
    }

    @Override
    public boolean changeStatus(String userId, String productId) {
        if (redisService.exists(getCart(userId), chooseProduct(productId))) {
            Long counts = (Long) redisService.getValueByKeyANdField(getCart(userId), chooseProduct(productId));
            redisService.deleteField(getCart(userId), chooseProduct(productId));
            redisService.put(getCart(userId), noChooseProduct(productId), counts);
            return false;
        }else if (redisService.exists(getCart(userId), noChooseProduct(productId))) {
            Long counts = (Long) redisService.getValueByKeyANdField(getCart(userId), noChooseProduct(productId));
            redisService.deleteField(getCart(userId),noChooseProduct(productId));
            redisService.put(getCart(userId), chooseProduct(productId), counts);
            return true;
        }
        return false;
    }

    @Override
    public List<ProductModel> getChooseProductInfo(String userId) {
        Map<Serializable, Object> map = redisService.getEntries(getCart(userId));

        List<ProductModel> products = new ArrayList<>();
        Set<Serializable> fields = map.keySet();
        for (Serializable item : fields) {
            if (item.toString().startsWith(Constant.CHOOSE)) {
                ProductModel product = new ProductModel();
                product.setId(StringUtils.remove(item.toString(), Constant.CHOOSE));
                product.setCount(Integer.parseInt(map.get(item).toString()));
                products.add(product);
            }
        }
        return products;
    }

    @Override
    public void deletedChooseProduct(String userId) {
        Map<Serializable, Object> map = redisService.getEntries(getCart(userId));
        Set<Serializable> fields = map.keySet();
        for (Serializable item : fields) {
            if (item.toString().startsWith(Constant.CHOOSE)) {
                redisService.deleteField(getCart(userId), item.toString());
            }
        }
    }

    @Override
    public void chooseAllProduct(String userId) {
        Set<String> allProductIds = getAllProductIds(userId);
        for (String productId : allProductIds) {
            changeChooseStatus(userId, productId);
        }
    }

    @Override
    public void unChooseAllProduct(String userId) {
        Set<String> allProductIds = getAllProductIds(userId);
        for (String productId : allProductIds) {
            changeUnChooseStatus(userId, productId);
        }
    }

    @Override
    public boolean exists(String userId, String productId) {
        if (redisService.exists(getCart(userId), chooseProduct(productId))
                || redisService.exists(getCart(userId), noChooseProduct(productId))) {
            return true;
        }
        return false;
    }

    @Override
    public void changeChooseStatus(String userId, String productId) {
        if (redisService.exists(getCart(userId), noChooseProduct(productId))) {
            Long counts = (Long) redisService.getValueByKeyANdField(getCart(userId), noChooseProduct(productId));
            redisService.deleteField(getCart(userId),noChooseProduct(productId));
            redisService.put(getCart(userId), chooseProduct(productId), counts);
        }
    }

    @Override
    public void changeUnChooseStatus(String userId, String productId) {
        if (redisService.exists(getCart(userId), chooseProduct(productId))) {
            Long counts = (Long) redisService.getValueByKeyANdField(getCart(userId), chooseProduct(productId));
            redisService.deleteField(getCart(userId),chooseProduct(productId));
            redisService.put(getCart(userId), noChooseProduct(productId), counts);
        }
    }

    /**
     * 获取当前用户购物车的标识
     * @param userId
     * @return
     */
    private String getCart(String userId) {
        return Constant.CART+userId;
    }

    private String chooseProduct(String productId) {
        return Constant.CHOOSE+productId;
    }
    private String noChooseProduct(String productId) {
        return Constant.NO_CHOOSE+productId;
    }

    private String getProductFlag(String userId, String productId) {
        if (redisService.exists(getCart(userId), chooseProduct(productId))) {
            return chooseProduct(productId);
        }else if (redisService.exists(getCart(userId), noChooseProduct(productId))) {
            return noChooseProduct(productId);
        } else {
            return chooseProduct(productId);
        }
    }
}
