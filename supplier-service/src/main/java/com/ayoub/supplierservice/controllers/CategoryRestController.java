package com.ayoub.supplierservice.controllers;

import com.ayoub.supplierservice.entities.Category;
import com.ayoub.supplierservice.service.CategoryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/category")
public class CategoryRestController {
    private final CategoryService categoryService;

    public CategoryRestController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping("/categorys")
    public List<Category> getAllCategorys() {
        return categoryService.getAllCategorys();
    }

    @GetMapping("/categorys/{id}")
    public Category findCategoryById(@PathVariable long id) {
        return categoryService.findCategoryById(id);
    }

    @PostMapping("/categorys/add")
    public Category saveCategory(Category category) {
        return categoryService.saveCategory(category);
    }

    @PutMapping("/categorys/update")
    public Category updateCategory(Category category) {
        return categoryService.updateCategory(category);
    }

    @DeleteMapping("/categorys/delete/{id}")
    public Category deleteCategory(@PathVariable long id) {
        return categoryService.deleteCategory(id);
    }

}
