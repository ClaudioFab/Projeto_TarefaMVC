package controller;

import model.TarefaModel;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class TarefaController {

    //Lista de tarefas
    private ArrayList<TarefaModel> lista = new ArrayList<>();

    //Método cadastrar
    public void adicionar(String nome) {
        TarefaModel tarefa = new TarefaModel(nome);
        lista.add(tarefa);
    }

    //Método listar
    public ArrayList<TarefaModel> listar() {
        return lista;
    }

    //Verifica se tarefa ja está em uso ou vazia.
    public boolean verificaTarefa(ArrayList<TarefaModel> lista, String nome) {

        for (TarefaModel p : lista) {

            if (p.getNome().equalsIgnoreCase(nome)) {
                JOptionPane.showMessageDialog(null, "O nome desta Tarefa ja está em uso.\nCadastro negado.", "Erro", JOptionPane.ERROR_MESSAGE);
                return false;
            }

        }
        JOptionPane.showMessageDialog(null, "Tarefa {" + nome + "} cadastrada com sucesso.", "Aviso!", JOptionPane.WARNING_MESSAGE);
        adicionar(nome);
        return true;

    }

    public void concluirTarefa(ArrayList<TarefaModel> lista, String nome) {

        //roda a quantidade de "tarefas na lista"
        for (TarefaModel p : lista) {

            //equalsIgnoreCase para ignorar diferença entre maiuscula e minuscula
            if (p.getNome().equalsIgnoreCase(nome)) {
                JOptionPane.showMessageDialog(null, "A tarefa {" + p.getNome() + "} agora está concluída.", "Aviso!", JOptionPane.INFORMATION_MESSAGE);

                //concluir tarefa
                p.setConcluida(true);
                return;
            }
        }

    }

    public void removerTarefa(ArrayList<TarefaModel> lista, String nome) {

        //roda a quantidade de "tarefas na lista"
        for (TarefaModel p : lista) {

            //equalsIgnoreCase para ignorar diferença entre maiuscula e minuscula
            if (p.getNome().equalsIgnoreCase(nome)) {
                JOptionPane.showMessageDialog(null, "A Tarefa {" + p.getNome() + "} foi removida com sucesso.", "Aviso!", JOptionPane.INFORMATION_MESSAGE);

                //remover da lista
                lista.remove(p);
                return;
            }

        }

    }

}
