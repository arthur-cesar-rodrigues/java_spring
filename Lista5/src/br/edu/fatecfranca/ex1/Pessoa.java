package br.edu.fatecfranca.ex1;

public class Pessoa extends Animal implements Cidadao, Contribuinte, Professor {

    @Override
    public void vota() {
        System.out.println("Pessoa votou");
    }

    @Override
    public void tiraRG() {
        System.out.println("Pesssoa tirou RG");
    }
    @Override
    public void pagaIR() {
        System.out.println("Pessoa pagou o IR");
    }

    @Override
    public void tiraCPF() {
        System.out.println("Pessoa tirou CPF");
    }

    @Override
    public void ensina() {
    System.out.println("Pessoa ensina");
    }

    @Override
    public void trabalha() {
        System.out.println("Pessoa trabalhou");
    }
}
