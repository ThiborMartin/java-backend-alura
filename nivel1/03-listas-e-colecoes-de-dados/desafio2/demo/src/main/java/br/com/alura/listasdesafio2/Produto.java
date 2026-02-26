package br.com.alura.listasdesafio2;

public class Produto {
    //Atributos
    private String nome;
    private double preco;
    private int quantidade;

    //Construtores cheio e vazio
    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
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
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    //Sobrescrita do método toString() herdado de Object
    @Override
    public String toString() {
        return "Nome: %s | Preço: %.2f | Quantidade: %d".formatted(this.nome, this.preco, this.quantidade);
    }
}
