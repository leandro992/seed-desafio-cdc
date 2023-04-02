package com.deveficiente.entity.dto;

import com.deveficiente.config.Document;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class NewBuyDTO {
    @NotBlank(message = "este campo é obrigatorio")
    @Email(message = "formato do email errado")
    private String email;
    @NotBlank(message = "este campo é obrigatorio")
    private String name;
    @NotBlank(message = "este campo é obrigatorio")
    private String lastName;
    @NotBlank(message = "este campo é obrigatorio")
    private String document;
    @NotBlank(message = "este campo é obrigatorio")
    private String address;
    @NotBlank(message = "este campo é obrigatorio")
    private String complement;
    @NotBlank(message = "este campo é obrigatorio")
    private String city;
    @Max( value = 0, message = "valor não enviado")
    private Long idCounty;
    @Max( value = 0, message = "valor não enviado")
    private Long idState;
    @NotBlank(message = "este campo é obrigatorio")
    private String phone;
    @NotBlank(message = "este campo é obrigatorio")
    private String cep;
    @Document(message = "CPNJ ou CPF esta incorreto")
    private String cnpjCfp;


    public Long getIdCounty() {
        return idCounty;
    }

    public void setIdCounty(Long idCounty) {
        this.idCounty = idCounty;
    }

    public Long getIdState() {
        return idState;
    }

    public void setIdState(Long idState) {
        this.idState = idState;
    }

    public String getCnpjCfp() {
        return cnpjCfp;
    }

    public void setCnpjCfp(String cnpjCfp) {
        this.cnpjCfp = cnpjCfp;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getComplement() {
        return complement;
    }

    public void setComplement(String complement) {
        this.complement = complement;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
}
