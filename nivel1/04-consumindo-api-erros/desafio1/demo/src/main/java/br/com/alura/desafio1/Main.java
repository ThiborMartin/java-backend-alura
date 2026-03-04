package br.com.alura.desafio1;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException{
        Scanner leitura = new Scanner(System.in);
        String urlGoogleString = "https://www.googleapis.com/books/v1/volumes?q=";
        System.out.println("Digite o nome de um livro: ");
        urlGoogleString += leitura.nextLine();

        HttpClient clienteGoogle = HttpClient.newHttpClient();
        HttpRequest requestGoogle = HttpRequest.newBuilder()
                    .uri(URI.create(urlGoogleString))
                    .build();
        HttpResponse<String> responseGoogle = clienteGoogle
                    .send(requestGoogle, HttpResponse.BodyHandlers.ofString());
        System.out.println(responseGoogle.body());

//------------------------------------------------------------------------------------

        String urlCoinGecko = "http://";
        System.out.println("Digite o nome de uma criptomoeda: ");
        urlCoinGecko += leitura.nextLine();


    }
}