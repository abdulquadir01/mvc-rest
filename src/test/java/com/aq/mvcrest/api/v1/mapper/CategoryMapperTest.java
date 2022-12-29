package com.aq.mvcrest.api.v1.mapper;

import com.aq.mvcrest.api.v1.modelDTO.CategoryDTO;
import com.aq.mvcrest.domain.Category;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CategoryMapperTest {

    CategoryMapper categoryMapper = CategoryMapper.INSTANCE;

    @Test
    public void categoryToCategoryDTO() throws Exception {

//        given
        Category category = new Category();
        category.setName("Jhon");
        category.setId(1L);

//        when
        CategoryDTO categoryDTO = categoryMapper.categoryToCategoryDTO(category);

//        then
        assertEquals(Long.valueOf(1L), categoryDTO.getId());
        assertEquals("Jhon", categoryDTO.getName());

    }
}