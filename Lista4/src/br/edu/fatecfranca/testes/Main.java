package br.edu.fatecfranca.testes;
import br.edu.fatecfranca.ex0.Assistente;
import br.edu.fatecfranca.ex0.Diretor;
import br.edu.fatecfranca.ex0.Funcionario;
import br.edu.fatecfranca.ex0.Gerente;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void calculaFolhaSalarial(ArrayList<Funcionario> funcionarios) {
        float soma = 0;
        for (Funcionario funcionario : funcionarios) {
            soma += funcionario.calculaSalario();//polimorfismo
        }
        System.out.println(soma);
    }

    public static void mostra(Funcionario func) {
        System.out.println(func.toString());//polimorfismo
    }
    public static void main(String[] args) {
        Assistente ass1 = new Assistente("Matheus", "Franca", "123.456.789-0", 3000, 4);

        mostra(ass1);

        Gerente gerente1 = new Gerente("Pedro", "Ribeirão", "123.456.908-90", 5000, 2000);

        mostra(gerente1);//quando "mostra" (sout) uma classe, ele já chama o tostring na classe automaticamente

        Diretor diretor1 = new Diretor("Paulo", "Batatais", "098.765.432-89", 8000, 1000);

        mostra(diretor1);

        ArrayList<Funcionario> lista = new ArrayList<Funcionario>();
        lista.add(ass1);
        lista.add(gerente1);
        lista.add(diretor1);

        calculaFolhaSalarial(lista);
    }
}