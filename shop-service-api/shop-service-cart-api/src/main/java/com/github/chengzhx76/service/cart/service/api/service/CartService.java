package com.github.chengzhx76.service.cart.service.api.service;

import com.github.chengzhx76.service.cart.service.api.entity.ShoppingCart;
import com.github.chengzhx76.service.cart.service.api.model.ProductModel;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

/**
 * Desc: 购物车
 * Author: cheng
 * Date: 2016/6/28
 */
@RequestMapping("cart")
public interface CartService {

    /**
     * 递增商品的数量
     * @param userId 用户ID
     * @param productId 商品ID
     * @return 增加后的商品数量
     */
    @PostMapping("product")
    Long addProductCount(@RequestParam("userId") String userId, @RequestParam("productId") String productId);

    /**
     * 减少商品数量
     * @param userId 用户ID
     * @param productId 商品ID
     * @return 减少后的商品数量
     */
    @PutMapping("product")
    Long subProductCount(@RequestParam("userId") String userId, @RequestParam("productId") String productId);

    /**
     * 获取购物车中所有已选择商品的ID
     * @param userId 用户ID
     * @return 该用户购物车中所有商品的ID
     */
    @GetMapping("choose/product")
    Set<String> getChooseProductIds(@RequestParam("userId") String userId);

    /**
     * 获取购物车中所有商品的ID
      * @param userId
     * @return
     */
    @GetMapping("products")
    Set<String> getAllProductIds(@RequestParam("userId") String userId);

    /**
     * 根据用户id获取和商品ID获取商品个数
     * @param userId 用户ID
     * @param productId 商品ID
     * @return
     */
    @GetMapping("product/counts")
    Long getCounts(@RequestParam("userId") String userId, @RequestParam("productId") String productId);

    /**
     * 删除购物车中的商品
     * @param userId 用户ID
     * @param productId 商品ID
     */
    @DeleteMapping("product")
    void deleteProduct(@RequestParam("userId") String userId, @RequestParam("productId") String productId);

    /**
     * 获取购物车的信息
     * @param accessId 用户ID
     * @return 购物车的商品
     */
    @GetMapping("cart")
    ShoppingCart getShoppingCart(@RequestParam("accessId") String accessId);

    /**
     * 添加商品
     * @param userId 用户ID
     * @param productId 商品ID
     * @param count 商品数量
     */
    @PostMapping("counts")
    void addProduct(@RequestParam("userId") String userId,
                    @RequestParam("productId") String productId,
                    @RequestParam("count") Long count
                    );

    /**
     * 改变选择状态
     * @param userId
     * @param productId
     * @return
     */
    @PutMapping("change-status")
    boolean changeStatus(@RequestParam("userId") String userId, @RequestParam("productId") String productId);

    /**
     * 获取已选择的商品信息
     * @param userId
     * @return
     */
    @GetMapping("choose")
    List<ProductModel> getChooseProductInfo(@RequestParam("userId") String userId);

    /**
     * 删除已选择的商品（已购买的商品删除）
     * @param userId
     */
    @DeleteMapping("choose")
    void deletedChooseProduct(@RequestParam("userId") String userId);

    /**
     * 选择所有的商品
      * @param userId
     */
    @PutMapping("all-choose")
    void chooseAllProduct(@RequestParam("userId") String userId);

    /**
     * 取消选择所有的商品
      * @param userId
     */
    @PutMapping("un-choose")
    void unChooseAllProduct(@RequestParam("userId") String userId);

    /**
     * 购物车中是否存在该商品
     * @param userId
     * @param productId
     * @return
     */
    @GetMapping("exists")
    boolean exists(@RequestParam("userId") String userId, @RequestParam("productId") String productId);

    /**
     * 改变为选择状态
     * @param userId
     * @param productId
     */
    @PutMapping("change-choose-status")
    void changeChooseStatus(@RequestParam("userId") String userId, @RequestParam("productId") String productId);
    /**
     * 改变为不选择状态
     * @param userId
     * @param productId
     */
    @PutMapping("change-un-choose-status")
    void changeUnChooseStatus(@RequestParam("userId") String userId, @RequestParam("productId") String productId);
}
