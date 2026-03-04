package br.com.alura.desafio2;

import br.com.alura.desafio2.dto.LivroDTO;
import br.com.alura.desafio2.dto.PessoaDTO;
import br.com.alura.desafio2.model.Editora;
import br.com.alura.desafio2.model.Livro;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {
    public static void main(String[] args) {
        String jsonPessoa = """
        {
            "nome": "Rômulo",
            "idade": 23,
            "cidade": "São Paulo"
        }
        """;
        Gson gson = new GsonBuilder()
                .setLenient()
                .create();
        PessoaDTO pessoaDTO = gson.fromJson(jsonPessoa, PessoaDTO.class);
        System.out.println(pessoaDTO);

//---------------------------------------------------------------------------------
        String jsonLivro = """
        {
            "titulo": "Pet Sematary",
            "autor": "Stephen King",
            "editora": {
                "nome": "Casa da Palavra",
                "cidade": "São Paulo"
            }
        }        
        """;
        LivroDTO livroDTO = gson.fromJson(jsonLivro, LivroDTO.class);
        Livro livro = new Livro(
            livroDTO.titulo(),
            livroDTO.autor(),
            new Editora(livroDTO.editora().nome(), livroDTO.editora().cidade())
        );
        System.out.println(livro);
    }
}