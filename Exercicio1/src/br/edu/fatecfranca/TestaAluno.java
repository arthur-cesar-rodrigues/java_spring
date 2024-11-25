package br.edu.fatecfranca;

public class TestaAluno {
    public static void main(String[] args) {
        //instancia os objetos da classe Aluno
        Aluno aluno1 = new Aluno(1, "Arthur", "20", 7, 8);

        Aluno aluno2 = new Aluno();

        Aluno aluno3 = new Aluno(2, "Sofia", "19", 9, 7);

        //chamando os métodos da classe aluno
        //primeiro o método dadosAluno
        //aluno1.dadosAluno();
        //aluno1.notaFinal();
        //aluno1.passou();

        //aluno2.dadosAluno();
        // aluno2.notaFinal();
        // aluno2.passou();
        // aluno3.dadosAluno();
        // aluno3.notaFinal();
       // aluno3.passou();


        System.out.println(aluno1.notaFinal());
        System.out.println(aluno2.notaFinal());
        System.out.println(aluno3.notaFinal());
        aluno1.resumo();
        aluno2.resumo();
        aluno3.resumo();
    }
}
