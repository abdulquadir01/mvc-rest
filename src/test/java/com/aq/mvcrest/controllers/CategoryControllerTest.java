//package com.aq.mvcrest.controllers;
//
//import com.aq.mvcrest.api.v1.modelDTO.CategoryDTO;
//import com.aq.mvcrest.services.CategoryService;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.springframework.http.MediaType;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.setup.MockMvcBuilders;
//import java.util.Arrays;
//import java.util.List;
//
//import static org.hamcrest.Matchers.hasSize;
//import static org.mockito.Mockito.when;
//
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//
//
//
//
//public class CategoryControllerTest {
//
////    public static final String NAME = "Jhon";
//
//    @Mock
//    CategoryService categoryService;
//
//    @InjectMocks
//    CategoryController categoryController;
//
//    MockMvc mockMvc;
//
//    @BeforeEach
//    public void setUp() {
//        mockMvc = MockMvcBuilders.standaloneSetup(categoryController).build();
//    }
//
//    @Test
//    public void getAllCategoriesTest() throws  Exception {
//        CategoryDTO category1 = new CategoryDTO();
//        category1.setId(1L);
//        category1.setName("Jhon");
//
//        CategoryDTO category2 = new CategoryDTO();
//        category2.setId(2L);
//        category2.setName("Cena");
//
//        List<CategoryDTO> categories = Arrays.asList(category1, category2);
//
//        when(categoryService.getAllCategories()).thenReturn(categories);
//
//        mockMvc.perform(
//                get("api/v1/categories/")
//                        .contentType(MediaType.APPLICATION_JSON))
//                .andExpect(status().isOk())
//                .andExpect(jsonPath("$.categories", hasSize(2)));
//
//    }
//
//}