package com.deveficiente.entity.dto;

import com.deveficiente.UniqueValue;
import com.deveficiente.entity.Author;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Builder;
import lombok.Data;


@Data
@Builder
public class AuthorDTO {

    @NotBlank(message = "O nome é obrigatório.")
    private String name;
    @NotBlank(message = "A descrição é obrigatoria.")
    private String description;
    @NotBlank
    @Email(message = "Email é obrigatório.")
    @UniqueValue(domainClass = Author.class, fieldName = "email")
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
