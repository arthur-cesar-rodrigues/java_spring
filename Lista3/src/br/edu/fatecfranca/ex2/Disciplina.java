package br.edu.fatecfranca.ex2;

import java.util.ArrayList;
import java.util.List;

public class Disciplina {
    private int id;
    private String name, sigla;
    private Professor professor;
    private List<Aluno> alunos = new ArrayList<Aluno>();
    //como é apenas um professor por matéria é necessário colocar apenas 1 professor
    // e como um professor pode ter mais de um aluno, o atributo aluno vira
    // um array(uma lista), para criar um array e os itens da lista (list),
    // precisa importar as classses acima
    //como vamos adicionar um aluno de cada vez, é necessário criar 3 construtores
    //um contrutor com parêmtros
    public Disciplina() {
    }

    //um construtor com todos os parâmetros
    public Disciplina(int id, String name, String sigla, Professor professor, List<Aluno> alunos) {
        this.id = id;
        this.name = name;
        this.sigla = sigla;
        this.professor = professor;
        this.alunos = alunos;
    }

    //um construtor com todos os parêmetros menos o vetor aluno
    public Disciplina(int id, String name, String sigla, Professor professor) {
        this.id = id;
        this.name = name;
        this.sigla = sigla;
        this.professor = professor;
    }

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

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    @Override
    public String toString() {
        return "\nDisciplina{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sigla='" + sigla + '\'' +
                ", professor=" + professor +
                ", alunos=" + alunos +
                '}';
    }
    //quando mostrar o professor, vai mostra o tostring dele, e dentro dessse
    // to sting vai mostrar o todos o alunos(lista) daquele proofessor

    public void addAluno(Aluno al){
        System.out.println("REs");
    }
}
