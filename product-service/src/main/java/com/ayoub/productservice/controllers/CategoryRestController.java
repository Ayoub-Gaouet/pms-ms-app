package com.ayoub.productservice.controllers;

import com.ayoub.productservice.entities.Category;
import com.ayoub.productservice.service.CategoryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cat")
@CrossOrigin("*")
public class CategoryRestController {
    final CategoryService categoryService;

    public CategoryRestController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @RequestMapping(method= RequestMethod.GET)
    public List<Category> getAllCategories()
    {
        return categoryService.getAllCategories();
    }
    @RequestMapping(value="/{id}",method = RequestMethod.GET)
    public Category findCategoryById(@PathVariable("id") Long id) {
        return categoryService.findCategoryById(id);
    }

}