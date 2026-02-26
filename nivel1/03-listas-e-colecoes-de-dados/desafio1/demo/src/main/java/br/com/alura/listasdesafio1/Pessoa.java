package br.com.alura.listasdesafio1;

public class Pessoa {
    private String nome;
    private int    idade;

    //Construtor cheio para inicializar um objeto assim que instanciamos ele
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    //Construtor vazio, para permitir que seja possível criar um objeto do tipo Pessoa, mas sem inicializa-lo imediatamente
    public Pessoa() {}

    //Getters e Setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    //Sobrescrita do método toString() (herdado da Classe-mãe Object) para que fique mais adequado a esta Classe Pessoa
    @Override
    public String toString() {
        return "Nome: %s Idade: %d".formatted(this.nome, this.idade);
    }

}
