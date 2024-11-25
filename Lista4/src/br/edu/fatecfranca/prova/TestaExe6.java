package br.edu.fatecfranca.prova;

public class TestaExe6 {
    public static void main(String[] args) {
        Veiculo obj1 = new Carro();
        System.out.println(obj1.toString());

        obj1 = new Moto();
        System.out.println(obj1.toString());//isso é polimorfismo, o obj1 é um objeto do tipo veiculo, e se comporta como carro e depois moto
    }
}
