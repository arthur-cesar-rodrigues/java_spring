package br.edu.fatecfranca;

public class Produto {
    public int id, qtde;
    public String descricao;
    public float preco;

    //criando um método construtor caso o objeto instancia não possuir valor ou for falso
    public Produto() {
        this.id = -1;
        this.descricao = "Produto inválido";
        this.qtde = 0;
        this.preco = 0;
    }

    //criando um método construtor para atribuir valor ao objeto
    public Produto(int id, String descricao, int qtde, float preco) {
        this.id = id;
        this.descricao = descricao;
        this.qtde = qtde;
        this.preco = preco;
    }

    public void comprar(int x) {
        if(this.id != -1){
            this.qtde += x;
            System.out.println("Compra de " + x + " " + this.descricao + " feita com sucesso!!!");
        } else {
            System.out.println("Erro ao comprar!! Produto inválido.");
        }
    }

    public void vender(int x) {
        if(this.id != -1){
            if(this.qtde >= x) {
                this.qtde -= x;
                System.out.println("Venda de "+ x + " " + this.descricao + " feita com sucesso!!!");
            } else {
                System.out.println("Erro!! Estoque insuficiente (quantidade: " + this.qtde + ").");
            }
        } else {
            System.out.println("Erro ao vender!! Produto inválido.");
        }
    }

    public void subir(float x) {
        if(this.id != -1){
            this.preco += x;
            System.out.println("Preço alterado com sucesso!!! O preço do produto " + this.descricao + " aumentou R$ " + x + ".");
        } else {
            System.out.println("Erro!! Produto inválido.");
        }
    }

    public void descer(int x){
        if(this.id != -1){
            if(this.preco > x) {
                this.preco -= x;
                System.out.println("Preço alterado com sucesso!!! O preço do produto " + this.descricao + " diminuiu R$ " + x + ".");
            } else {
                System.out.println("Falha ao diminuir o preço!!! Valor informado maior que o valor do produto (R$ " + this.preco + ").");
            }
        }
    }

    public void mostra() {
        System.out.println();
        System.out.println("INFORMAÇÕES DO PRODUTO");
        System.out.println("ID do produto: " + this.id + ".");
        System.out.println("Descrição: " + this.descricao + ".");
        System.out.println("Quantidade: " + this.qtde + ".");
        System.out.println("Preco: R$ " + this.preco + ".");
        System.out.println();
    }
}
