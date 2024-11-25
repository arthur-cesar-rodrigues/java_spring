package br.edu.fatecfranca.testes;

import br.edu.fatecfranca.ex7.Cartao;
import br.edu.fatecfranca.exe5.Conta;

public class MainCC {
    public static void main(String[] args) {
        Conta conta1 = new Conta("Arthur", 1750.0f, "123", 400.0f, 100.0f);

        Cartao cartao_conta1 = new Cartao(conta1, 123);

        cartao_conta1.retirada(123, 200);
        cartao_conta1.alteraSenha(123, 679);
        cartao_conta1.saldo(679);
    }
}
