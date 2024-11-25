package br.edu.fatecfranca.testes;

import br.edu.fatecfranca.ex00.Compra;

public class MainCompra {
    public static void main(String[] args) {
        Compra obj1 = new Compra(200, 2, "Aprovado");
        System.out.println("obj1");
        System.out.println(obj1 + "\n");
        Compra obj2 = new Compra();

        //quando a variavel é public, permite a alteração dos valores da variavel mesmo os valores não sendo válidos ou não (para resolver isso precisa mudar as variaveis para private), alterando os valores abaixo:

        //obj2.qtde= -10;
        //obj2.valor = -200;
        //obj2.situacao = "Bugada";


        System.out.println("obj2");
        obj2.setQtde(-10);
        obj2.setValor(-200.0F);
        obj2.setSituacao("Bugada");
        System.out.println(obj2 + "\n");

        //para atribuir valores em uma variavel é necessário usar o "set" e criar na classe o método set

        Compra obj3 = new Compra();
        obj3.setQtde(10);
        obj3.setValor(10.0F);
        obj3.setSituacao("Aprovado");
        System.out.println("obj3");
        System.out.println(obj3 + "\n");
        //toda vez que da um print (sout) no obj (ex: System.out.println(objeto), ele ja chama o toString automaticamente

        //para ver o valor da variavel privada, precisa criar um get para cada variavel

        //quando a variavel é privada, é necessário chamar o método set de cada variavel dentro do método construtor, isso tudo para checar se o valor é valido antes de atribuir ele a variavel do objeto

        System.out.println("Qtde de obj1: " + obj1.getQtde() + "\n");//forma de ver o valor de uma variavel privada (o get retorna o valor da variavel)

        Compra obj4 = new Compra(-30.0F, 4, "bugado");
        System.out.println("obj4");
        System.out.println(obj4);



    }
}