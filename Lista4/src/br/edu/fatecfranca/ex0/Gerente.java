package br.edu.fatecfranca.ex0;

public class Gerente extends Funcionario{
    private float bonus;

    //construtor sem parâmetros
    public Gerente() {
        super();
        this.bonus = 0.0F;
    }

    //construtor com parâmetro
    public Gerente(String nome, String endereco, String cpf, float salario, float bonus) {
        super(nome, endereco, cpf, salario);
        this.bonus = bonus;
    }

    //getters e setters (apenas do atributo bonus, porque os outros atributos já possuem esses métodos na classe pai - funcionario)
    public float getBonus() {
        return bonus;
    }

    public void setBonus(float bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return super.toString() + "\nBonus: " + bonus;
    }

    @Override//foi usado o override para não usar o método com o mesmo nome da classe pai
    // (calcula salariio) porque neste exercício é o meétodo que está presente em todas as
    //  classes filhas, porém em todas o processamento de dados é diferente em cada filho (atributo e calculos)
    public float calculaSalario() {
        return this.salario + this.bonus;
    }
}
