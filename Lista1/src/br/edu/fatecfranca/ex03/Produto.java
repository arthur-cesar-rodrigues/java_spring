package br.edu.fatecfranca.ex03;

public class Produto {
    //declação das variáveis de instância
    public int id, qtde;
    public String descricao;
    public float preco;

    //método construtor sem parâmetro
    public Produto() {
    }

    //método construtor com parâmetro
    public Produto(int id, String descricao, int qtde, float preco) {
        this.id = id;
        this.descricao = descricao;
        this.qtde = qtde;
        this.preco = preco;
    }

    //método de compra
    public void comprar(int x) {
        this.qtde += x;
    }

    //método de venda
    public void vender(int x) {
        if (this.qtde - x >= 0) {
            this.qtde -= x;
        } else {
            System.out.println("Estoque insuficiente!");
        }
    }

    //método aumenta o preço do produto
    public void subir(float x) {
        this.preco += x;
    }

    //mét. diminui o preço do produto
    public void descer(int x) {
        if (this.preco - x > 0) {
            this.preco -= x;
        } else {
            System.out.println("Erro ao alterar o preço");
        }
    }

    public String mostra() {
        if (this.descricao == null) {
            this.qtde = 0;
            this.preco = 0;
        }
        return "ID: " + this.id + "\nDescrição: " + this.descricao + "\nQuantidade: " + this.qtde + "\nPreço: R$" + this.preco;
    }
}
