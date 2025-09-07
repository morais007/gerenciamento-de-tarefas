package SistemaDeTarefas;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        try {
            Tarefas tarefa = new Tarefas();

            System.out.println("Escolha uma opcao: ");
            int opcao;
            do {
                System.out.println("# 1 : Adicionar Tarefa");
                System.out.println("# 2 : Listar Tarefas");
                System.out.println("# 3 : Remover Tarefas");
                System.out.println("# 0 : Sair");

                opcao = sc.nextInt();

                switch (opcao) {
                    case 1:
                        System.out.print("Adicione uma tarefa a lista: ");
                        sc.nextLine();
                        String addTarefa = sc.nextLine();
                        tarefa.adicionarTarefas(addTarefa);
                        break;
                    case 2:
                        tarefa.listarTarefas();
                        break;
                    case 3:
                        System.out.println("Qual tarefa Concluio: ");
                        String concluidas = sc.next();
                        tarefa.tarefasConcluidas(concluidas);
                        break;
                    case 0:
                        tarefa.sair();
                        break;
                    default:
                        System.out.print("Nenuma opcao escolida, tente novamente.");
                }
            } while (opcao != 0);

            sc.close();
        }
        catch (InputMismatchException e){
            System.out.println("Opcao ivalida, tente novamente.");

        }





    }
}
