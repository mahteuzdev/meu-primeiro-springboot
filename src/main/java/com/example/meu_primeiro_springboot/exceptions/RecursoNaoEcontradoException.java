package com.example.meu_primeiro_springboot.exceptions;

public class RecursoNaoEcontradoException extends RuntimeException {
    public RecursoNaoEcontradoException(String mensagem) {
        super(mensagem);
    }
}
