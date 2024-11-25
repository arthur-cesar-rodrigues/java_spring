package br.edu.fatecfranca.ex1;

public class Message {
    //declarando os atributos
    private int id;
    private String text;
    private Person person;

    //construtor sem parâmetro
    public Message() {
    }

    //construtor sem parâmetro
    public Message(int id, String text, Person person) {
        this.id = id;
        this.text = text;
        this.person = person;
    }

    //getters e setters

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getText() {
        return this.text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Person getPerson() {
        return this.person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return "\nMessage{" +
                "id=" + this.id +
                ", text='" + this.text + '\'' +
                ", person=" + this.person +
                '}';
    }
}
