package org.csu.sparrowbrand.persistence;

import org.csu.sparrowbrand.domain.Category;

import java.util.List;

public interface CategoryMapper {
    List<Category> getCategoryList();

    Category getCategory(String categoryId);
}
