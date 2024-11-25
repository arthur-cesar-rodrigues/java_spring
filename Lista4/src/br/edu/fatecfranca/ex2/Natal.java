package br.edu.fatecfranca.ex2;

public class Natal extends CartaoWeb{
    //construtores

    public Natal() {
        super();
    }

    public Natal(String destinatario) {
        super(destinatario);
    }

    @Override
    public void showMessage() {
        System.out.println("Feliz Natal " + this.getDestinatario() + "!");
    }
}
