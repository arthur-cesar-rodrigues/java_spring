package br.edu.fatecfranca.ex3;

import java.util.Date;

public class Reservation {
    //atributos
    private int id;
    private Date date;
    private Flight flight;
    private Passanger passanger;

    //construtor sem parâmetro
    public Reservation() {
    }

    //constructor com parâmetro
    public Reservation(int id, Date date, Flight flight, Passanger passenger) {
        this.id = id;
        this.date = date;
        this.flight = flight;
        this.passanger = passenger;
    }

    //getters e setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public void setPassenger(Passanger passanger) {
        this.passanger = passanger;
    }

    @Override
    public String toString() {
        return "\nReservation{" +
                "id=" + id +
                ", date=" + date +
                ", flight=" + flight +
                ", passenger=" + passanger +
                '}';
    }

}
