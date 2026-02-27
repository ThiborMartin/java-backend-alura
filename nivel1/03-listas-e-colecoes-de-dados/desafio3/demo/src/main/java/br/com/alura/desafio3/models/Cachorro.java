package br.com.alura.desafio3.models;

public class Cachorro extends Animal{
    //Atributos
    private String nome;
    private String dono;

    //Construtor cheio da Classe
    public Cachorro(int patas, int idade, int peso, String nome, String dono) {
        //Chama o construtor da classe-mãe passando os parâmetros recebidos no construtor próprio
        super(patas, idade, peso);
        //Atribuições específicas da classe
        this.nome = nome;
        this.dono = dono;
    }

    //Getters e Setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getDono() {
        return dono;
    }
    public void setDono(String dono) {
        this.dono = dono;
    }

    //Sobrescrita do método toString() da Classe Object
    @Override
    public String toString() {
        return "Nome do cachorro: %s | Nome do dono: %s".formatted(nome, dono);
    }

    //Sobrescrita do método emitirSom() da ClasseAnimal, para se adequar a esta Classe Cachorro
    @Override
    public void emitirSom() {
        System.out.println("Latindo");
    }
}
