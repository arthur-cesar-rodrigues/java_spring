package br.edu.fatecfranca.prova;

public class Carro extends Veiculo {
    private float caoPortaMalas;

    public Carro() {
        super();
    }

    public Carro(String marca, String modelo, float caoPortaMalas) {
        super(marca, modelo);
        this.caoPortaMalas = caoPortaMalas;
    }

    @Override
    public String toString() {
        return super.toString() + this.caoPortaMalas;
    }
}
