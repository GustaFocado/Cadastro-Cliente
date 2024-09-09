package com.projeto.gerenciador_clientes.repository;


import com.projeto.gerenciador_clientes.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}