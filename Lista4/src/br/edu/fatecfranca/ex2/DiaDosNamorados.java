package br.edu.fatecfranca.ex2;

public class DiaDosNamorados extends CartaoWeb{
    //construtores
    public DiaDosNamorados() {
        super();
    }

    public DiaDosNamorados(String destinatario) {
        super(destinatario);
    }

    @Override
    public void showMessage() {
        System.out.println("Feliz dia dos Namorados " + this.getDestinatario() + "!");
    }
}
