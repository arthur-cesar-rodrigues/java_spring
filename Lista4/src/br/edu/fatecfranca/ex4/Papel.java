package br.edu.fatecfranca.ex4;

public class Papel extends Coisa{
    @Override
    public String confronto(Coisa adversario) {
        if(adversario instanceof Papel) return  "Empate! Papel empata com papel !";
        if(adversario instanceof Tesoura) return  "Tesoura corta papel! Tesoura vence.";
        if(adversario instanceof Pedra) return "Papel envolve pedra. Papel vence";
        return  "";
    }

}
