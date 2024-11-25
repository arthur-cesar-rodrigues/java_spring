package br.edu.fatecfranca.teste;

import br.edu.fatecfranca.ex03.Produto;

public class TestaProduto {
    public static void main(String[] args) {
        //instanciando objeto  erro sem parametro
        Produto erro = new Produto();

        //chamando os metodos com o objeto erro
        erro.comprar(1);
        erro.vender(1);
        erro.subir(1);
        erro.descer(1);

        //mostrando todas as informações do objeto erro
        System.out.println(erro.mostra());

        //instanciando objeto com parâmetro
        Produto produto = new Produto(1, "celular", 5, 340);

        System.out.println();

        //chamando os metedos com o objeto produto
        produto.comprar(1);
        produto.vender(1);
        produto.subir(1);
        produto.descer(1);

        //mostrando todas as informações do objeto produto
        System.out.println(produto.mostra());


    }

}
