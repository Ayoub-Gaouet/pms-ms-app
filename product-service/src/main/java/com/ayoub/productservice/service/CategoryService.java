package com.ayoub.productservice.service;

import com.ayoub.productservice.entities.Categories;

import java.util.List;

public interface CategoryService {
    List<Categories> getAllCategories();
    Categories findCategoryById(long id);
    Categories saveCategory(Categories category);
    Categories updateCategory(Categories category);
    void deleteCategory(long id);
}
