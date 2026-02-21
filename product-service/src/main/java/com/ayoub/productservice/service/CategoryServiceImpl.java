package com.ayoub.productservice.service;

import com.ayoub.productservice.entities.Categories;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {
    private final CategoryService categoryService;

    public CategoryServiceImpl(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @Override
    public List<Categories> getAllCategories() {
        return categoryService.getAllCategories();
    }

    @Override
    public Categories findCategoryById(long id) {
        return categoryService.findCategoryById(id);
    }

    @Override
    public Categories saveCategory(Categories category) {
        return categoryService.saveCategory(category);
    }

    @Override
    public Categories updateCategory(Categories category) {
        return categoryService.updateCategory(category);
    }

    @Override
    public void deleteCategory(long id) {
        categoryService.deleteCategory(id);
    }
}
