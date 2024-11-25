package br.edu.fatecfranca.ex2;

public class Aniversario extends CartaoWeb{
    //construtores

    public Aniversario() {
        super();
    }

    public Aniversario(String destinatario) {
        super(destinatario);
    }

    @Override
    public void showMessage() {
        System.out.println("Feliz Aniversário " + this.getDestinatario());
    }
}
