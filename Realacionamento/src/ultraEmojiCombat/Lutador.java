package ultraEmojiCombat;

public class Lutador {
    //Atributos
    private String nome, nacionalidade, categoria;
    private int idade, vitorias, derrotas, empates;
    private float altura, peso;

    //métodos construtores
    //sem parâmetro
    public Lutador() {
    }

    //com parâmetro
    public Lutador(String nome, String nacionalidade, int idade, float altura, float peso, int vitorias, int derrotas, int empates) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        setPeso(peso);
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
        //não foi criado o parâmetro categoria, porque ele vai ser setado/definido
        //através do valor do peso, ou seja, o setCategoria vai ser chamado dentro
        //do setPeso, e com isso para ninguém definir a categoria, seu set vai ser
        //privado chamado apenas quando o peso for informado
        //porque a lógica seria que ao inserir o peso do lutador, o programa
        //calculasse automaticamente a sua categoria conforme seu peso
    }

    //getters e setters
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return this.nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return this.altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return this.peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public String getCategoria() {
        return this.categoria;
    }

    private void setCategoria() {
        if (this.getPeso() < 52.2) this.categoria = "Inválido";
        else if (this.getPeso() <= 70.3) this.categoria = "Leve";
        else if (this.getPeso() <= 83.9) this.categoria = "Médio";
        else if (this.getPeso() <= 120.2) this.categoria = "Pesado";
        else this.categoria = "Inválido";
    }

    public int getVitorias() {
        return this.vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return this.derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return this.empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    //Métodos Públicos
    public void ganharLuta(){
        this.setVitorias(this.getVitorias() + 1);
    }

    public void perderLuta(){
        this.setDerrotas(this.getDerrotas() + 1);
    }

    public void empatarLuta(){
        this.setEmpates(this.getEmpates() + 1);
    }


    //Métodos Especiais
    public String apresentar(){
        return "CHEGOU A HORA! Apresentamos o lutador " + this.getNome() + ".\n" +
                "Diretamente de " + this.getNacionalidade() + " com " + this.getIdade() +
                " anos e " + this.getAltura() + " M de altura,  pesando " + this.getPeso()
                + " KG." + "\n" +  this.getVitorias() + " vitórias.\n"
                +  this.getDerrotas() + " derrotas.\n" + this.getEmpates() + " empates.";
    }

    public String status(){
        return this.getNome() + " é um peso " + this.getCategoria() + ".\n" + "Ganhou " +
                this.getVitorias() + " vezes." + "\n" + "Perdeu " +  this.getDerrotas() +
                " vezes." + "\n" + "Emaptou " + this.getEmpates() + " vezes.";
    }


}
