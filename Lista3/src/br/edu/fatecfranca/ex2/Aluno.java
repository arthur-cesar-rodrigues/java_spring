package br.edu.fatecfranca.ex2;

public class Aluno {
    private int id;
    private String name, userName;

    public Aluno() {
    }

    public Aluno(int id, String name, String userName) {
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

    public void setUsername(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "\nAluno{" +
                "id=" + this.id +
                ", nome='" + this.name + '\'' +
                ", username='" + this.userName + '\'' +
                '}';
    }
}
