package br.edu.fatecfranca.ex0;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ShoppingCart {
    private int id;
    private Date data;
    private String destino, formaPagto;
    private float precoTotal;
    //declarando um vetor
    private List<CarItem> carItens;

    public ShoppingCart() {
        this.carItens = new ArrayList<CarItem>();//aloca espaço no vetor, linha obrigatoria para construtor scom ouem parametro para vetor
    }

    public ShoppingCart(int id, Date data, String destino, String formaPagto, float precoTotal) {
        this.id = id;
        this.data = data;
        this.destino = destino;
        this.formaPagto = formaPagto;
        this.precoTotal = precoTotal;
        this.carItens = new ArrayList<CarItem>();// aloca espaço para o vetor
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getData() {
        return this.data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getDestino() {
        return this.destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getFormaPagto() {
        return this.formaPagto;
    }

    public void setFormaPagto(String formaPagto) {
        this.formaPagto = formaPagto;
    }

    public float getPrecoTotal() {
        return this.precoTotal;
    }

    public void setPrecoTotal(float precoTotal) {
        this.precoTotal = precoTotal;
    }

    public List<CarItem> getCarItens() {
        return carItens;
    }

    //método que vai adicionar um item no carrinho de compra
    public void addCarItem(int id, int quantity, Product product) {
        this.carItens.add(new CarItem(id, quantity, product));
    }

    public void calculateTotalPrice() {
        float soma = 0.0F;
        for (CarItem carItem : carItens) {
            soma += carItem.getQuantity() * carItem.getProduct().getPrice();
        }
        this.precoTotal = soma;
    }

    @Override
    public String toString() {
        return "ShoppingCart{" +
                "id=" + this.id +
                ", data=" + this.data +
                ", destino='" + this.destino + '\'' +
                ", formaPagto='" + this.formaPagto + '\'' +
                ", precoTotal=" + this.precoTotal +
                ", carItens=" + carItens +
                '}';
    }
}
