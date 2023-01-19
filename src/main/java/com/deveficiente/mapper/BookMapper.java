package com.deveficiente.mapper;

import com.deveficiente.entity.Author;
import com.deveficiente.entity.Book;
import com.deveficiente.entity.Category;
import com.deveficiente.entity.dto.BookDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel =  "spring")
public interface BookMapper {

    Book toDomain(BookDTO bookDTO);
}
