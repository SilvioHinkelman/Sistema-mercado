package sistemademercado;

public abstract class Funcionario {

    private String nome;
    private String cpf;
    double salario;
    private int matricula;
    private static int auxMatricula = 1;

    public Funcionario(String nome, String cpf, double salario, int matricula) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
        this.matricula = gerarMatricula();
    }

    public double getParticipacaoDeLucroAnual() {
        return getSalario() * 0.2;
    }

    private static int gerarMatricula() {
        return auxMatricula++;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

}
