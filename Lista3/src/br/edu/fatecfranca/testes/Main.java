package br.edu.fatecfranca.testes;

import br.edu.fatecfranca.ex0.Product;
import br.edu.fatecfranca.ex0.ShoppingCart;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Product prod1 = new Product(1, "Bola de Basquete", 400);
        Product prod2 = new Product(2, "Bola de Futebol", 300);
        Product prod3 = new Product(3, "Bola de Volei", 200);

        ShoppingCart cart1 = new ShoppingCart(100, new Date(), "Franca",
                "Pix", 0);

        cart1.addCarItem(10, 2, prod1);
        cart1.addCarItem(12, 5, prod2);
        cart1.calculateTotalPrice();
        System.out.println(cart1);

        ShoppingCart cart2 = new ShoppingCart(101, new Date(), "Ipuã",
                "CC", 0);
        cart2.addCarItem(11, 4, prod1);
        cart2.addCarItem(13, 10, prod3);
        cart2.calculateTotalPrice();
        System.out.println(cart2);

    }
}