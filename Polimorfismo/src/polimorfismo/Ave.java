package polimorfismo;

public class Ave extends Animal {
    //atributos
    private String corPena;

    //construtores
    public Ave() {
        super();
    }

    public Ave(float peso, int idade, int membros, String corPena) {
        super(peso, idade, membros);
        this.corPena = corPena;
    }

    //getters e setters
    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }

    //método exclusivo da classe Ave
    public void fazerNinho(){
        System.out.println("Construiu um ninho.");
    }

    //métodos sobrepostos da classe pai(animal)
    @Override
    public void locomover() {
        System.out.println("Voando!");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo Frutas.");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de Ave!");
    }
}
