package com.aq.mvcrest.controllers;

import com.aq.mvcrest.api.v1.modelDTO.CategoryDTO;
import com.aq.mvcrest.api.v1.modelDTO.CategoryListDTO;
import com.aq.mvcrest.domain.Category;
import com.aq.mvcrest.services.CategoryService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/api/v1/categories/")
public class CategoryController {

    private final CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping
    public ResponseEntity<CategoryListDTO> getAllCategories() {

        return  new ResponseEntity<CategoryListDTO>(
                new CategoryListDTO(categoryService.getAllCategories()), HttpStatus.OK
        );
    }

    @GetMapping("{name}")
    ResponseEntity<CategoryDTO> getCategoriesByName(@PathVariable String name){
        return new ResponseEntity<CategoryDTO>(
                categoryService.getCategoryByName(name), HttpStatus.OK
        );
    }

}
