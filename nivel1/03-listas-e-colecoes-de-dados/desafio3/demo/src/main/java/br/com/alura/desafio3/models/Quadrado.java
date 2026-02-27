package br.com.alura.desafio3.models;

import br.com.alura.desafio3.interfaces.Forma;

public class Quadrado implements Forma{
    //Atributos
    private double lado;

    //Construtores
    public Quadrado(double lado) {
        this.lado = lado;
    }
    public Quadrado() {}

    //Getters e Setters
    public double getLado() {
        return lado;
    }
    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea(){
        return lado * lado;
    }
}
