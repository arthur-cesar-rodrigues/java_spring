package br.edu.fatecfranca.ex01;

public class Aluno {
    //declarando os atributos do objeto
    public int numeroAluno, idade;
    public String nome;
    public float p1, p2;

    //método construtor sem parâmetros (caso não seja informado os valores)
    public Aluno() {
    }

    //método construtor com parâmetros (mais comum)
    public Aluno(int numeroAluno, String nome, int idade, float p1, float p2) {
        this.numeroAluno = numeroAluno;
        this.nome = nome;
        this.idade = idade;
        this.p1 = p1;
        this.p2 = p2;
    }

    //método que retorna a média do aluno (sem void porque possui return)
    public float notaFinal() {
        return (this.p1 + this.p2) / 2;
    }

    //método que retorna os dados do aluno (numero Aluno, nome e idade), como se fosse um toString
    public String dadosAluno() {
        return "Número aluno: " + this.numeroAluno + " Nome: " + this.nome + " Idade: " + this.idade;
    }

    //método passou que retorna se o aluno passou ou não (média > 6)
    public String passou() {
        return this.notaFinal() >= 6 ? "Aprovado!" : "Reprovado!";
    }

}
