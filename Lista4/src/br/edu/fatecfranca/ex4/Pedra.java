package br.edu.fatecfranca.ex4;

public class Pedra extends Coisa{
    @Override
    public String confronto(Coisa adversario) {
        if(adversario instanceof Papel) return "Papel envolve pedra. Papel vence!";
        if(adversario instanceof Tesoura) return "Pedra quebra Tesoura. Pedra vence!";
        if(adversario instanceof Pedra) return "Empate! Pedra empata com pedra.";
        return  "";
    }

}
