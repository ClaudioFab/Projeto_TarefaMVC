
package model;

public class TarefaModel {
    
    //Atributos    
    private String nome;
    private boolean concluida;

    //Construtor---------------------------------
    public TarefaModel(String nome) {
        this.nome = nome;
        this.concluida = concluida=false;
    }

    //Getter-------------------------------------
    public String getNome() {
        return nome;
    }

    public boolean isConcluida() {
        return concluida;
    }

    //Setter-------------------------------------
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setConcluida(boolean concluida) {
        this.concluida = concluida;
    }

    @Override
    public String toString() {
        return "TarefaModel{" + " nome=" + nome + ", concluida=" + concluida + '}';
    }
    
    
    
    
    
    
}
