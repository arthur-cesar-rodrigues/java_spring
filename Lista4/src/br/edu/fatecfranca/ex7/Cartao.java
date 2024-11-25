package br.edu.fatecfranca.ex7;

import br.edu.fatecfranca.exe5.Conta;

public class Cartao {
    //atributos
    private Conta contaCartao;
    private int senha;

    //construtores
    public Cartao() {
    }

    public Cartao(Conta contaCartao, int senha) {
        this.contaCartao = contaCartao;
        this.setSenha(senha);
    }

    private void setSenha(int senha) {
        this.senha = senha;
        System.out.println("Senha alterada com sucesso!");
    }

//    //método que vincula uma conta ao cartao
//    public void setContaCartao(Conta contaCartao) {
//        this.contaCartao = contaCartao;
//    }

    //método que altera a senha
    public void alteraSenha(int senhaAntiga, int senhaNova) {
        if (this.senhaCorreta(senhaAntiga)) this.setSenha(senhaNova);
        else System.out.println("Senha incorreta");
    }

    private boolean senhaCorreta(int senha) {
        return senha == this.senha;
    }

    public void retirada(int senha, float valor) {
        if (this.senhaCorreta(senha)) System.out.println(this.contaCartao.sacar(valor));
        else System.out.println("Senha incorreta");
    }

    public void saldo(int senha) {
        if (this.senhaCorreta(senha)) System.out.println("Seu saldo é " + this.contaCartao.getSaldo());
        else System.out.println("Senha incorreta");
    }


}
