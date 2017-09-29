package com.github.chengzhx76.service.product.service.impl;

import com.github.chengzhx76.service.product.api.entity.Picture;
import com.github.chengzhx76.service.product.api.entity.Product;
import com.github.chengzhx76.service.product.api.entity.ProductType;
import com.github.chengzhx76.service.product.api.service.ProductService;
import com.github.chengzhx76.service.product.dao.PictureDaoMapper;
import com.github.chengzhx76.service.product.dao.ProductDaoMapper;
import com.github.chengzhx76.service.product.dao.ProductTypeDaoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Desc:
 * Author: cheng
 * Date: 2016/6/28
 */
@RestController
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductDaoMapper productDao;
    @Autowired
    private PictureDaoMapper pictureDao;
    @Autowired
    private ProductTypeDaoMapper productTypeDao;

    @Override
    public Product getById(String id) {
        return productDao.load(new Product(id));
    }

    @Override
    public void updateStockById(String id, int stock, boolean isBack) {
        Product product = new Product();
        product.setId(id);
        product.setUnitsInStock(stock);
        product.setUpdate(isBack);
        product.preUpdate();
        productDao.update(product);
    }

    @Override
    public List<Product> getByTypeId(String typeId) {
        Product product = new Product();
        product.setTypeId(typeId);
        return productDao.loadAll(product);
    }

    @Override
    public Product getDefaultPictureById(String id) {
        Product product = productDao.load(new Product(id));
        Picture pictures = getDefaultPictureByProductId(id);
        product.setDefaultPicture(pictures);
        return product;
    }

    @Override
    public List<Product> getIndex() {
        List<Product> products = productDao.loadAll(new Product(true));
        for (Product product : products) {
            Picture pictures = pictureDao.load(new Picture(product.getId(), true));
            product.setDefaultPicture(pictures);
        }
        return products;
    }

    @Override
    public List<ProductType> getProductType() {
        return productTypeDao.loadAll();
    }

    @Override
    public List<Picture> getAllPicture(String productId) {
        return pictureDao.loadAll(new Picture(productId, null));
    }

    @Override
    public Picture getDefaultPictureByProductId(String productId) {
        Picture picture = pictureDao.load(new Picture(productId, true));
        return picture;
    }

    @Override
    public List<Picture> getShowPictureByProductId(String productId) {
        return pictureDao.loadAll(new Picture(productId, false));
    }
}
