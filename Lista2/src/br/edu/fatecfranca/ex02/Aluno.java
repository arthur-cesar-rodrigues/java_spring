package br.edu.fatecfranca.ex02;

public class Aluno {
    private int numeroAluno, idade;
    private String nome;
    private float p1, p2;

    //construtor sem parâmetros
    public Aluno(){
    }

    //construtor com parâmetros
    public Aluno(int numeroAluno, String nome, int idade, float p1, float p2) {
        this.setNumAluno(numeroAluno);
        this.setNome(nome);
        this.setIdade(idade);
        this.setP1(p1);
        this.setP2(p2);
    }

//    criando os setters
    public void setNumAluno(int numeroAluno) {
        if (numeroAluno >= 100000 && numeroAluno < 1000000) this.numeroAluno = numeroAluno;
    }

    public void setNome(String nome) {
        if (nome.length() <= 30) this.nome = nome;
        else System.out.println("Tamanho maior que 30");
    }

    public void setIdade(int idade) {
        if (idade > 0) this.idade = idade;
        else System.out.println("Idade menor ou igual a 0");
    }

    public void setP1(float p1) {
        if (p1 > 0.0F) this.p1 = p1;
    }

    public void setP2(float p2) {
        if (p2 > 0.0F) this.p2 = p2;
    }
//    criando os getters

    public int getNumAluno() {
        return this.numeroAluno;
    }

    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public float getP1() {
        return this.p1;
    }

    public float getP2() {
        return this.p2;
    }

    public float notaFinal() {
        return ((this.p1 + this.p2) / 2);
    }

    @Override
    public String toString() {
        return "Aluno{" + "numeroAluno=" + this.numeroAluno + ", idade=" + this.idade + ", nome='" + this.nome + ", Notafinal =" + this.notaFinal() + "}";
    }
}
