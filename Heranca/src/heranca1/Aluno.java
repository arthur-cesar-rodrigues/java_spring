package heranca1;

public class Aluno extends Pessoa {
    private int mat;
    private String curso;

    //construtores
    public Aluno() {
        super();
    }

    public Aluno(String nome, int idade, String sexo, int mat, String curso) {
        super(nome, idade, sexo);
        this.mat = mat;
        this.curso = curso;
    }

    //getters e setters

    public int getMat() {
        return mat;
    }

    public void setMat(int mat) {
        this.mat = mat;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void cancelarMat(){
        System.out.println("Matrícula será cancelada");
    }
}
