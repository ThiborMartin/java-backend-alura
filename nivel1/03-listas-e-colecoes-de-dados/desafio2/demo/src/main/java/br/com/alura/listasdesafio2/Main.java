package br.com.alura.listasdesafio2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Cria uma lista de objetos do tipo Produto
        ArrayList<Produto> produtos = new ArrayList<>();

        //Instancia e inicializa objetos do tipo Produto
        Produto produto1 = new Produto("Arroz", 20.60, 500);
        Produto produto2 = new Produto("Feijão", 16.60, 325);
        Produto produto3 = new Produto("Café", 20.60, 123);

        //Adiciona os objetos acima criados, na lista de produtos
        produtos.add(produto1);
        produtos.add(produto2);
        produtos.add(produto3);

        //Printa o tamanho da lista utilizando formatted e passando como parâmetro o método size() que retorna int
        System.out.println("Tamanho da lista de produtos: %d".formatted(produtos.size()));

        //Utiliza for each pra percorrer toda a lista, atribuindo os objetos dela a um objeto do tipo Produto, chamado produto
        for(Produto produto : produtos){
            System.out.println(produto);
        }

        //Instancia e inicializa objetos do tipo ProdutoPerecivel utilizando o construtor da superclasse junto a mais um atributo anoValidade
        ProdutoPerecivel produtoPerecivel1 = new ProdutoPerecivel("Manteiga", 15.39, 30, 2026);
        System.out.println(produtoPerecivel1);
    }
}