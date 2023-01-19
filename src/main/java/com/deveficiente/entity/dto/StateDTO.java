package com.deveficiente.entity.dto;

import com.deveficiente.ExistsId;
import com.deveficiente.UniqueValue;
import com.deveficiente.entity.Country;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class StateDTO {
    @NotBlank
    private String name;
    @Min(message = "Id country is not empty", value = 0)
    private Long countryId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getCountryId() {
        return countryId;
    }

    public void setCountryId(Long countryId) {
        this.countryId = countryId;
    }
}
