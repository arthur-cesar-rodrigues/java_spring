package polimorfismo;

public class Canguru extends Mamifero {
    //construtores
    public Canguru() {
    }

    public Canguru(float peso, int idade, int membros, String corPelo) {
        super(peso, idade, membros, corPelo);
    }

    public void usarBolsa() {
        System.out.println("Usando Bolsa.");
    }

    @Override
    public void locomover() {
        System.out.println("Saltando!");
    }

}
