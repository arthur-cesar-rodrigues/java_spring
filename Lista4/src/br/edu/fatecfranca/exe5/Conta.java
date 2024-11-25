package br.edu.fatecfranca.exe5;

public class Conta {
    //atributos
    protected String nome, numConta;
    protected float salario, saldo, limite;

    //construtores
    public Conta() {
    }

    public Conta(String nome, float salario, String numConta, float saldo, float limite) {
        this.nome = nome;
        this.salario = salario;
        this.numConta = numConta;
        this.saldo = saldo;
        this.setLimite(limite);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getNumConta() {
        return numConta;
    }

    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }

    public float getSaldo() {
        return this.saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        if(limite <= this.salario) this.limite = limite;
    }

    public void depositar(float valor) {
        this.saldo += valor;
    }

    public boolean sacar(float valor) {
        if (valor > this.saldo) return false;
        this.saldo -= valor;
        return true;
    }

    public float saldoAtual() {
        return this.getSaldo();
    }
}
