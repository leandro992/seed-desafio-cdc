package com.deveficiente.mapper;


import com.deveficiente.entity.State;
import com.deveficiente.entity.dto.StateDTO;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;


@Mapper(componentModel =  "spring")
public interface StateMapper {

    @InheritInverseConfiguration
    @Mapping(source = "countryId", target = "country.id")
    State toDomain(StateDTO stateDTO);

}
