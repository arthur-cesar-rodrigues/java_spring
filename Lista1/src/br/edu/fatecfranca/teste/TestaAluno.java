package br.edu.fatecfranca.teste;

import br.edu.fatecfranca.ex01.Aluno;

public class TestaAluno {
    public static void main(String[] args) {
        //instanciando objetos
        Aluno arthur = new Aluno(2, "Arthur", 20, 6.2f, 8.9f);

        Aluno pedro = new Aluno(23, "Pedro", 32, 7, 9);

        //chamando o método nota final
        System.out.println(arthur.notaFinal());
        System.out.println(pedro.notaFinal());

        //chamando o método dados aluno
        System.out.println(arthur.dadosAluno());
        System.out.println(pedro.dadosAluno());

        //chamando método passou
        System.out.println(arthur.passou());
        System.out.println(pedro.passou());
    }
}
