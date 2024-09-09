package com.projeto.gerenciador_clientes.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Nome é obrigatório")
    private String nome;

    @NotBlank(message = "Sobrenome é obrigatório")
    private String sobrenome;

    private Integer idade;

    @Column(unique = true)
    private String cpf;

    @Email(message = "Email deve ser válido")
    private String email;

    private String telefone;

    @OneToOne(cascade = CascadeType.ALL)
    private Endereco endereco;
}
