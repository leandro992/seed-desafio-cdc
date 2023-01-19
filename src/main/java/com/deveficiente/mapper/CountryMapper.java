package com.deveficiente.mapper;


import com.deveficiente.entity.Country;
import com.deveficiente.entity.dto.CountryDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CountryMapper {

    @Mapping(source = "name", target = "name")
    Country toDomain(CountryDTO country);

}
