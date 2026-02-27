package br.com.alura.desafio3.models;

public class Animal {
    //Atributos
    private int patas;
    private int idade;
    private int peso;

    //Construtor cheio
    public Animal(int patas, int idade, int peso) {
        this.patas = patas;
        this.idade = idade;
        this.peso = peso;
    }

    //Getters e Setters
    public int getPatas() {
        return patas;
    }
    public void setPatas(int patas) {
        this.patas = patas;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public int getPeso() {
        return peso;
    }
    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void emitirSom(){
        System.out.println("Emitindo som");
    }
    
    public void dormir(){
        System.out.println("Dormindo");
    }

    public void comer(){
        System.out.println("Comendo");
    }
}
