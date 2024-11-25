package polimorfismo;

public class Mamifero extends Animal {
    //atributos
    private String corPelo;

    //construtores
    public Mamifero() {
        super();
    }

    public Mamifero(float peso, int idade, int membros, String corPelo) {
        super(peso, idade, membros);
        this.corPelo = corPelo;
    }

    //getters e setters
    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }

    //métodos sobrepostos da classe pai(animal)
    @Override
    public void locomover() {
        System.out.println("Correndo!");
    }

    @Override
    public void alimentar() {
        System.out.println("Mamando.");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de Mamifero.");
    }
}
