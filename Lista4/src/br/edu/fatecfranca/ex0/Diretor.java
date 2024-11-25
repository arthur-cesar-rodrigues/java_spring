package br.edu.fatecfranca.ex0;

public class Diretor extends Funcionario{
    private float acoesEmpresa;

    //construtor sem parâmetros
    public Diretor() {
        super();
        this.acoesEmpresa = 0.0F;
    }

    public Diretor(String nome, String endereco, String cpf, float salario, float acoesEmpresa) {
        super(nome, endereco, cpf, salario);
        this.acoesEmpresa = acoesEmpresa;
    }

    //getters e setters
    public float getAcoesEmpresa() {
        return acoesEmpresa;
    }

    public void setAcoesEmpresa(float acoesEmpresa) {
        this.acoesEmpresa = acoesEmpresa;
    }

    @Override
    public String toString() {
        return super.toString() +"\nAcões empresa: " + this.acoesEmpresa;
    }

    @Override
    public float calculaSalario() {
        return this.salario + ((this.acoesEmpresa * 2)/12);
    }

}
