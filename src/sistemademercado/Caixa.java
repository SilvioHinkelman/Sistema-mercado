package sistemademercado;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Caixa extends Funcionario {

    boolean erro;
    Scanner ler = new Scanner(System.in);

    public Caixa(String nome, String cpf, double salario, int matricula) {
        super(nome, cpf, salario, matricula);
    }

    public void CadastroCaixa() {
        erro = false;
        try {
            System.out.println("Insira os dados do novo caixa:");
            System.out.println("Nome: ");
            setNome(ler.nextLine());
            System.out.println("Cpf: ");
            setCpf(ler.nextLine());
            System.out.println("Salário: ");
            setSalario(ler.nextDouble());
            System.out.println("Cadastro efetuado com sucesso");
        } catch (InputMismatchException aa) {
            erro = true;
            System.out.println("ERRO AO DIGITAR VALOR DE SALÀRIO INVÀLIDO");
            System.exit(0);
        }
    }
}
