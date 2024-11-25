package polimorfismo;

public class Reptil extends Animal {
    //atributos
    private String corEscama;

    //construtores
    public Reptil() {
        super();
    }

    public Reptil(float peso, int idade, int membros, String corEscama) {
        super(peso, idade, membros);
        this.corEscama = corEscama;
    }

    //getters e setters

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

    //métodos sobrepostos da classe pai(animal)
    @Override
    public void locomover() {
        System.out.println("Rastejando!");
    }

    public void alimentar() {
        System.out.println("Comendo vegetais.");
    }

    public void emitirSom() {
        System.out.println("Som de Réptil!");
    }
}
