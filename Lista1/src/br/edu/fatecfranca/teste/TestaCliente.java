package br.edu.fatecfranca.teste;

import br.edu.fatecfranca.ex02.Cliente;

public class TestaCliente {
    public static void main(String[] args) {
        //instanciando objeto fulano da classe Cliente
        Cliente fulano = new Cliente(45646, 23, "Fulano", 345.6f);

        //objeto fulano chamando os métodos
        fulano.realizarDeposito(100);
        fulano.realizarSaque(70);
        System.out.println(fulano.minhaConta());

        System.out.println();

        //instanciando objeto beltrano
        Cliente beltrano = new Cliente(89621, 78, "Beltrano", 789.1f);

        //objeto beltrano chamando os métodos
        beltrano.realizarDeposito(10);
        beltrano.realizarSaque(750);
        System.out.println(beltrano.minhaConta());
    }
}
