package br.com.alura.listasdesafio1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Criação de objetos do tipo Pessoa, utilizando o construtor cheio para inicializar os objetos com os atributos
        Pessoa pessoa1 = new Pessoa("Mario", 26);
        Pessoa pessoa2 = new Pessoa("José", 31);
        Pessoa pessoa3 = new Pessoa("Lucas", 40);

        //Criamos uma variável "pessoas" do tipo ArrayList que gerará uma lista de um tipo de elemento, nesse caso Pessoa. new ArrayList<>() cria uma nova lista atribuida a pessoas
        ArrayList<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(pessoa1);
        pessoas.add(pessoa2);
        pessoas.add(pessoa3);

        //print da primeira pessoa da lista, utilizando método get() passando índice
        System.out.println(pessoas.get(0));
        
        //For each pra percorrer a lista "pessoas" e atribuir cada objeto da lista a variável pessoa
        for (Pessoa pessoa : pessoas) {
            //print de cada objeto da lista individualmente. Como estamos printando, não há necessidade de chamar o método toString(), seu uso fica implícito. E como sobrescrevemos na classe Pessoa, o print seguirá o padrão definido na sobrescrita 
            System.out.println(pessoa);
        }
    }
}