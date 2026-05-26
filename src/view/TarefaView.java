
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
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelNovaTarefa = new javax.swing.JPanel();
        jLabelNomeTarefa = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jButtonAdicionar = new javax.swing.JButton();
        jPanelListaTarefa = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaLista = new javax.swing.JTextArea();
        jPanelBotao = new javax.swing.JPanel();
        jButtonListarTarefas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Tarefas");

        jPanelNovaTarefa.setBackground(new java.awt.Color(255, 255, 255));
        jPanelNovaTarefa.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Nova Tarefa", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 15), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanelNovaTarefa.setForeground(new java.awt.Color(0, 0, 0));

        jLabelNomeTarefa.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelNomeTarefa.setForeground(new java.awt.Color(0, 0, 0));
        jLabelNomeTarefa.setText("Nome da Tarefa");

        jTextFieldNome.setBackground(new java.awt.Color(0, 0, 0));
        jTextFieldNome.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextFieldNome.setForeground(new java.awt.Color(255, 255, 255));

        jButtonAdicionar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonAdicionar.setText("Adicionar");
        jButtonAdicionar.addActionListener(this::jButtonAdicionarActionPerformed);

        javax.swing.GroupLayout jPanelNovaTarefaLayout = new javax.swing.GroupLayout(jPanelNovaTarefa);
        jPanelNovaTarefa.setLayout(jPanelNovaTarefaLayout);
        jPanelNovaTarefaLayout.setHorizontalGroup(
            jPanelNovaTarefaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelNovaTarefaLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabelNomeTarefa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonAdicionar)
                .addGap(32, 32, 32))
        );
        jPanelNovaTarefaLayout.setVerticalGroup(
            jPanelNovaTarefaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelNovaTarefaLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanelNovaTarefaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNomeTarefa)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAdicionar))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        jPanelListaTarefa.setBackground(new java.awt.Color(255, 255, 255));
        jPanelListaTarefa.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Lista de Tarefas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 15), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanelListaTarefa.setForeground(new java.awt.Color(0, 0, 0));

        jTextAreaLista.setBackground(new java.awt.Color(0, 0, 0));
        jTextAreaLista.setColumns(20);
        jTextAreaLista.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextAreaLista.setForeground(new java.awt.Color(255, 255, 255));
        jTextAreaLista.setRows(5);
        jScrollPane1.setViewportView(jTextAreaLista);

        javax.swing.GroupLayout jPanelListaTarefaLayout = new javax.swing.GroupLayout(jPanelListaTarefa);
        jPanelListaTarefa.setLayout(jPanelListaTarefaLayout);
        jPanelListaTarefaLayout.setHorizontalGroup(
            jPanelListaTarefaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelListaTarefaLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 639, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelListaTarefaLayout.setVerticalGroup(
            jPanelListaTarefaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelListaTarefaLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jPanelBotao.setBackground(new java.awt.Color(255, 255, 255));
        jPanelBotao.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButtonListarTarefas.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonListarTarefas.setText("Listar Tarefas");
        jButtonListarTarefas.addActionListener(this::jButtonListarTarefasActionPerformed);

        javax.swing.GroupLayout jPanelBotaoLayout = new javax.swing.GroupLayout(jPanelBotao);
        jPanelBotao.setLayout(jPanelBotaoLayout);
        jPanelBotaoLayout.setHorizontalGroup(
            jPanelBotaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBotaoLayout.createSequentialGroup()
                .addGap(241, 241, 241)
                .addComponent(jButtonListarTarefas, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelBotaoLayout.setVerticalGroup(
            jPanelBotaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBotaoLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jButtonListarTarefas, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
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

    private void jButtonAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdicionarActionPerformed
        String nome = jTextFieldNome.getText();
        
        //Envia para o controller
        controller.adicionar(nome);
        
        JOptionPane.showMessageDialog(null,"Tarefa cadastrada.","Aviso!",JOptionPane.WARNING_MESSAGE);
        jTextFieldNome.setText("");
    }//GEN-LAST:event_jButtonAdicionarActionPerformed

    private void jButtonListarTarefasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonListarTarefasActionPerformed
        jTextAreaLista.setText("");
        
        //Percorre lista
        for(TarefaModel t : controller.listar() ){
            jTextAreaLista.append(t.toString());
            jTextAreaLista.append("\n");
            
        }
            
    }//GEN-LAST:event_jButtonListarTarefasActionPerformed

    public static void main(String args[]) {


        java.awt.EventQueue.invokeLater(() -> new TarefaView().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdicionar;
    private javax.swing.JButton jButtonListarTarefas;
    private javax.swing.JLabel jLabelNomeTarefa;
    private javax.swing.JPanel jPanelBotao;
    private javax.swing.JPanel jPanelListaTarefa;
    private javax.swing.JPanel jPanelNovaTarefa;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaLista;
    private javax.swing.JTextField jTextFieldNome;
    // End of variables declaration//GEN-END:variables

}
