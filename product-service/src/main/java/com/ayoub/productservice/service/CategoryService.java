package com.ayoub.productservice.service;

import com.ayoub.productservice.entities.Category;

import java.util.List;

public interface CategoryService {
    List<Category> getAllCategories();
    Category findCategoryById(long id);
    Category saveCategory(Category category);
    Category updateCategory(Category category);
    void deleteCategory(long id);
}
