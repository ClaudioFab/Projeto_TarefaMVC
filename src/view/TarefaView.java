
package view;

import controller.TarefaController;
import javax.swing.JOptionPane;
import model.TarefaModel;

public class TarefaView extends javax.swing.JFrame {

    TarefaController controller = new TarefaController();

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(TarefaView.class.getName());

    public TarefaView() {
        initComponents();
    }
    
    //Percorre lista
    public void novaListagem(){
        for (TarefaModel t : controller.listar()) {
            jTextAreaLista.append(t.imprimir());
            jTextAreaLista.append("\n");
            
        }

        
    }
    
    //Apaga tudo
    public void apagarTela(){
        jTextFieldNome.setText("");
        jTextAreaLista.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelNovaTarefa = new javax.swing.JPanel();
        jLabelNomeTarefa = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jButtonAdicionarTarefa = new javax.swing.JButton();
        jPanelListaTarefa = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaLista = new javax.swing.JTextArea();
        jPanelBotao = new javax.swing.JPanel();
        jButtonListarTarefas = new javax.swing.JButton();
        jButtonConcluirTarefa = new javax.swing.JButton();
        jButtonRemoverTarefa = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Tarefas");
        setResizable(false);

        jPanelNovaTarefa.setBackground(new java.awt.Color(255, 255, 255));
        jPanelNovaTarefa.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Nova Tarefa", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 15), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanelNovaTarefa.setForeground(new java.awt.Color(0, 0, 0));

        jLabelNomeTarefa.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabelNomeTarefa.setForeground(new java.awt.Color(0, 0, 0));
        jLabelNomeTarefa.setText("Nome da Tarefa");

        jTextFieldNome.setBackground(new java.awt.Color(0, 0, 0));
        jTextFieldNome.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jTextFieldNome.setForeground(new java.awt.Color(255, 255, 255));

        jButtonAdicionarTarefa.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonAdicionarTarefa.setText("Adicionar");
        jButtonAdicionarTarefa.addActionListener(this::jButtonAdicionarTarefaActionPerformed);

        javax.swing.GroupLayout jPanelNovaTarefaLayout = new javax.swing.GroupLayout(jPanelNovaTarefa);
        jPanelNovaTarefa.setLayout(jPanelNovaTarefaLayout);
        jPanelNovaTarefaLayout.setHorizontalGroup(
            jPanelNovaTarefaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelNovaTarefaLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabelNomeTarefa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldNome)
                .addGap(18, 18, 18)
                .addComponent(jButtonAdicionarTarefa, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );
        jPanelNovaTarefaLayout.setVerticalGroup(
            jPanelNovaTarefaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelNovaTarefaLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanelNovaTarefaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNomeTarefa, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAdicionarTarefa, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jPanelListaTarefa.setBackground(new java.awt.Color(255, 255, 255));
        jPanelListaTarefa.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Lista de Tarefas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 15), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanelListaTarefa.setForeground(new java.awt.Color(0, 0, 0));

        jTextAreaLista.setEditable(false);
        jTextAreaLista.setBackground(new java.awt.Color(0, 0, 0));
        jTextAreaLista.setColumns(20);
        jTextAreaLista.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jTextAreaLista.setForeground(new java.awt.Color(255, 255, 255));
        jTextAreaLista.setRows(5);
        jScrollPane1.setViewportView(jTextAreaLista);

        javax.swing.GroupLayout jPanelListaTarefaLayout = new javax.swing.GroupLayout(jPanelListaTarefa);
        jPanelListaTarefa.setLayout(jPanelListaTarefaLayout);
        jPanelListaTarefaLayout.setHorizontalGroup(
            jPanelListaTarefaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelListaTarefaLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 639, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanelListaTarefaLayout.setVerticalGroup(
            jPanelListaTarefaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelListaTarefaLayout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        jPanelBotao.setBackground(new java.awt.Color(255, 255, 255));
        jPanelBotao.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButtonListarTarefas.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonListarTarefas.setText("Listar");
        jButtonListarTarefas.addActionListener(this::jButtonListarTarefasActionPerformed);

        jButtonConcluirTarefa.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonConcluirTarefa.setText("Concluir");
        jButtonConcluirTarefa.addActionListener(this::jButtonConcluirTarefaActionPerformed);

        jButtonRemoverTarefa.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonRemoverTarefa.setText("Remover");
        jButtonRemoverTarefa.addActionListener(this::jButtonRemoverTarefaActionPerformed);

        javax.swing.GroupLayout jPanelBotaoLayout = new javax.swing.GroupLayout(jPanelBotao);
        jPanelBotao.setLayout(jPanelBotaoLayout);
        jPanelBotaoLayout.setHorizontalGroup(
            jPanelBotaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBotaoLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jButtonListarTarefas, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonConcluirTarefa, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74)
                .addComponent(jButtonRemoverTarefa, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );
        jPanelBotaoLayout.setVerticalGroup(
            jPanelBotaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBotaoLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanelBotaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonRemoverTarefa, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonConcluirTarefa, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonListarTarefas, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelNovaTarefa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelListaTarefa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelBotao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelNovaTarefa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanelListaTarefa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanelBotao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAdicionarTarefaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdicionarTarefaActionPerformed
        String nome = jTextFieldNome.getText();

        //Envia para o controller
        controller.adicionar(nome);

        JOptionPane.showMessageDialog(null, "Tarefa cadastrada.", "Aviso!", JOptionPane.WARNING_MESSAGE);
        apagarTela();
    }//GEN-LAST:event_jButtonAdicionarTarefaActionPerformed

    private void jButtonListarTarefasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonListarTarefasActionPerformed
        apagarTela();

        //Percorre lista
        novaListagem();


    }//GEN-LAST:event_jButtonListarTarefasActionPerformed

    private void jButtonConcluirTarefaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConcluirTarefaActionPerformed

        int indice = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o número da tarefa concluída.", "Conclusão de Tarefa", JOptionPane.QUESTION_MESSAGE));
        controller.concluirTarefa(indice - 1);
        
        apagarTela();
        
        //Percorre lista
        novaListagem();


    }//GEN-LAST:event_jButtonConcluirTarefaActionPerformed

    private void jButtonRemoverTarefaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemoverTarefaActionPerformed

        //procura a tarefa e remove
        controller.pesquisarTarefa(controller.listar());
        
        apagarTela();
        
        //Percorre lista
        novaListagem();

        
        
        
        
        
    }//GEN-LAST:event_jButtonRemoverTarefaActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> new TarefaView().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdicionarTarefa;
    private javax.swing.JButton jButtonConcluirTarefa;
    private javax.swing.JButton jButtonListarTarefas;
    private javax.swing.JButton jButtonRemoverTarefa;
    private javax.swing.JLabel jLabelNomeTarefa;
    private javax.swing.JPanel jPanelBotao;
    private javax.swing.JPanel jPanelListaTarefa;
    private javax.swing.JPanel jPanelNovaTarefa;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaLista;
    private javax.swing.JTextField jTextFieldNome;
    // End of variables declaration//GEN-END:variables

}
