package br.edu.fatecfranca.ex01;

public   class Cliente {
    //declarando as variáveis de instância(privadas)
    private String numeroConta, numeroAgencia, nome;
    private float saldo;

    //criando o método construtor sem parâmetros
    public Cliente(){
        this.numeroConta = "não definido";
        this.numeroAgencia = "não definido";
        this.nome = "não definido";
        this.saldo = 0.0F;
    }

    //criando o método construtor com parâmetro
    public Cliente(String numeroConta, String numeroAgencia, String nome, float saldo) {
        this.setNumConta(numeroConta);
        this.setNumAgencia(numeroAgencia);
        this.setNome(nome);
        this.setSaldo(saldo);
    }

    //criando os setters

    //setter do número da conta (precisa ter tamanho 8, e no indice 6 == "-")
    public void setNumConta(String numeroConta) {
        if (numeroConta.length() == 8)
            if (numeroConta.charAt(6) == '-') this.numeroConta = numeroConta;
            else{
                this.numeroConta = "";
                System.out.println("Traço incorreto");
            }
        else {
            this.numeroConta = "";
            System.out.println("Tamanho diferetnte de 8.");
//                this.numeroConta = "XXXXXX-X";
        }
    }

    //setter do número da agância (precisa ter tamanho 6, e no indíce 4 == "-")
    public void setNumAgencia(String numeroAgencia) {
        //if (numeroAgencia.length() == 6 && numeroAgencia.charAt(4) == '-') this.numeroAgencia = numeroAgencia;
        if (numeroAgencia.length() == 6)
            if (numeroAgencia.charAt(4) == '-') this.numeroAgencia = numeroAgencia;
            else {
                this.numeroAgencia = "";
                System.out.println("Traço incorreto");
            }
        else {
            this.numeroAgencia = "";
            System.out.println("Tamanho diferente de 6.!!");
        }
            //this.numeroAgencia = "XXXX-X";
    }


    //setter do nome (o nome não pode ultrapassar 31 caracteres)
    public void setNome(String nome) {
        if (nome.length() < 31) this.nome = nome;
        else {
            System.out.println("Nome inválido!!");
            this.nome = "";
        }
    }

    //setter do saldo (não pode ser negativo)
    public void setSaldo(float saldo) {
        //if (!this.numeroConta.equals("XXXXXX-X")) { }
        if (saldo >= 0.0F) this.saldo = saldo;
        else System.out.println("Saldo inválido");

    }

    //criando os getters
    public String getNumConta() { return this.numeroConta; }

    public String getNumAgencia() { return this.numeroAgencia; }

    public String getNome() { return this.nome; }

    public float getSaldo() { return this.saldo; }

    //método de depósito
    public void realizarDeposito(float valor) {
        //if (!this.numeroConta.equals("XXXXXX-X")) this.saldo += valor;
        this.setSaldo(this.saldo + valor);
    }
    //if (valor > 0.0F) this.saldo += valor;
    //else System.out.println("Valor de depósito inválido");

    //método de saque
    public void realizarSaque(float valor) {
        //if (!this.numeroConta.equals("XXXXXX-X")) {
        //}
        //if ((this.saldo - valor) >= 0.0F) this.saldo -= valor;
        //else System.out.println("Saldo inválido");
        this.setSaldo(this.saldo - valor);
    }

    //método toString para ver os dados do cliente
    @Override
    public String toString() {
        return "Cliente{" + "numeroConta=" + this.numeroConta + ", numeroAgencia=" + this.numeroAgencia + ", nome=" + this.nome  + ", saldo=" + this.saldo + '}';
    }
}
