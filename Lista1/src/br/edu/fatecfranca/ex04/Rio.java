package br.edu.fatecfranca.ex04;

public class Rio {
    //declaração das variáveis
    public String nome;
    public float nivel;
    public boolean poluido;

    //método constutor sem parâmetro
    public Rio() {
    }

    //método construtor com parâmetros
    public Rio(String nome, float nivel, boolean poluido) {
        this.nome = nome;
        this.nivel = nivel;
        this.poluido = poluido;
    }

    //método que aumenta o nível do rio
    public void chover(float x) {
        if (this.nivel + x <= 100) {
            this.nivel += x;
        } else {
            System.out.println("Nivel informado incorreto!!!");
        }
    }

    //método que diminui o nível do rio
    public void ensolarar(float x) {
        if (this.nivel - x >= 0) {
            this.nivel -= x;
        } else {
            System.out.println("Nivel informado incorreto!!!");
        }
    }

    //método que limpa o rio
    public void limpar() {
        this.poluido = false;
    }

    //método que suja/polui o rio
    public void sujar() {
        this.poluido = true;
    }

    //método que mostra todas info. do rio
    public String mostra() {
        if (this.nome == null) {
            this.nivel = 0;
            this.poluido = false;
        }

        return "Nome: " + this.nome + "\nNivel: " + this.nivel + "%"+ "\nPoluido: " + this.poluido;
    }

//    @Override;
//    public String toString() {;
//        if (this.nome == null) {;
//            this.nivel = 0;
//            this.poluido = false;
//        }
//        return "nome='" + this.nome + '\'' +;
//                ", nivel(%)=" + this.nivel +;
//                ", poluido=" + this.poluido;
//    };
}
