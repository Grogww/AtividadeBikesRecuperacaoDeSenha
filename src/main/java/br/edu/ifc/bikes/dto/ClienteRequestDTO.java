package br.edu.ifc.bikes.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import org.hibernate.validator.constraints.br.CPF;

//@CPF valida o formato e os dígitos verificadores do cpf
public record ClienteRequestDTO(
        @NotBlank(message = "O nome é obrigatório")
        @Size(min=5, max=100)
        String nome,
        @NotBlank(message = "O cpf é obrigatório")
        @Size(min=11, max=11)
        @CPF(message = "O cpf deve ser válido")
        String cpf
) { }
