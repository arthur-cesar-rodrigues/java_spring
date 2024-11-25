package br.edu.fatecfranca.ex1;

public class Palco {

    private Ator ator = new AtorFeliz();

    public void altera(){
        if(this.ator instanceof AtorFeliz) this.ator = new AtorTriste();//this.objeto instanceof classe= se o objeto é uma instância de tal classe
        else this.ator = new AtorFeliz();
    }

    public void atuar() {
        this.ator.ato();//polimorfismo
    }

}
