package br.edu.fatecfranca.ex0;
//é objeto todo para Product
public class CarItem {
    private int id;
    private int quantity;
    // agregação - objeto parte no objeto todo
    private Product product;

    public CarItem() {
    }

    public CarItem(int id, int quantity, Product product) {
        this.id = id;
        this.quantity = quantity;
        this.product = product;
        //quando o set não tem if e else (condições, retrições), atribui no construtor igual exemplo acima, quando há restrições dentro do construtor com parametros usa set no this
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Product getProduct() {
        return this.product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "CarItem{" +
                "id=" + this.id +
                ", quantity=" + this.quantity +
                ", product=" + this.product +
                '}';
    }
}
