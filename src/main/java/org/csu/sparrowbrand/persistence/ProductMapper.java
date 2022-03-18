package org.csu.sparrowbrand.persistence;

import org.csu.sparrowbrand.domain.Product;
import org.csu.sparrowbrand.domain.Product_sold;

import java.util.List;

public interface ProductMapper {

    //根据大类categoryId来查询属于该类的所有product
    List<Product> getProductListByCategory(String categoryId);

    //根据小类productId来查询produc对象
    Product getProduct(String productId);

    Product_sold getSold(String soldId);
}
