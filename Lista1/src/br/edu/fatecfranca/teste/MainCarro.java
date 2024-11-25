//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
package br.edu.fatecfranca.teste;

import br.edu.fatecfranca.ex00.Carro;

import javax.swing.*;

public class MainCarro {
    public static void main(String[] args) {
        //instancia os objetos da classe carro
        Carro obj1 = new Carro("Toyota", "Corolla", "Cinza", 2018, 0);

        Carro obj2 = new Carro("Chevrolet", "Onix", "Preto", 2013, 0);


        //o metodo precisa ser chamado por um objeto, abaixo (instanciando manualmente)
        obj1.acelerar(100);
        obj1.frear(50);
        System.out.println(obj1.toString());


        //usando o método apartir da inserção dos dados do usuário importando a classe javax.swing.*;
        String aux = JOptionPane.showInputDialog("Acelerar de quanto?");
        obj2.acelerar(Float.parseFloat(aux));//convertendo para float e passando o valor de aux como valor do método acelerar
        aux = JOptionPane.showInputDialog("Frear de quanto?");
        obj2.frear(Float.parseFloat(aux));
        JOptionPane.showMessageDialog(null, obj2.toString());//mostrando ao usuario uma caixa de texto o valor retornado pelo método.toString


        //obj2.acelerar(80);
        //obj2.frear(60);
        //System.out.println(obj2.toString());

        Carro obj3 = new Carro();

        //criar no mínimo 2 classes, uma para atribuir os valores( no nosso exemplomain) e a outra para manipular os dados(no caso casoo)
        obj3.acelerar(5);


    }
}
