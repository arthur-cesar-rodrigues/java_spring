package br.edu.fatecfranca.ex0;

public class Assistente extends Funcionario{
    private float horaExtra;

    //construtor sem parâmetros
    public Assistente() {
        super();//chama todos os atributos da superclasse(classe pai)
        this.horaExtra = 0;
    }

    public Assistente(String nome, String endereco, String cpf, float salario, float horaExtra) {
        super(nome, endereco, cpf, salario);
        this.horaExtra = horaExtra;
    }

    public float getHoraExtra() {
        return horaExtra;
    }

    public void setHoraExtra(float horaExtra) {
        this.horaExtra = horaExtra;
    }

    @Override //anula o método da classe pai
    public String toString() {
        return super.toString() + "\nHoraExtra: " + horaExtra;//pega o tostring do pai e adiciona o hora extra do filho
    }

    @Override
    public float calculaSalario() {
        return this.salario + (horaExtra * 40);
    }
}
