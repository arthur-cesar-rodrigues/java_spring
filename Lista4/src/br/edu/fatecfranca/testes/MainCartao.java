package br.edu.fatecfranca.testes;

import br.edu.fatecfranca.ex2.Aniversario;
import br.edu.fatecfranca.ex2.CartaoWeb;
import br.edu.fatecfranca.ex2.DiaDosNamorados;
import br.edu.fatecfranca.ex2.Natal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MainCartao {
    public static void main(String[] args) {
        List<CartaoWeb> lista = new ArrayList();
        lista.add(new DiaDosNamorados("Sofia"));
        lista.add(new Natal("Andressa"));
        lista.add(new Aniversario("Alcides"));
//        Iterator i = lista.iterator();
//
//        while (i.hasNext()) {
//            CartaoWeb cartao = (CartaoWeb)i.next();
//            cartao.showMessage();
//        }

        for (CartaoWeb item : lista) {
            item.showMessage();
        }
    }
}
