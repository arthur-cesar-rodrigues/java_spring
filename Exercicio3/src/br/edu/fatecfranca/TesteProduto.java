package br.edu.fatecfranca;

public class TesteProduto {
    public static void main(String[] args) {
        //instanciando objeto com construtor com parâmetros
        Produto notebookAcer = new Produto(1, "notebook_acer", 7, 2789);

        //instanciando objeto com construtor sem parâmetros
        Produto notebooquiEiser = new Produto();

        //usando os métodos no objeto com parâmetros
        notebookAcer.comprar(15);
        notebookAcer.vender(50);
        notebookAcer.subir(199);
        notebookAcer.descer(4000);
        notebookAcer.mostra();

        //usando os métodos no objeto sem parâmetros
        notebooquiEiser.comprar(2);
        notebooquiEiser.vender(1);
        notebooquiEiser.subir(5);
        notebooquiEiser.descer(3);
        notebooquiEiser.mostra();
    }
}
