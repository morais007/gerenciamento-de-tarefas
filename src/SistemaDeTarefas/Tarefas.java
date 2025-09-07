package SistemaDeTarefas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tarefas {

    List<String> listaTarefas = new ArrayList<>();

    public List<String> adicionarTarefas(String addTarefa){
        listaTarefas.add(addTarefa);
        System.out.println("tarefa adicionada com sucesso");
        return listaTarefas;
    }

    public void listarTarefas() {
        System.out.println(listaTarefas);
    }

    public void tarefasConcluidas(String concluidas){
       listaTarefas.remove(concluidas);
       System.out.println(" tarefa removida");

    }

    public void sair(){
        System.out.println("Sair");
        System.out.println("Programa encerrado.");
    }

}
