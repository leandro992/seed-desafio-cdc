package com.alura.dominio;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.time.LocalDate;


@Entity
@Data
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    @NotBlank(message = "O nome é obrigatório.")
    private String name;
    @Column
    @NotBlank
    @Email(message = "Email é obrigatório.")
    private String email;
    @Column()
    @NotBlank(message = "A descrição é obrigatoria.")
    private String description;
    @Column
    @CreatedDate
    private LocalDate instante;
}
