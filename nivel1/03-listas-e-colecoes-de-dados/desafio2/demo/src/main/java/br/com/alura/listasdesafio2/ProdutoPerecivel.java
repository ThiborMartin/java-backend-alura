package br.com.alura.listasdesafio2;

public class ProdutoPerecivel extends Produto{
    //Atributos
    private int anoValidade;

    //Construtor cheio de produto perecivel. Como esta Classe é filha de Produto, então é necessário usar o construtor da Classe-mãe
    public ProdutoPerecivel(String nome, double preco, int quantidade, int anoValidade) {
        //Utiliza o construtor da Classe-mãe, passando os parâmetros recebidos 
        super(nome, preco, quantidade);
        //Atribui o valor recebido no construtor ao atributo. Como esse atributo é uma especificidade desta Classe, a atribuição não passa por super
        this.anoValidade = anoValidade;
    }

    //Getters e Setters
    public int getAnoValidade() {
        return anoValidade;
    }
    public void setAnoValidade(int anoValidade) {
        this.anoValidade = anoValidade;
    }
}
