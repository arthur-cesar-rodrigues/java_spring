package br.edu.fatecfranca.ex2;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    private int id;
    private String name, area;
    private List<Disciplina> disciplina = new ArrayList<Disciplina>();

    public Curso() {
    }

    public Curso(int id, String name, String area) {
        this.id = id;
        this.name = name;
        this.area = area;
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

    public String getArea() {
        return this.area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public List<Disciplina> getDisciplina() {
        return this.disciplina;
    }

    @Override
    public String toString() {
        return "\nCurso{" +
                "id='" + this.id + '\'' +
                ", name='" + this.name + '\'' +
                ", area='" + this.area + '\'' +
                ", disciplina=" + this.disciplina +
                '}';
    }

    public void addDisciplina(int id, String name, String sigla, Professor professor){
        this.disciplina.add(new Disciplina(id, name, sigla, professor));
    }

    public void addAlunoDisciplina(int idDisplina, Aluno aluno){
        for(Disciplina disciplina : disciplina){
            if(disciplina.getId() == idDisplina){
                disciplina.addAluno(aluno);
                return;
            }
        }
        System.out.println("Disciplina não existe.");
    }
}
