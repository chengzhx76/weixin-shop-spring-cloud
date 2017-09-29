package com.github.chengzhx76.service.product.api.service;


import com.github.chengzhx76.service.product.api.entity.Picture;
import com.github.chengzhx76.service.product.api.entity.Product;
import com.github.chengzhx76.service.product.api.entity.ProductType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * Desc: 商品
 * Author: cheng
 * Date: 2016/6/28
 */
@RequestMapping("product")
public interface ProductService {

    /**
     * 根据ID获取商品
     * @param id
     * @return
     */
    @GetMapping("id")
    Product getById(String id);

    /**
     * 更新商品库存信息
     * @param id
     * @param stock
     * @param isBack 是否是后端
     */
    @PutMapping("stock/id")
    void updateStockById(@RequestParam("id") String id, @RequestParam("stock") int stock, @RequestParam("isBack") boolean isBack);

    /**
     * 根据类型ID获取图片
     * @param typeId
     * @return
     */
    @GetMapping("type-id")
    List<Product> getByTypeId(@RequestParam("typeId") String typeId);

    /**
     * 根据ID获取商品和默认图片
     * @param id
     * @return
     */
    @GetMapping("default/id")
    Product getDefaultPictureById(@RequestParam("id") String id);

    /**
     * 获取首页的商品
     * @return
     */
    @GetMapping("home/products")
    List<Product> getIndex();

    /**
     * 获取全部的商品类型
     * @return
     */
    @GetMapping("types")
    List<ProductType> getProductType();

    /**
     * 获取该商品全部图片
     * @param productId
     * @return
     */
    @GetMapping("pictures/id")
    List<Picture> getAllPicture(@RequestParam("productId") String productId);

    /**
     * 获取商品默认的图片
     * @param productId
     * @return
     */
    @GetMapping("default-picture/id")
    Picture getDefaultPictureByProductId(@RequestParam("productId") String productId);

    /**
     * 获取该商品的所有的轮播图
     * @param productId
     * @return
     */
    @GetMapping("show-picture/id")
    List<Picture> getShowPictureByProductId(@RequestParam("productId") String productId);

}
