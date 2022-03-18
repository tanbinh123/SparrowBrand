package org.csu.sparrowbrand.service.impl;

import org.csu.sparrowbrand.domain.Category;
import org.csu.sparrowbrand.domain.Product;
import org.csu.sparrowbrand.domain.Product_sold;
import org.csu.sparrowbrand.persistence.CategoryMapper;
import org.csu.sparrowbrand.persistence.ProductMapper;
import org.csu.sparrowbrand.service.CatalogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CatalogServiceImpl implements CatalogService {

    @Autowired
    private CategoryMapper categoryMapper;
    @Autowired
    private ProductMapper productMapper;

    @Override
    public List<Category> getCategoryList() {
        return categoryMapper.getCategoryList();
    }

    @Override
    public Category getCategory(String categoryId) {
        return categoryMapper.getCategory(categoryId);
    }

    @Override
    public Product getProduct(String productId) {
        return productMapper.getProduct(productId);
    }

    @Override
    public List<Product> getProductListByCategory(String categoryId) {
        return productMapper.getProductListByCategory(categoryId);
    }

    @Override
    public Product_sold getSold(String soldId){
        return  productMapper.getSold(soldId);
    }

}
