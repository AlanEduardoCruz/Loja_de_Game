package com.generation.lojadegames.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "O atributo nome é obrigatório!")
	@Size(min = 5, max = 50, message = "O atributo nome deve conter minimo 05 e no máximo 50 caracteres")
    private String nome;

    @NotBlank(message = "O atributo descricao é obrigatório!")
	@Size(min = 5, max = 100, message = "O atributo descricao deve conter minimo 05 e no máximo 100 caracteres")
    private String descricao;

    
    
}

