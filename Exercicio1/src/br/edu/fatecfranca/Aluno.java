package br.edu.fatecfranca;

public class Aluno {
    //declaração de variáveis
    public int numeroAluno;
    public String nome, idade;
    public float p1, p2;

    public Aluno() {
        this.numeroAluno = 0; this.idade = "Idade não informada"; this.p1 = 0;
        this.p2 = 0; this.nome = "Nome não informado.";
    }

    public Aluno(int numeroAluno, String nome,String idade, float p1, float p2) {
        this.numeroAluno = numeroAluno;
        this.nome = nome;
        this.idade = idade;
        this.p1 = p1;
        this.p2 = p2;
    }

    public float notaFinal() {
        //System.out.println("Média final: " + ((this.p1 + this.p2) / 2));
        float media = ((this.p1 + this.p2) / 2);
        //System.out.println("Média final: " + media);
        return media;

    }

    public void dadosAluno() {
        System.out.println("Número aluno: " + this.numeroAluno);
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
    }

    public void passou() {
        if(((this.p1 + this.p2) / 2) >= 6) {
            System.out.println("Passou!!");
        } else {
            System.out.println("Reprovou.");
        }
        System.out.println();
    }

    public void resumo() {
        dadosAluno();
        notaFinal();
        passou();
    }
}
