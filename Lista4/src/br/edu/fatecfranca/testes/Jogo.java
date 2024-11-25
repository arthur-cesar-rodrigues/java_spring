package br.edu.fatecfranca.testes;

import br.edu.fatecfranca.ex4.Coisa;
import br.edu.fatecfranca.ex4.Papel;
import br.edu.fatecfranca.ex4.Pedra;
import br.edu.fatecfranca.ex4.Tesoura;

public class Jogo {
    public static Coisa escolherCoisa() {
        int numAleatorio = (int)(Math.random() * 3) + 1;

        return switch (numAleatorio) {
            case 1 -> new Pedra();
            case 2 -> new Papel();
            case 3 -> new Tesoura();
            default -> null;
        };
    }

    public static void main(String[] args) {
        for (int i = 1; i < 11; i++) {
            Coisa c1 = escolherCoisa();
            Coisa c2 = escolherCoisa();

            System.out.println("Jogo " + i);
            System.out.println("Jogador 1: " + c1.getClass().getSimpleName());
            System.out.println("Jogador 2: " + c2.getClass().getSimpleName());
            System.out.println(c1.confronto(c2));

            System.out.println();
        }

    }
}
