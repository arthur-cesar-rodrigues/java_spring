package br.edu.fatecfranca.ex00;

public class Carro {
// declarado das variaveis no usages
    public String marca, modelo, cor;//String é uma classe porque começa com a letra maiúscula e permite o uso de métodos
    public int ano;//int, dbl, float é um tipo primitivo, e por isso não permite o uso de métodos;
    public float velAtual;

    public Carro(){
        this.marca = ""; this.modelo = "não definido"; this.velAtual = 0;
    }

    //metodo construtor(precisam ser construídos 2: um para um objeto vazio e outro para atribuir valores ao objeto)
    //os parâmetros representam os valores (do usuário) que serão atribuídos ao objeto
    public Carro(String marca, String modelo, String cor, int ano, float velAtual){
        //this representa o objeto que chama o método
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
        this.velAtual = velAtual;
    }
    // void = metodo que nao retorna nada

    public void acelerar(float vel){
        this.velAtual += vel;
    }

    public void frear(float vel){
        if(this.velAtual - vel >= 0) {
            this.velAtual -= vel;
        } else {
            System.out.println("Velocidade não pode ser negativa");
        }
    }

    //converte o onjeto para string
    public String toString() {
        return "Marca: " + this.marca + " Modelo: " + this.modelo + " Cor: " + this.cor + " Ano: " + this.ano + " Velocidade: " + this.velAtual;
    }
}
