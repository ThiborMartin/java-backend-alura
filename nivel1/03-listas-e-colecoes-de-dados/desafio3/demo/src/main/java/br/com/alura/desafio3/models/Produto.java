package br.com.alura.desafio3.models;

public class Produto {
    //Atributos
    private String nome;
    private double preco;

    //Construtores cheio e vazio
    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }
    public Produto() {}

    //Getters e Setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
}
