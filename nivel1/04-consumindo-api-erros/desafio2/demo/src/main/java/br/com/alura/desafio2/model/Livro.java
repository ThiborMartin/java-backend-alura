package br.com.alura.desafio2.model;

public class Livro {
    private String nome;
    private String autor;
    private Editora editora;

    public Livro(String nome, String autor, Editora editora) {
        this.nome = nome;
        this.autor = autor;
        this.editora = editora;
    }

    @Override
    public String toString() {
        return "Livro: %s | Autor: %s | Editora: %s".formatted(this.nome, this.autor, this.editora);
    }
}
