package br.edu.fatecfranca;

public class TestaCliente {
    public static void main(String[] args){
        //instanciando o objeto cliente Fulano, da classe Cliente
        Cliente correntistaFulano = new Cliente("02564564-8", 5050, "Fulano", 200);

        correntistaFulano.realizarDeposito(200);
        correntistaFulano.realizarSaque(250);
        correntistaFulano.minhaConta();

        //instanciando o objeto cliente Beltrano, da classe Cliente
        Cliente correntistaBeltrano = new Cliente("45678959-9", 5682, "Beltrano", 2);

        correntistaBeltrano.realizarDeposito(250);
        correntistaBeltrano.realizarSaque(160);
        correntistaBeltrano.minhaConta();

        Cliente correntistaVarzea = new Cliente();
        correntistaVarzea.realizarDeposito(50);
        correntistaVarzea.realizarSaque(10);
        correntistaVarzea.minhaConta();

    }

}
