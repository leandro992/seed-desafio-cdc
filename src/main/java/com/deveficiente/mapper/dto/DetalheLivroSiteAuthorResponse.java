package com.deveficiente.mapper.dto;

import com.deveficiente.entity.Author;
import lombok.Data;

@Data
public class DetalheLivroSiteAuthorResponse {

   private String name;
   private String descricao;
    public DetalheLivroSiteAuthorResponse(Author author) {
         name = author.getName();
         descricao = author.getDescription();

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
