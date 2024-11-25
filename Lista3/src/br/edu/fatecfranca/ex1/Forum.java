package br.edu.fatecfranca.ex1;

import java.util.ArrayList;
import java.util.List;

public class Forum {
    //declarando os atributos
    private int id;
    private String name, url;
    private List<Message> message = new ArrayList<Message>();

    //construtor sem parâmetro
    public Forum() {
    }

    //constutor com parâmetro
    public Forum(int id, String name, String url) {
        this.id = id;
        this.name = name;
        this.url = url;
    }

    //getters e setters
    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public List<Message> getMessage() { return this.message; }

    @Override
    public String toString() {
        return "\nForum{" +
                "id=" + this.id +
                ", name='" + this.name + '\'' +
                ", url='" + this.url + '\'' +
                ", message=" + this.message +
                '}';
    }

    public void addMessage(int id, String text, Person person)  {
        this.message.add(new Message(id, text, person));
    }
}
