package br.edu.fatecfranca.testes;

import br.edu.fatecfranca.exe3.Produto;
import br.edu.fatecfranca.exe3.Radio;
import br.edu.fatecfranca.exe3.TV;

public class Controle {
    public static void main(String[] args) {
        Radio radio = new Radio(8, 60, "42.0 AM", "Paralamas do sucesso");
        System.out.println("Rádio");
        System.out.println(radio.Escutar() + "\n");

        TV tv = new TV();
        System.out.println("Tv");
        tv.setNumSerial(5);
        tv.setVolume(54);
        tv.trocaCanal("Hbo");
        tv.testaUnidade();
        System.out.println(tv.Assitir() + "\n");

        System.out.println("Polimorfismo usando o método toString:");
        System.out.println(radio.toString());//polimorfismo
        System.out.println(tv.toString());//polimorfismo

    }
}
