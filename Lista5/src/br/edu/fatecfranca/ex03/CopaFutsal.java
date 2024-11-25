package br.edu.fatecfranca.ex03;

public class CopaFutsal {
    public void participar(Convocado c) {
        c.convocar();
    }

    public void campeao(Convocado c) {
        c.ganharCopa();
    }

    public void desclassificado(Convocado c) {
        c.desclassificadoCopa();
    }
}
