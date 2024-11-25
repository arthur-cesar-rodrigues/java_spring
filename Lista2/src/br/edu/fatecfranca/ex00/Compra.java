package br.edu.fatecfranca.ex00;

public class Compra {
    private float valor;
    private int qtde;
    private String situacao;

    public Compra() {
    }

    public Compra(float valor, int qtde, String situacao) {
        //this.valor = valor;
        //this.qtde = qtde;
        //this.situacao = situacao;

        //como estamos usando variáveis privadas precisamos chamar o set para dentro do método construtor
        //isso para verificar antes o valor, para ver se ele se enxcaixa no padrão daquela variavel, ex abaixo:
        this.setValor(valor);
        this.setQtde(qtde);
        this.setSituacao(situacao);
    }


    //o nome de todo método set precisa começar com o set + o nome da variavel que vai setar (cria uma restrição para variavel, aceita apenas valores válidos, todo set precisa de void)
    //toda variavel precisa de um set especifico
    public void setValor(float valor) {
        if (valor > 0.0F){
            this.valor = valor;
        } else {
            System.out.println("Valor invalido");
            this.valor = 0.0F;
        }
    }

    public void setQtde(int qtde) {
        if (qtde > 0){
            this.qtde = qtde;
        } else {
            System.out.println("Qtde invalido");
            this.qtde = 0;
        }
    }

    //dado.equals("valor") = esse método é idêntico ao "===" (extramente igual) do js, ou seja, ele ve se o valor dentro do parentese é igual ao valor do dado que chamou o equals; e para ver se um valor é extramementediferente(!==), é do usar: !dado.equals("valor")
    //.equals só verifica so checa strings
    public void setSituacao(String situacao) {
        if (!situacao.equals("Aprovado") && !situacao.equals("Reprovado") && !situacao.equals("Pendente")) {
            System.out.println("Situacao inválida");
            this.situacao = "Reprovado";
        } else this.situacao = situacao;
    }

    //criando os getters (mesmo esquema que o setters, uma para cada variavel privada, get + nome da variavel que vai ser retornada)
    //o get retorna o valor da variavel, nao usa void já que possui um return

    public float getValor() { return this.valor; }

    public int getQtde() { return this.qtde; }

    public String getSituacao() { return this.situacao; }

    @Override
    public String toString() {
        if (this.situacao == null) this.situacao = "Reprovado";
        return "Compra{" + "valor=" + this.valor + ", qtde=" + this.qtde + ", situacao='" + this.situacao + "'}";
    }
}
