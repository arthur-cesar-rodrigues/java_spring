package br.edu.fatecfranca.ex03;

public class JogadorFutsal implements Convocado {
    private String nomeJogador, nomeSelecao;

    public JogadorFutsal() {
    }

    public JogadorFutsal(String nomeJogador, String nomeSelecao) {
        this.nomeJogador = nomeJogador;
        this.nomeSelecao = nomeSelecao;
    }

    public String getNomeJogador() {
        return nomeJogador;
    }


    public void setNomeJogador(String nomeJogador) {
        this.nomeJogador = nomeJogador;
    }

    public String getNomeSelecao() {
        return nomeSelecao;
    }

    public void setNomeSelecao(String nomeSelecao) {
        this.nomeSelecao = nomeSelecao;
    }

    @Override
    public void convocar() {
        System.out.println(this.getNomeJogador() + " foi convocado pela Seleção " + this.getNomeSelecao() + " para a Copa do Mundo de Futsal!");
    }

    @Override
    public void ganharCopa() {
        System.out.println(this.getNomeJogador() + " ganhou a Copa do Mundo de Futsal pela seleção " + this.getNomeSelecao() + "!!!");
    }

    @Override
    public void desclassificadoCopa() {
        System.out.println("A seleção " + this.getNomeSelecao() + " foi desclassificada da Copa do Mundo de Futsal.");
    }

}
