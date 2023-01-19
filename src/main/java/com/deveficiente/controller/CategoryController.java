package com.deveficiente.controller;

import com.deveficiente.entity.Category;
import com.deveficiente.config.HandleValidationExceptions;
import com.deveficiente.mapper.CategoryMapper;
import com.deveficiente.entity.dto.CategoryDTO;
import com.deveficiente.repository.CategoryRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/category")
 class CategoryController extends HandleValidationExceptions {

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private CategoryMapper categoryMapper;

    @PostMapping
     Category saveCategory(@RequestBody @Valid CategoryDTO categoryDTO){
        Category category = categoryMapper.toDomain(categoryDTO);
        return categoryRepository.save(category);
    }

}
