package com.deveficiente.mapper;


import com.deveficiente.entity.Author;
import com.deveficiente.entity.dto.AuthorDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel =  "spring")
public interface AuthorMapper {

    Author toDomain(AuthorDTO authorDTO);

}
