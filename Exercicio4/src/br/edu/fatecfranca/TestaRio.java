package br.edu.fatecfranca;

public class TestaRio {
    public static void main(String[] args) {
        //instanciando objeto com parametro
        Rio capivari = new Rio("Rio Capivari", 45, true);

        //instanciando objeto sem parâmetro
        Rio capiva = new Rio();

        //usando os metedos nos 2 objetos (com e sem parametros)
        capivari.chover(10);
        capivari.ensolarar(7);
        capivari.limpar();
        capivari.limpar();
        capivari.sujar();
        capivari.chover(90);
        capivari.mostra();

        capiva.chover(70);
        capiva.ensolarar(2);
        capiva.sujar();
        capiva.limpar();
        capiva.mostra();
    }
}
