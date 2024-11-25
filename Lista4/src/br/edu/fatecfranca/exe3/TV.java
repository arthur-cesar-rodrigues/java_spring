package br.edu.fatecfranca.exe3;

public class TV extends Produto{
    //atributos
    private String canal;

    //construtores

    public TV() {
        super();
        this.trocaCanal("Espn");
    }

    public TV(int numSerial, int volume, String canal) {
        super(numSerial, volume);
        this.trocaCanal(canal);
    }

    //getters e setters
    public String getCanal() {
        return canal;
    }

    public void trocaCanal(String canal) {
        this.canal = canal;
    }

    //métodos especiais
    public String Assitir(){
        return "Estou assintindo o canal " + this.getCanal() + "!";
    }

    @Override
    public String toString() {
        return super.toString() + " canal= " + this.getCanal();
    }
}
