package br.com.alura.desafio4.model;

public class Titulo implements Comparable<Titulo> {
    private String nome;

    public Titulo(String nome, int anoDeLancamento) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    //Sobrescrita do método compareTo da interface Comparable, que compara o nome do título atual com o nome do título passado como parâmetro, utilizando o método compareTo da classe String, que retorna um valor negativo se o nome do título atual for lexicograficamente menor que o nome do título passado como parâmetro, um valor positivo se for maior e zero se forem iguais
    //Lexicograficamente significa que a comparação é feita com base na ordem alfabética dos caracteres.
    @Override
    public int compareTo(Titulo o) {
        return this.nome.compareTo(o.getNome());
    }

    //Sobrescrita do método toString da classe Object, que retorna o nome do título, o que facilita a visualização dos títulos na lista quando ela é impressa
    @Override
    public String toString() {
        return this.nome;
    }
}
