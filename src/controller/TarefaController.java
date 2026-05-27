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

    public void concluirTarefa(int indice) {
        TarefaModel t1 = lista.get(indice);
        t1.setConcluida(true);
    }



    public void pesquisarTarefa(ArrayList<TarefaModel> lista){

        String nome = JOptionPane.showInputDialog(null,"Digite a Tarefa que deseja remover: ","Pesquisar Tarefa",JOptionPane.QUESTION_MESSAGE);
        
        //roda a quantidade de "tarefas na lista"
        for (TarefaModel p : lista){
    
            //equalsIgnoreCase para ignorar diferença entre maiuscula e minuscula
            if (p.getNome().equalsIgnoreCase(nome)) {
                JOptionPane.showMessageDialog(null,"Tarefa encontrada!","Encontrado",JOptionPane.INFORMATION_MESSAGE);
                
                //remover da lista
                lista.remove(p);
                
                
            }else{
                JOptionPane.showMessageDialog(null,"Tarefa não encontrada!","Erro",JOptionPane.ERROR_MESSAGE);
            }
        }
    }

}
