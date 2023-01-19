package com.deveficiente.entity.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class CountryDTO {

    @NotBlank(message = "name é obrigatorio.")
    private String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
