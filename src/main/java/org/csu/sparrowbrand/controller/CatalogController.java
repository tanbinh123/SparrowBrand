package org.csu.sparrowbrand.controller;

import org.csu.sparrowbrand.domain.Category;
import org.csu.sparrowbrand.domain.Product;
import org.csu.sparrowbrand.domain.Product_sold;
import org.csu.sparrowbrand.persistence.ProductMapper;
import org.csu.sparrowbrand.service.CatalogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class CatalogController {

    @Autowired
    private CatalogService catalogService;

    @Autowired
    private ProductMapper productMapper;

    @GetMapping("/catalog/main")
    public String viewMain(){
        return "catalog/main";
    }

    @GetMapping("/catalog/category")
    public String viewCategory(@RequestParam("categoryId") String categoryId, Model model){
        Category category = catalogService.getCategory(categoryId);
        List<Product> productList = catalogService.getProductListByCategory(categoryId);
        model.addAttribute("category",category);
        model.addAttribute("productList",productList);
        return "catalog/category";
    }

    @GetMapping("/catalog/product")
    public  String viewProduct(@RequestParam("productId") String productId, Model model){
        Product product = catalogService.getProduct(productId);
        Category category = catalogService.getCategory(product.getCategoryId());
        model.addAttribute("product",product);
        model.addAttribute("category",category);
        return  "/catalog/product";
    }

    @GetMapping("/catalog/sold")
    public String viewSold(@RequestParam("soldId") String soldId, Model model){
        Product_sold sold = productMapper.getSold(soldId);
        model.addAttribute("sold",sold);
        return  "catalog/sold";
    }
}
