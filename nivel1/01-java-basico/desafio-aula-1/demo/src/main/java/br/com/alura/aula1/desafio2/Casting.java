package br.com.alura.aula1.desafio2;

public class Casting {
    public static void main(String[] args) {
        //Item 1 do desafio:
        double numero1 = 7.7;
        double numero2 = 5.9;
        System.out.println("A média de %.2f e %.2f é = %.2f".formatted(numero1, numero2, (numero1+numero2)/2));

        //Item 2 do desafio:
        double numero1db = 7.7;
        int    numero2it = 6;
        System.out.println("A média de %d e %d é = %d".formatted((int) numero1db, numero2it, ((int)numero1db + numero2it)/2));

        //Item 3 do desafio:
        char letra = 'O';
        String palavra = "automovel";
        System.out.println(letra + " " + palavra);
    }
}
