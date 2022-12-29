package com.aq.mvcrest.api.v1.mapper;

import com.aq.mvcrest.api.v1.modelDTO.CategoryDTO;
import com.aq.mvcrest.domain.Category;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;


@Mapper
public interface CategoryMapper {

    CategoryMapper INSTANCE = Mappers.getMapper(CategoryMapper.class);

    CategoryDTO categoryToCategoryDTO(Category category);

}
