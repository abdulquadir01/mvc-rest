package com.aq.mvcrest.api.v1.modelDTO;


import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class CategoryListDTO {

    List<CategoryDTO> categories;

}
