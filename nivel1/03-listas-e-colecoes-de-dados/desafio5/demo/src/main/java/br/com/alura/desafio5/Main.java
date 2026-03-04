package br.com.alura.desafio5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import br.com.alura.desafio5.model.Cartao;
import br.com.alura.desafio5.model.Compra;

public class Main {
    public static void main(String[] args) {
        //Cria um novo objeto do tipo Cartao e solicita o limite do cartão
        Cartao cartao = new Cartao();
        System.out.println("Digite o limite do cartão de crédito:");
        Scanner scanner = new Scanner(System.in);
        cartao.setLimite(scanner.nextDouble());

        //Cria uma lista utilizando interface List para armazenar as compras realizadas, e um menu para realizar as compras
        List compras = new ArrayList<>();
        int menu = 0;
        while (menu != 2) {
            System.out.println("Digite 1 para realizar uma compra ou 2 para sair:");
            menu = scanner.nextInt();
            if (menu == 1) {
                //Limpa o buffer do scanner para evitar problemas na leitura dos dados
                scanner.nextLine();
                //Cria um objeto do tipo Compra
                Compra compra = new Compra();

                //Solicita nome do produto e seta ao objeto criado acima
                System.out.println("Digite o nome do produto:");
                String nome = scanner.nextLine();
                compra.setNomeProduto(nome);

                //Solicita o valor do produto e seta ao objeto criado acima
                System.out.println("Digite o valor do produto:");
                double valor = scanner.nextDouble();
                compra.setValor(valor);

                //Realiza a compra utilizando o método 
                if(cartao.realizarCompra(compra)){
                    //Adiciona a compra à lista de compras
                    compras.add(compra);
                }
            }
        }
        //Utiliza a Classe Collections para ordenar a lista de compras. O método sort espera como parâmetro uma lista de objetos que implementam a interface Comparable. Compra implementa Comparable e sobrescreve o método compareTo.
        Collections.sort(compras);
        //Impressão da lista de compras ordenada, utilizando o toString sobrescrito
        System.out.println("Compras realizadas: \n" + compras);
    }
}