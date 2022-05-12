package sistemademercado;

import java.util.Scanner;
import java.util.Collection;
import java.util.ArrayList;
import java.util.InputMismatchException;

public class SistemaDeMercado {

    public static void main(String[] args) {
        int validarSenha;
        int acha;
        int menu = 0;
        Gerente g1 = new Gerente(0123, "SILVI", "009033654-06", 0, 0);
        Collection<Caixa> cadastro = new ArrayList();
        Scanner ler = new Scanner(System.in);

        System.out.println("Cadastre seu Gerente");
        g1.CadastroGerente();
        g1.ExibirGerente();
        System.out.println("Gerente Cadastrado com Sucesso");
        System.out.println("\n=====================================\n");
        System.out.println("Informe sua Senha para entrar no Menu");
        validarSenha = ler.nextInt();
        if (g1.confereSenha(validarSenha)) {
            System.out.println("Bem Vindo Sr. " + g1.getNome());
            do {
                boolean erro = false;
                try {
                    System.out.println("\n\tEscolha uma das opções Gerente");
                    System.out.println("1 - Cadastrar Caixa");
                    System.out.println("2 - Exibir Caixa(s)");
                    System.out.println("3 - Remover Caixa");
                    System.out.println("4 - Valor da Participação de Lucros Anual");
                    System.out.println("0 - SAIR");
                    menu = ler.nextInt();
                } catch (InputMismatchException aa) {
                    erro = true;
                    System.out.println("\n\tVocê Informou Valor Inválido no Menu Principal");
                    System.exit(0);
                }
                System.out.println("\n=====================================\n");
                System.out.println(" ");
                switch (menu) {
                    case 1:                                 //cadastrar caixas
                        Caixa cc = new Caixa("", "", 0, 0);
                        cc.CadastroCaixa();
                        cadastro.add(cc);
                        System.out.println("\n=====================================\n");
                        break;
                    case 2:                                 //listagem dos caixas
                        if (cadastro.isEmpty() == true) {
                            System.out.println("Nenhum Caixa Cadastrado no Sistema");
                            System.out.println(" ");
                        } else {
                            System.out.println("Caixa(s) Cadastrados \n");
                            for (Caixa dados : cadastro) {
                                System.out.println("Nome: " + dados.getNome());
                                System.out.println("CPF: " + dados.getCpf());
                                System.out.println("Matrícula: " + dados.getMatricula());
                                System.out.println("=====================================");
                            }
                        }
                        break;
                    case 3:                                 //exclui caixas
                        System.out.println("Para Exclui Caixa Informe nº da Matrícula ");
                        acha = ler.nextInt();
                        for (Caixa dados : cadastro) {
                            if (acha == dados.getMatricula()) {
                                System.out.println("Caixa a Excluir --> " + dados.getMatricula() + "\n");
                                cadastro.remove(dados);
                                System.out.println("Caixa Excluido com Sucesso\n");
                                break;
                            } else {
                                System.out.println("Caixa NÂO Existente\n");
                                System.out.println(" ");
                            }
                        }
                        break;

                    case 4:
                        System.out.println("\tGerente");
                        g1.ExibirGerente();
                        System.out.println("Valor de Valor da Participação de Lucros Anual");
                        System.out.println("Valor do Bônus Anual R$:" + g1.getParticipacaoDeLucroAnual());
                        System.out.println("=====================================");
                        System.out.println("\tCaixas");
                        for (Caixa dados : cadastro) {
                            System.out.println("=====================================");
                            System.out.println("Nome: " + dados.getNome());
                            System.out.println("CPF: " + dados.getCpf());
                            System.out.println("Matrícula: " + dados.getMatricula());
                            System.out.println("Valor do Bônus Anual R$: " + dados.getParticipacaoDeLucroAnual());

                        }
                        break;
                    case 0:                             //saida do programa
                        System.out.println("\nPrograma finalizado!!!");
                        break;
                    default:
                        System.out.println("\nOpção Inválida\nTente novamente\n");
                }
            } while (menu != 0);
        } else {
            System.out.println("\t->> SENHA INVÁLIDA....");
            System.out.println("\t->> PROGRAMA ENCERRADO...");

        }

    }

}

/*(0,5 pt) O sistema deve ter um menu de opções (no mínimo 3) para acesso as
funcionalidades
• (0,5 pt) O projeto deve ter mínimo três classes
• (0,5 pt) Deve possuir construtor específico (não utilizar construtor padrão)
• (0,5 pt) Deve ser aplicado o conceito de encapsulamento e o mesmo deve ser
utilizado corretamente
• (0,5 pt) Deve possuir no mínimo um atributo e um método estático
• (0,5 pt) No mínimo um método com retorno de valor
• (0,5 pt) No mínimo um método com passagem de parâmetros
• (0,5 pt) No mínimo um método sem retorno de valor
• (0,5 pt) No mínimo um método sem passagem de parâmetros
• (1,0 pt) Deve ser utilizado ArrayList
• (1,0 pt) Deve ser utilizada uma associação entre classe ou conceito de herança
• (1,0 pt) Deve ser utilizado o conceito de sobrecarga, sobrescrita e polimorfismo
• (1,0 pt) Aplicar no mínimo um tratamento de exceções                                      está  na classe gerente ao cadastrar uma string no salario
• (1,0 pt) Deve ter uma classe abstrata e um método abstrato
(0,5 pt) Pertinência do tema, organização do código, complexidade da regra de
negócio, execução do sistema.
 */
