package br.com.alura.desafio4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import br.com.alura.desafio4.model.Titulo;

public class Main {
    public static void main(String[] args) {
        //Declaração de uma lista usando a interface List e a implementação ArrayList
        List listaInteiros = new ArrayList();
        
        //Adição de 10 a 0
        for(int i = 10; i > 0; i--) {
            System.out.println("Adicionando o número: " + i);
            listaInteiros.add(i);  
        }

        System.out.println("Lista de inteiros original: " + listaInteiros);
        //Ordenação da lista usando o método sort da classe Collections
        Collections.sort(listaInteiros);
        System.out.println("Lista de inteiros ordenada: " + listaInteiros);

//--------------------------------------------------------------------------------------------
        //Declaração de uma lista de títulos usando a interface List e a implementação ArrayList
        List listaTitulos = new ArrayList();
        listaTitulos.add(new Titulo("O Senhor dos Anéis", 1954));
        listaTitulos.add(new Titulo("A Sociedade do Anel", 1954));
        listaTitulos.add(new Titulo("As Duas Torres", 1954));
        listaTitulos.add(new Titulo("O Retorno do Rei", 1955));

        System.out.println("Lista de títulos original: " + listaTitulos);
        //Ordenação da lista de títulos usando o método sort da classe Collections, que utiliza o método compareTo da classe Titulo para comparar os nomes dos títulos
        Collections.sort(listaTitulos);
        System.out.println("Lista de títulos ordenada: " + listaTitulos);

//--------------------------------------------------------------------------------------------
        //Declaração de uma lista de frutas usando a interface List e a implementação ArrayList
        List trocaLista = new ArrayList();
        trocaLista.add("Banana");
        trocaLista.add("Abacaxi");
        trocaLista.add("Laranja");
        System.out.println("Lista de frutas com ArrayList: " + trocaLista);

        //Instanciação de uma nova lista usando a implementação LinkedList, passando a lista anterior como parâmetro para o construtor, o que cria uma nova lista com os mesmos elementos
        trocaLista = new LinkedList(trocaLista);
        System.out.println("Lista de frutas com LinkedList: " + trocaLista);

    }
}