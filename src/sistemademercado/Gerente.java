package sistemademercado;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Gerente extends Funcionario implements ConfereSenha {

    private int senha;
    Scanner ler = new Scanner(System.in);
    boolean erro;

    public Gerente(int senha, String nome, String cpf, double salario, int matricula) {
        super(nome, cpf, salario, matricula);
        this.senha = senha;
    }

    public void CadastroGerente() {
        erro = false;
        try {
            System.out.println("Insira os dados do gerente:");
            System.out.println("Nome: ");
            setNome(ler.nextLine());
            System.out.println("Cpf: ");
            setCpf(ler.nextLine());
            System.out.println("Salário: ");
            setSalario(ler.nextDouble());
            System.out.println("Senha");
            setSenha(ler.nextInt());
        } catch (InputMismatchException aa) {
            erro = true;
            System.out.println("ERRO AO DIGITAR UM VALOR PARA SALÀRIO VÀLIDO");
            System.out.println("O PROGRAMA SERÁ FECHADO");
            System.exit(0);
        }
    }

    public void ExibirGerente() {
        System.out.println("Nome: " + getNome());
        System.out.println("CPF: " + getCpf());
        System.out.println("Matrícula: " + getMatricula());
    }

    @Override
    public boolean confereSenha(int senha) {
        if (getSenha() == senha) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public double getParticipacaoDeLucroAnual() {
        return getSalario() * 0.5;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

}
