package polimorfismo;

public class Peixe extends Animal {
    //atributos
    private String corEscama;

    //construtores
    public Peixe() {
        super();
    }

    public Peixe(float peso, int idade, int membros, String corEscama) {
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

    //método exclusivo da classe peixe
    public void soltarBolha(){
        System.out.println("Soltou uma bolha.");
    }

    //métodos sobrepostos da classe pai(animal)
    @Override
    public void locomover() {
        System.out.println("Nadando!");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo Substâncias.");
    }

    @Override
    public void emitirSom() {
        System.out.println("Peixe não faz som.");
    }
}
