package br.edu.fatecfranca.ex02;

public class Cliente {
    //declaração das variaveis de instância
    public int numeroConta, numeroAgencia;
    public String nome;
    public float saldo;

    //método construtor sem parâmetros
    public Cliente() {
    }

    //método construtor com parâmetros
    public Cliente(int numeroConta, int numeroAgencia, String nome, float saldo) {
        this.numeroConta = numeroConta;
        this.numeroAgencia = numeroAgencia;
        this.nome = nome;
        this.saldo = saldo;
    }

    //método realizar depósito (void porque esse método não retorna nada)
    public void realizarDeposito(float deposito) {
        this.saldo += deposito;
        System.out.println("Depósito realizado com sucesso!");//mensagem de confirmação de deposito
    }

    //método realizar saque
    public void realizarSaque(float saque) {
        if (this.saldo - saque >= 0) {
            this.saldo -= saque;
            System.out.println("Saque realizado com sucesso!");//confirmação de saque
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    //método que retorna os dados do cliente (num. conta, nome, saldo atual)
    public String minhaConta() {
        return "Número da conta: " + this.numeroConta + " Nome: " + this.nome + " Saldo atual: R$ " + this.saldo;
    }
}
