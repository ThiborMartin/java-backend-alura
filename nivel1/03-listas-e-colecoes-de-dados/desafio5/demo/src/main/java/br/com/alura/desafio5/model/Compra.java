package br.com.alura.desafio5.model;

public class Compra implements Comparable<Compra> {
    //Atributos da Classe
    private String nomeProduto;
    private double valor;

    //Construtores
    public Compra(String nomeProduto, double valor) {
        this.nomeProduto = nomeProduto;
        this.valor = valor;
    }
    public Compra(){}

    //Getters e Setters
    public String getNomeProduto() {
        return nomeProduto;
    }
    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Compra: %s - R$ %.2f".formatted(nomeProduto, valor);
    }
    
    //Método para comparar as compras pelo valor
    @Override
    public int compareTo(Compra arg0) {
        //Compara o valor do objeto Compra atual com o valor do objeto Compra passado como parâmetro
        //Delega a comparação para o método compare da Classe Double, que retorna - | 0 | + a depender do resultado da comparação
        return Double.compare(this.valor, arg0.valor);
    }
}
