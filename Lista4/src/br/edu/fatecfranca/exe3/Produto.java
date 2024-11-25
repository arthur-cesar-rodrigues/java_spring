package br.edu.fatecfranca.exe3;

public class Produto {
    //atributos
    private int numSerial, volume;
    private String teste;
    private boolean foiTestado, resultadoTeste;

    //construtores

    public Produto() {
        this.teste = "não testado";
        this.foiTestado = false;
    }

    public Produto(int numSerial, int volume) {
        this.numSerial = numSerial;
        this.volume = volume;
    }

    //getters e setters

    public int getNumSerial() {
        return numSerial;
    }

    public void setNumSerial(int numSerial) {
        this.numSerial = numSerial;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }


    public boolean testaUnidade() {
        if(this.foiTestado) return this.resultadoTeste;

        if(Math.random() < 0.9) {
            this.teste = "aprovado";
            this.foiTestado = true;
            this.resultadoTeste = true;
            return true;
        } else {
            this.teste = "reprovado";
            this.foiTestado = true;
            this.resultadoTeste = false;
            return false;
        }
    }

    @Override
    public String toString() {
        return "Produto{" +
                "numSerial=" + numSerial +
                ", volume=" + volume +
                ", resultadoTeste=" + this.resultadoTeste +
                '}';
    }
}
