package br.edu.fatecfranca.testes;

import br.edu.fatecfranca.ex1.Cidade;
import br.edu.fatecfranca.ex1.Empregado;
import br.edu.fatecfranca.ex1.Pessoa;

public class TestaPessoaCidade {
    public static void main(String[] args) {
        Pessoa fulano = new Pessoa();
        //a = não aconteceu nada

        Cidade rp = new Cidade();
        //b = não aconteceu nada

        rp.contrata(fulano);
        //c = o objeto fulano foi interpretado
        // como uma instancia de  professor dentro da classe Cidade e foi
        // carregado os métodos .ensina e .trabalha da classe pessoa

        rp.contrata((Empregado) fulano);
        //d= o objeto fulano foi interpretado como
        // uma instância de empregad dentro da classe Cidade e o e foi
        // carregado apenas o método .trabalha da classe pessoa

        rp.cobraDe(fulano);
        //e = o objeto fulano foi interpretado
        // como uma instância de contribuinte dentro da classe Cidade e
        // e foi carregado o método .pagaIR da classe pessoa

        rp.registra(fulano);
        //f = o objeto fulano foi interpretado como uma instância da
        // classe cidadao e foi impresso o método .tiraRG da classe pessoa

        rp.alimenta(fulano);
        //g = o objeto fulano foi interpretado como uma instância da classe
        // animal e foi impresso o método .come da classe animal que é a
        //  superclasse da classe pessoa (este método foi herdado na classe pessoa)

    }
}
