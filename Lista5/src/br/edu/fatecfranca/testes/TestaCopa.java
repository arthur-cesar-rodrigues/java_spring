package br.edu.fatecfranca.testes;

import br.edu.fatecfranca.ex03.CopaFutsal;
import br.edu.fatecfranca.ex03.JogadorFutsal;

public class TestaCopa {
    public static void main(String[] args) {
        JogadorFutsal arthur = new JogadorFutsal("Arthur", "Brasileira");

        CopaFutsal copa_2024 = new CopaFutsal();

        copa_2024.participar(arthur);

//        copa_2024.campeao(arthur);

        copa_2024.desclassificado(arthur);
    }
}
