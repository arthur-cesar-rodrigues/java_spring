package br.edu.fatecfranca.testes;

import br.edu.fatecfranca.ex0.JogadorFutebol;
import br.edu.fatecfranca.ex0.TriAtleta;

public class TestaAtleta {
    public static void main(String[] args) {
        JogadorFutebol beckenbauerCampineiro;

        //triatleta executando um método de cada interface
        TriAtleta triAtleta = new TriAtleta("Arthur");
        triAtleta.recepcionar();
        triAtleta.cobrarEscanteio();
        triAtleta.darToco();

        //quando a sobrescrição ocorrer em cima de uma variável
        // tipada com a interface, como é o caso do beckenbauerCampineiro,
        // a classe só poderá executar os métodos da classe que
        // foi implementada inicialmente, e mais nenhuma
        beckenbauerCampineiro = new TriAtleta("ValdiviaPP");
        beckenbauerCampineiro.cobrarPenalti();
        beckenbauerCampineiro.cobrarEscanteio();

//        beckenbauerCampineiro.recpcionar(); = essa linha nao vai funcionar

    }
}
