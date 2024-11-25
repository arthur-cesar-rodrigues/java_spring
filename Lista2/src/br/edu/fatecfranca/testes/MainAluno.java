package br.edu.fatecfranca.testes;


import br.edu.fatecfranca.ex02.Aluno;

public class MainAluno {
    public static void main(String[] args) {
        Aluno aluno1  = new Aluno();

        aluno1.setNumAluno(102030);

        aluno1.setNome("Arthur");

        aluno1.setIdade(20);

        aluno1.setP1(5.4F);

        aluno1.setP2(8.0F);

        System.out.println(aluno1);


    }
}
