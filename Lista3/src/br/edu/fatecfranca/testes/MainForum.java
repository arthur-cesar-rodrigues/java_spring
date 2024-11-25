package br.edu.fatecfranca.testes;

import br.edu.fatecfranca.ex1.Forum;
import br.edu.fatecfranca.ex1.Person;

public class MainForum {
    public static void main(String[] args) {
        Person arthur = new Person(1, "Arthur César",
                "beckenbauer_de_campinas");

        Person beckenbauer = new Person(5, "Franz Beckenbauer",
                "franz_beckenbauer_official");

        Forum forum1 = new Forum(10, "Fórum Reclamações",
                "https://forum_reclamacoes-10.com");

        forum1.addMessage(100, "Estou descontente com este fórum," +
                " não me ajudou em nada até agora, apenas para treinar agregação" +
                " e composição em Java.", arthur);

        forum1.addMessage(101, "Dieser Typ namens Arthur ist nicht nur" +
                " überheblich und Beschwerdeführer, sondern benutzt auch meinen" +
                " Namen. Ich werde ihn wegen Urheberrechtsverletzung verklagen.",
                beckenbauer);

        System.out.println(forum1);
    }
}
