package br.edu.fatecfranca.testes;

import br.edu.fatecfranca.ex01.Cliente;

public class MainCliente {
    public static void main(String[] args) {
        //instanciando e criando objeto
        Cliente fulano = new Cliente();

        //setando os valores no objeto fulano
        fulano.setNumConta("123456-8");
        fulano.setNumAgencia("1234-6");
        fulano.setNome("Fulano");
        fulano.setSaldo(2000.0F);


        //chamando os métodos de depósito e saque
        fulano.realizarDeposito(1000.0F);
        fulano.realizarSaque(1500.0F);

        //imprimindo o objeto fulano
        System.out.println(fulano);

        //acessando as variaveis de instancia sem o get e set
        //fulano.saldo(200.0F); sem o set
//        fulano.setSaldo(200.0F); //forma correta para manipular a variavel

        //System.out.println(fulano.saldo); sem o get
//        System.out.println(fulano.getSaldo());//forma correta para retornar o valor da variavel

        //d - Dá erro ao rodar o código (não consegue encontrar o "método saldo", que na verdade é uma variavel privada), isso obriga o uso dos getters e setters para o acesso e manipulação das variáveis
        //Cliente beltrano = new Cliente(1000.0F, "Beltrano", "2345-6", "");
        Cliente beltrano = new Cliente("34534569", "2345-6", "Beltrano", 2000.0F);
        beltrano.realizarDeposito(1000.0F);
        beltrano.realizarSaque(2500.0F);
        System.out.println(beltrano);
    }

}
