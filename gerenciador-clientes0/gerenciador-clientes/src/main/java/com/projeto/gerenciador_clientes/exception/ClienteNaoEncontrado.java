package com.projeto.gerenciador_clientes.exception;

public class ClienteNaoEncontrado  extends RuntimeException {
    public ClienteNaoEncontrado (String message) {
        super(message);
    }
}
