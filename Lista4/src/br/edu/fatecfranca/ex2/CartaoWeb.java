package br.edu.fatecfranca.ex2;

public abstract class CartaoWeb {
    //declarando os atributos
    protected String destinatario;

    //construtores
    public CartaoWeb() {
    }

    public CartaoWeb(String destinatario) {
        this.destinatario = destinatario;
    }

    //getters e setters
    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    //método abstrato
    public abstract void showMessage();



}
