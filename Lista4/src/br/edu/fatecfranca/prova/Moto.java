package br.edu.fatecfranca.prova;

public class Moto extends Veiculo{
    private float cilindradas;

    public Moto() {
        super();
    }

    public Moto(String marca, String modelo, float cilindradas) {
        super(marca, modelo);
        this.cilindradas = cilindradas;
    }

    @Override
    public String toString() {
        return super.toString() + this.cilindradas;
    }
}
