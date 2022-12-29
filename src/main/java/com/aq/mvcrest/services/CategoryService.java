package com.aq.mvcrest.services;


import com.aq.mvcrest.api.v1.modelDTO.CategoryDTO;

import java.util.List;


public interface CategoryService {
    List<CategoryDTO> getAllCategories();

    CategoryDTO getCategoryByName(String name);
}
