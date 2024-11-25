package br.edu.fatecfranca;

public class Cliente {
    //declaração de variáveis/atributos
    public int numeroAgencia;
    public String numeroConta, nome;
    public float saldo;

    //criando um método construtor caso haja valores falsos ou nulos nos atributos
    public Cliente(){
        this.numeroConta = "Erro!! Número conta incorreto ou inexistente.";
        this.numeroAgencia = 0;
        this.nome = "";
        this.saldo = 0;
    }

    //criando um método construtor para atribuir aos atributos do objeto
    public Cliente(String numeroConta, int numeroAgencia, String nome, float saldo) {
        this.numeroConta = numeroConta;
        this.numeroAgencia = numeroAgencia;
        this.nome = nome;
        this.saldo = saldo;
    }

    public void realizarDeposito(float deposito) {
        if(this.nome != "") {
            this.saldo += deposito;
            System.out.println("Parabéns " + this.nome + ", você depositou R$ " + deposito + " em sua conta.");
        } else {
            System.out.println("Você não possui conta neste banco.");
        }
    }

    public void realizarSaque(float saque){
        if(this.saldo >= saque){
            this.saldo -= saque;
            System.out.println("Parabéns " + this.nome + ", você sacou R$ " + saque + ".");
        } else {
            System.out.println("Você não possui saldo suficiente.");
        }
    }

    public void minhaConta() {
        System.out.println("Número da conta: " + this.numeroConta);
        System.out.println("Nome: " + this.nome);
        System.out.println("Saldo atual: " + this.saldo);
        System.out.println();
    }
}
