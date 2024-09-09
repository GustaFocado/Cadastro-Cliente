package com.projeto.gerenciador_clientes.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ClienteDTO {

    @NotBlank(message = "Nome é obrigatório")
    private String nome;

    @NotBlank(message = "Sobrenome é obrigatório")
    private String sobrenome;

    private Integer idade;

    @NotBlank(message = "CPF é obrigatório")
    private String cpf;

    @Email(message = "Email deve ser válido")
    private String email;

    private String telefone;

    private EnderecoDTO endereco;
}