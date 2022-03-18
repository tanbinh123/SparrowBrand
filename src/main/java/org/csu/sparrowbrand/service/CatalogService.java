package org.csu.sparrowbrand.service;

import org.csu.sparrowbrand.domain.Category;
import org.csu.sparrowbrand.domain.Product;
import org.csu.sparrowbrand.domain.Product_sold;

import java.util.List;

public interface CatalogService {

    List<Category> getCategoryList() ;
    Category getCategory(String categoryId);

    Product getProduct(String productId);
    List<Product> getProductListByCategory(String categoryId);

    Product_sold getSold(String soldId);
}
