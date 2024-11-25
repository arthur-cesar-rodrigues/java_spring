package br.edu.fatecfranca.testes;

import br.edu.fatecfranca.ex3.Flight;
import br.edu.fatecfranca.ex3.Passanger;
import br.edu.fatecfranca.ex3.Reservation;
import java.util.Date;

public class MainReservation {
    public static void main(String[] args) {
        Flight voo1 = new Flight(1, "Franca", "Campinas");
        Passanger arthur = new Passanger(1, "Arthur", "392.936.648-79");
        Reservation reserva1 = new Reservation(200, new Date(), voo1, arthur);

        System.out.println(reserva1);
    }
}
