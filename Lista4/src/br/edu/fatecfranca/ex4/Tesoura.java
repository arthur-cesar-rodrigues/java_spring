package br.edu.fatecfranca.ex4;

public class Tesoura extends Coisa{
    @Override
    public String confronto(Coisa adversario) {
        if(adversario instanceof Papel) return "Tesoura corta papel! Tesoura vence.";
        if(adversario instanceof Tesoura) return "Empate! Tesoura empata com tesoura.";
        if(adversario instanceof Pedra) return "Pedra quebra Tesoura. Pedra vence!";
        return "";
    }

}
