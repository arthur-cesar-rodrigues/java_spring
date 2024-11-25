package br.edu.fatecfranca.testes;

import br.edu.fatecfranca.ex6.ContaEspecial;
import br.edu.fatecfranca.exe5.Conta;

public class TesteContas {
    public static void main(String[] args) {
        Conta normal = new Conta("Arthur", 1750, "123", 120, 100);
        System.out.println(normal.getLimite());

        ContaEspecial especial = new ContaEspecial("Alcides", 2000, "456", 120, 3000);
        System.out.println(especial.getLimite());

    }
}
