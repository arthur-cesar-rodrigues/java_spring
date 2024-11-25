package polimorfismo;

public abstract class Animal {
    //atributos
    protected float peso;
    protected int idade, membros;


    //construtores
    public Animal() {
    }

    public Animal(float peso, int idade, int membros) {
        this.peso = peso;
        this.idade = idade;
        this.membros = membros;
    }

    //getters e setters
    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getMembros() {
        return membros;
    }

    public void setMembros(int membros) {
        this.membros = membros;
    }

    //métodos abstratos
    public abstract void locomover();
    public abstract void alimentar();
    public abstract void emitirSom();

}
