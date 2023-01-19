package com.deveficiente.mapper;


import com.deveficiente.entity.Category;
import com.deveficiente.entity.dto.CategoryDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CategoryMapper {

    Category toDomain(CategoryDTO categoryDTO);

}
