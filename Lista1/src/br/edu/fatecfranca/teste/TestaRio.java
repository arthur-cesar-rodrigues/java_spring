package br.edu.fatecfranca.teste;

import br.edu.fatecfranca.ex04.Rio;

public class TestaRio {
    public static void main(String[] args) {
        //instanciando objeto com parâmetro
        Rio capivari = new Rio("Capivari", 70, true);

        //instanciando objeto sem parâmetros
        Rio capy = new Rio();

        //chamando os métodos com o objeto capivari
        capivari.chover(4);
        capivari.ensolarar(8);
        capivari.limpar();
        capivari.sujar();
        System.out.println(capivari.mostra());

        System.out.println();//pulando uma linha para dar uma separada entre os 2 objetos

        //chamando os métodos com o objeto capivari
        capy.chover(4);
        capy.ensolarar(8);
        capy.limpar();
        capy.sujar();
        System.out.println(capy.mostra());




    }
}
