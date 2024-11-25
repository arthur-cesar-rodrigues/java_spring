package br.edu.fatecfranca.ex2;

public class Professor {
    private int id;
    private String name, userName;

    public Professor() {
    }

    public Professor(int id, String name, String userName) {
        this.id = id;
        this.name = name;
        this.userName = userName;
    }

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

    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "\nProfessor{" +
                "id=" + this.id +
                ", name='" + this.name + '\'' +
                ", userName='" + this.userName + '\'' +
                '}';
    }
}
