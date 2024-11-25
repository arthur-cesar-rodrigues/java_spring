package br.edu.fatecfranca.ex6;

import br.edu.fatecfranca.exe5.Conta;

public class ContaEspecial extends Conta {
    //contrutorores

    public ContaEspecial() {
        super();
    }

    public ContaEspecial(String nome, float salario, String numConta, float saldo, float limite) {
        super(nome, salario, numConta, saldo, limite);
    }

    @Override
    public void setLimite(float limite) {
        if(limite <= (this.getSalario() * 3)) this.limite = limite;
    }
}
