package br.edu.fatecfranca.exe3;

public class Radio extends Produto {
    //atributos
    private String estacao, banda;

    //construtores
    public Radio() {
        super();
        this.estacao = "94.9 FM";
        this.banda = "Indieanos";
    }

    public Radio(int numSerial, int volume, String estacao, String banda) {
        super(numSerial, volume);
        this.trocaEstacao(estacao);
        this.trocaBanda(banda);
    }

    //getters e setters
    public String getEstacao() {
        return estacao;
    }

    public String getBanda() {
        return banda;
    }

    public void trocaEstacao(String estacao) {
        this.estacao = estacao;
    }

    public void trocaBanda(String banda) {
        this.banda = banda;
    }

    public String Escutar() {
        return "A rádio na estação " + this.estacao + " está tocando a banda " + this.banda;
    }

    @Override
    public String toString() {
        return super.toString()  + " estacao=" + estacao + ", banda=" + banda;
    }
}
