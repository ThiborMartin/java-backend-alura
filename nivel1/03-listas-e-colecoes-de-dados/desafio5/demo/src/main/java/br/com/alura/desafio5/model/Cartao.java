package br.com.alura.desafio5.model;

public class Cartao {
    //Atributos
    private double limite;
    private double valorGasto;

    //Construtores
    public Cartao(double limite) {
        this.limite = limite;
    }
    public Cartao(){}

    //Getters e Setters
    public double getLimite() {
        return limite;
    }
    public void setLimite(double limite) {
        this.limite = limite;
    }

    //Método que realiza a compra, verificando se o valor da compra excede o limite do cartão e retornando true ou false de acordo com o resultado da verificação
    public boolean realizarCompra(Compra compra) {
        if (compra.getValor() + valorGasto <= limite) {
            valorGasto += compra.getValor();
            System.out.println("Compra realizada com sucesso: " + compra);
            return true;
        }
        System.out.println("Compra recusada. Limite insuficiente");
        return false;
    }
}
