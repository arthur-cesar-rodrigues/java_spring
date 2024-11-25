package heranca1;

public class Funcionario extends Pessoa {
    private String setor;
    private boolean trabalhando;

    //construtores
    public Funcionario() {
        super();
    }

    public Funcionario (String setor, boolean trabalhando) {
        this.setor = setor;
        this.trabalhando = trabalhando;
    }

    //getters e setters

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean isTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }

    public void mudarTrabalho() {
        this.trabalhando = !this.trabalhando;
    }
}
