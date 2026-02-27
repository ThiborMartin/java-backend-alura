package br.com.alura.desafio3;

import java.util.ArrayList;

import br.com.alura.desafio3.interfaces.Forma;
import br.com.alura.desafio3.models.Animal;
import br.com.alura.desafio3.models.Cachorro;
import br.com.alura.desafio3.models.Circulo;
import br.com.alura.desafio3.models.ContaBancaria;
import br.com.alura.desafio3.models.Produto;
import br.com.alura.desafio3.models.Quadrado;

public class Main {
    public static void main(String[] args) {
        //Criação de ArrayList para objetos da Classe String
        ArrayList<String> lista = new ArrayList<>();

        //Adição de objetos na lista
        lista.add("Ford");
        lista.add("General Motors");
        lista.add("Volkswagen");

        //forEach que percorre toda a lista, a variável item aponta para os objetos percorridos. Não é preciso declarar seu tipo, o java deduz automaticamente (type inference). Em seguida está a ação a ser executada. Lambda eu acho que é uma função sem nome que pode receber um parâmetro 
        lista.forEach(item -> System.out.println(item));

// -------------------------------------------------------------------------------------
        //Criando objeto cachorro e inicializando os valores
        Cachorro cachorro = new Cachorro(4, 4, 24, "Fred", "João");

        //Criando variável animal do tipo Animal que está recebendo a instância de um objeto Cachorro. Isso significa que o nosso cachorro agora pode ser referenciado pela variável animal também, já que o objeto é um só.
        Animal animal = (Animal) cachorro;

        //Na Classe Cachorro, eu sobrescrevi o método toString() para printar o nome e o dono. Mesmo usando a variável animal na função println, o método toString() usado é o da Classe Cachorro e não da Animal. Isto ocorre, novamente frisando, porque a variável animal faz referência a um objeto do tipo Cachorro já instanciado.
        System.out.println(animal);

        //Aqui criamos uma variável do tipo Animal que vai referenciar um objeto do tipo Cachorro, isto é possível por conta da herança entre Animal e Cachorro. O contrário, não funcionaria, já que nem todo animal é um cachorro. A mesma regra do toString() descrita acima vale pra cá
        Animal animal1 = new Cachorro(4, 4, 24, "Romeu", "Carlos");

        //Verificamos se a variável animal1 é uma instância de um objeto do tipo Cachorro, se for, faz o cast automaticamente e atribui à nova variável cachorro1 do tipo cachorro
        if(animal1 instanceof Cachorro cachorro1){
            //Usando setter só pra testar a mudança de nome
            cachorro1.setNome("Romeu Juca");
            System.out.println(cachorro1);
        }else{
            System.out.println("Este animal não é um cachorro");
        }

//----------------------------------------------------------------------------------------
        //Criação de ArrayList de produtos
        ArrayList<Produto> produtos = new ArrayList<>();
        //Adição de produtos na lista, feito de maneira direta com o construtor cheio
        produtos.add(new Produto("Caderno", 21.9));
        produtos.add(new Produto("Lapis", 1.5));
        produtos.add(new Produto("Borracha", 3.0));
        produtos.add(new Produto("Mochila", 59.99));

        double soma  = 0;

        //forEach pra percorrer todos os objetos da lista e atribuir à variável produto
        for(Produto produto : produtos){
            soma+= produto.getPreco();
        }
        System.out.println("Preço médio de %d produtos: %f".formatted(produtos.size(), (soma/produtos.size())));

//---------------------------------------------------------------------------------------
        //Criação de ArrayList de formas
        ArrayList<Forma> formas = new ArrayList<>();
        formas.add(new Circulo(6));
        formas.add(new Circulo(2.3));
        formas.add(new Circulo(9));
        formas.add(new Quadrado(6));
        formas.add(new Quadrado(16.5));
        formas.add(new Quadrado(9));

        //forEach que percorre todos os objetos da lista
        for (Forma forma : formas) {
            //Diferencia quadrado de circulo
            if(forma instanceof Quadrado quadrado){
                System.out.println("Essa forma é um quadrado e usa área é: %.2fcm2".formatted(quadrado.calcularArea()));
            }else if (forma instanceof Circulo circulo){
                System.out.println("Essa forma é um círculo e usa área é: %.2fcm2".formatted(circulo.calcularArea()));
            }
        }

//---------------------------------------------------------------------------------------
        //ArrayList de contas
        ArrayList<ContaBancaria> contas = new ArrayList<>();
        //Adição de contas na lista
        contas.add(new ContaBancaria(1111112, 2500.68));
        contas.add(new ContaBancaria(3411116, 25000));
        contas.add(new ContaBancaria(1211817, 5090.90));
        contas.add(new ContaBancaria(8156112, 12500.68));
        contas.add(new ContaBancaria(7189132, 250));
        contas.add(new ContaBancaria(9113681, 25.6));

        ContaBancaria maiorSaldoConta = contas.get(0);

        for (ContaBancaria contaBancaria : contas) {
            if(contaBancaria.getSaldo() > maiorSaldoConta.getSaldo()) maiorSaldoConta = contaBancaria;
        }
        System.out.println("A conta com maior saldo é: %d".formatted(maiorSaldoConta.getNumeroConta()));
    }
}