package br.edu.fatecfranca;

public class Rio {
    //declaração dos atributos
    public String nome;
    public float nivel;
    public boolean poluido;

    //método construtor sem parâmetros
    public Rio() {
        this.nome = "Rio inexistente";
        this.nivel = 0;
        this.poluido = false;
    }

    //método cosntrutor com parâmetros
    public Rio(String nome, float nivel, boolean poluido) {
        this.nome = nome;
        this.nivel = nivel;
        this.poluido = poluido;
    }

    public  String void chover(float aumentoPorcentagem) {
        if (this.nome != "Rio inexistente") {
            if(this.nivel + aumentoPorcentagem <= 100) {
                this.nivel += aumentoPorcentagem;
                System.out.println("Alteração do nível do rio feita com sucesso!!! O nível do " + this.nome + " aumentou " + aumentoPorcentagem + "%.");
            } else {
                System.out.println("Erro!!! O nível do rio precisa estar entre 0 e 100%.");
            }
        } else {
            System.out.println("Erro!!! O rio informado não exite.");
        }
    }

    public void ensolarar(float dimiuiPorcentagem) {
        if (this.nome != "Rio inexistente") {
            if(this.nivel - dimiuiPorcentagem >= 0) {
                this.nivel -= dimiuiPorcentagem;
                System.out.println("Alteração do nível do rio feita com sucesso!!! O nível do " + this.nome + " diminuiu " + dimiuiPorcentagem + "%.");
            } else {
                System.out.println("Erro!!! O nível do rio precisa estar entre 0 e 100%.");
            }
        } else {
            System.out.println("Erro!!! O rio informado não exite.");
        }
    }

    public void limpar() {
        if (this.nome != "Rio inexistente") {
            if (this.poluido) {
               this.poluido = false;
                System.out.println("O " + this.nome + " foi limpo!");
            } else {
                System.out.println("O " + this.nome + " já está limpo!");
            }
        } else {
            System.out.println("Erro!!! O rio informado não exite.");
        }
    }

    public void sujar() {
        if (this.nome != "Rio inexistente") {
            if (!this.poluido){
                this.poluido = true;
                System.out.println("O " + this.nome + " foi poluído!");
            } else {
                System.out.println("O " + this.nome + " já está poluído!");
            }
        } else {
            System.out.println("Erro!!! O rio informado não exite.");
        }
    }

    public void mostra() {
        System.out.println();
        System.out.println("Nome: " + this.nome + ".");
        System.out.println("Nível do rio em (%): " + this.nivel + "%.");
        if (this.nome != "Rio inexistente") {
            if (!this.poluido) {
                System.out.println("Situação:  LIMPO.");
            } else {
                System.out.println("Situação: SUJO.");
            }
        } else {
            System.out.println("Situação: ERRO.");
        }
        System.out.println();
    }
}
