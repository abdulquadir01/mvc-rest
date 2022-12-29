//package com.aq.mvcrest.services;
//
//import com.aq.mvcrest.api.v1.mapper.CategoryMapper;
//import com.aq.mvcrest.api.v1.modelDTO.CategoryDTO;
//import com.aq.mvcrest.domain.Category;
//import com.aq.mvcrest.repositories.CategoryRepository;
//import org.junit.Before;
//import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.Test;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//
//import java.util.Arrays;
//import java.util.List;
//
//import static org.junit.jupiter.api.Assertions.*;
//import static org.mockito.ArgumentMatchers.anyString;
//import static org.mockito.Mockito.when;
//
//
//public class CategoryServiceImplTest {
//
//    public final long ID = 2L;
//    public final String NAME = "Banana";
//
//
//    CategoryService categoryService;
//
//    @Mock
//    CategoryRepository categoryRepository;
//
//    @Before
//    public void setUp() throws Exception {
//        categoryService = new CategoryServiceImpl(CategoryMapper.INSTANCE, categoryRepository);
//    }
//
//    @Test
//    public void getAllCategories() throws Exception {
////        Given
//        List<Category> categories = Arrays.asList(new Category(), new Category());
//
//        when(categoryRepository.findAll()).thenReturn(categories);
//
////        When
//        List<CategoryDTO> categoryDTOS = categoryService.getAllCategories();
//
////        Then
//        assertEquals(2, categoryDTOS.size());
//    }
//
//    @Test
//    public void getCategoryByName() throws Exception {
////        Given
//        Category category = new Category();
//        category.setId(ID);
//        category.setName(NAME);
//
//        when(categoryRepository.findByName(anyString())).thenReturn(category);
//
////        When
//        CategoryDTO categoryDTO = categoryService.getCategoryByName(NAME);
//
////        Then
//        assertEquals(ID, categoryDTO.getId());
//        assertEquals(NAME, categoryDTO.getName());
//    }
//
//}