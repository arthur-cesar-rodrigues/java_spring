package br.edu.fatecfranca.ex1;

public class Person {
    //declarando os atributos
    private int id;
    private String name, user;

    //construtor sem parâmetros
    public Person() {
    }

    //construtor com parâmetros
    public Person(int id, String name, String user) {
        this.id = id;
        this.name = name;
        this.user = user;
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

    public String getUser() {
        return this.user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "\nPerson{" +
                "id=" + this.id +
                ", name='" + this.name + '\'' +
                ", user='" + this.user + '\'' +
                '}';
    }
}
