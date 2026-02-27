package br.com.alura.desafio3.models;

import br.com.alura.desafio3.interfaces.Forma;

public class Circulo implements Forma{
    //Atributos
    private double raio;

    //Construtores
    public Circulo(double raio) {
        this.raio = raio;
    }
    public Circulo() {}

    //Getters e Setters
    public double getRaio() {
        return raio;
    }
    public void setRaio(double raio) {
        this.raio = raio;
    }

    //Implementação do método da interface Forma
    @Override
    public double calcularArea() {
        return Math.PI * (raio * raio);
    }
}
