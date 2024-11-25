package br.edu.fatecfranca.ex0;

public class TriAtleta implements JogadorFutebol, JogadorBasquete, JogadorVolei{
    //atributos
    String name;

    //construtores
    public TriAtleta() {
    }

    public TriAtleta(String name) {
        this.name = name;
    }


    @Override
    public void cobrarPenalti() {
        System.out.println(this.name + " bateu penâlti.");
    }

    @Override
    public void cobrarEscanteio() {
        System.out.println(this.name + " cobrou  escanteio.");
    }

    @Override
    public void sacar() {
        System.out.println(this.name + " sacou.");
    }

    @Override
    public void recepcionar() {
        System.out.println(this.name + " fez uma manchete.");
    }

    @Override
    public void arremessar() {
        System.out.println(this.name + " arremessou.");
    }

    @Override
    public void darToco() {
        System.out.println(this.name + " deu toco.");
    }
}
