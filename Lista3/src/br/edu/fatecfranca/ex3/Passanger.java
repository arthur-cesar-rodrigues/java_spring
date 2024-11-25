package br.edu.fatecfranca.ex3;

public class Passanger {
    //declaração dos atributos
    private int id;
    private String name, cpf;

    //construtor sem parâmetro
    public Passanger() {
    }

    //construtor com parâmetro
    public Passanger(int id, String name, String cpf) {
        this.id = id;
        this.name = name;
        this.cpf = cpf;
    }

    //getters e setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "\nPassanger{" +
                "id=" + this.id +
                ", name='" + this.name + '\'' +
                ", cpf='" + this.cpf + '\'' +
                '}';
    }
}
