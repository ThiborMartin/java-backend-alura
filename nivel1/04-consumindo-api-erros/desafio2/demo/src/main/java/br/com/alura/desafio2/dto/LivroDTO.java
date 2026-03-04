package br.com.alura.desafio2.dto;

public record LivroDTO(
    String titulo,
    String autor,
    EditoraDTO editora
) {}
