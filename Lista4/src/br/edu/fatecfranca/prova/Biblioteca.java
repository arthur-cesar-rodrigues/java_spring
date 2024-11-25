package br.edu.fatecfranca.prova;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private String nome;
    private List<Livro> livros = new ArrayList<Livro>();

    public void addLivro(String titulo) {
        this.livros.add(new Livro(titulo));
    }
}
