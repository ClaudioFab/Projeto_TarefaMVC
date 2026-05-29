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
    public void novaListagem() {
        int cont = 0;
        for (TarefaModel t : controller.listar()) {
            jTextAreaLista.append(((cont++) + 1) + "º " + t.imprimir1() + "" + t.imprimir2());
            jTextAreaLista.append("\n");
        }

        //Lista o número de tarefas em jLabelTotalTarefas
        jLabelTotalTarefas.setText("Total de tarefas: " + cont);

    }

    //Apaga tudo
    public void apagarTela() {
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
        jLabelTotalTarefas = new javax.swing.JLabel();
        jPanelBotao = new javax.swing.JPanel();
        jButtonConcluirTarefa = new javax.swing.JButton();
        jButtonRemoverTarefa = new javax.swing.JButton();
        jComboBoxLista = new javax.swing.JComboBox<>();
        jPanelTitulo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBarCadastroTarefas = new javax.swing.JMenuBar();
        jMenuSair = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Tarefas");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                saida2(evt);
            }
        });

        jPanelNovaTarefa.setBackground(new java.awt.Color(255, 255, 255));
        jPanelNovaTarefa.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Nova Tarefa", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 15), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanelNovaTarefa.setForeground(new java.awt.Color(0, 0, 0));

        jLabelNomeTarefa.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabelNomeTarefa.setForeground(new java.awt.Color(0, 0, 0));
        jLabelNomeTarefa.setText("Nome da Tarefa");

        jTextFieldNome.setBackground(new java.awt.Color(0, 0, 0));
        jTextFieldNome.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jTextFieldNome.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldNomeKeyPressed(evt);
            }
        });

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

        jLabelTotalTarefas.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabelTotalTarefas.setForeground(new java.awt.Color(0, 0, 0));
        jLabelTotalTarefas.setText("Total de tarefas: 0");

        javax.swing.GroupLayout jPanelListaTarefaLayout = new javax.swing.GroupLayout(jPanelListaTarefa);
        jPanelListaTarefa.setLayout(jPanelListaTarefaLayout);
        jPanelListaTarefaLayout.setHorizontalGroup(
            jPanelListaTarefaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelListaTarefaLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanelListaTarefaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelTotalTarefas)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 639, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelListaTarefaLayout.setVerticalGroup(
            jPanelListaTarefaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelListaTarefaLayout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelTotalTarefas)
                .addGap(12, 12, 12))
        );

        jPanelBotao.setBackground(new java.awt.Color(255, 255, 255));
        jPanelBotao.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Gerenciamento de Tarefas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 15), new java.awt.Color(0, 0, 0))); // NOI18N

        jButtonConcluirTarefa.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonConcluirTarefa.setText("Concluir");
        jButtonConcluirTarefa.addActionListener(this::jButtonConcluirTarefaActionPerformed);

        jButtonRemoverTarefa.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonRemoverTarefa.setText("Remover");
        jButtonRemoverTarefa.addActionListener(this::jButtonRemoverTarefaActionPerformed);

        jComboBoxLista.setBackground(new java.awt.Color(0, 0, 0));
        jComboBoxLista.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jComboBoxLista.setForeground(new java.awt.Color(255, 255, 255));
        jComboBoxLista.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "(Selecione a Tarefa)" }));

        javax.swing.GroupLayout jPanelBotaoLayout = new javax.swing.GroupLayout(jPanelBotao);
        jPanelBotao.setLayout(jPanelBotaoLayout);
        jPanelBotaoLayout.setHorizontalGroup(
            jPanelBotaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBotaoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jComboBoxLista, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jButtonConcluirTarefa, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jButtonRemoverTarefa, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        jPanelBotaoLayout.setVerticalGroup(
            jPanelBotaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBotaoLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanelBotaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonRemoverTarefa, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonConcluirTarefa, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxLista, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
        );

        jPanelTitulo.setBackground(new java.awt.Color(255, 255, 255));
        jPanelTitulo.setForeground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/icons8-cadastro-50.png"))); // NOI18N
        jLabel1.setText("Cadastro de tarefas MVC em Java");

        javax.swing.GroupLayout jPanelTituloLayout = new javax.swing.GroupLayout(jPanelTitulo);
        jPanelTitulo.setLayout(jPanelTituloLayout);
        jPanelTituloLayout.setHorizontalGroup(
            jPanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelTituloLayout.setVerticalGroup(
            jPanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTituloLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        jMenuSair.setText("Sair");
        jMenuSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                saida1(evt);
            }
        });
        jMenuBarCadastroTarefas.add(jMenuSair);

        setJMenuBar(jMenuBarCadastroTarefas);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelNovaTarefa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelListaTarefa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelBotao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanelNovaTarefa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanelListaTarefa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanelBotao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAdicionarTarefaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdicionarTarefaActionPerformed
        String nome = jTextFieldNome.getText();

        if (nome.equals("")) {
            JOptionPane.showMessageDialog(null, "Digite o nome da tarefa.\nCadastro negado.", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        int exemplo = JOptionPane.showConfirmDialog(null, "Deseja adicionar a tarefa {" + nome + "} ?", "Adicionar", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        if (exemplo == 0) {
            //controller.verificaTarefa(controller.listar(),nome); ativa "verificaTarefa()"
            //Verifica se tarefa ja está em uso ou vazia e adiciona ao combobox
            if (controller.verificaTarefa(controller.listar(), nome) == true) {
                jComboBoxLista.addItem(nome);
            }

            //Apaga tudo
            apagarTela();

            //Percorre lista
            novaListagem();

        } else if (exemplo == 1) {
            //Apaga tudo
            apagarTela();

            //Percorre lista
            novaListagem();
            return;
        }
        
        //Retorna o foco na seleção desejada
        jTextFieldNome.requestFocus();


    }//GEN-LAST:event_jButtonAdicionarTarefaActionPerformed

    private void jButtonConcluirTarefaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConcluirTarefaActionPerformed

        //pega o item selecionado
        String tarefaFinaliza = jComboBoxLista.getSelectedItem().toString();

        if (jComboBoxLista.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Selecione uma tarefa.", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        int exemplo = JOptionPane.showConfirmDialog(null, "Deseja concluir a tarefa {" + tarefaFinaliza + "} ?", "Concluir", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        if (exemplo == 0) {

            //procura a tarefa e conclui
            controller.concluirTarefa(controller.listar(), tarefaFinaliza);

            //Apaga tudo
            apagarTela();

            //Percorre lista
            novaListagem();

        } else if (exemplo == 1) {
            //Apaga tudo
            apagarTela();

            //Percorre lista
            novaListagem();
            return;
        }


    }//GEN-LAST:event_jButtonConcluirTarefaActionPerformed

    private void jButtonRemoverTarefaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemoverTarefaActionPerformed

        //pega o item selecionado
        String tarefaRemova = jComboBoxLista.getSelectedItem().toString();

        if (jComboBoxLista.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Selecione uma tarefa.", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        int exemplo = JOptionPane.showConfirmDialog(null, "Deseja remover a tarefa {" + tarefaRemova + "} ?", "Remover", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        if (exemplo == 0) {
            //remove do combobox
            jComboBoxLista.removeItem(tarefaRemova);

            //remove da lista
            controller.removerTarefa(controller.listar(), tarefaRemova);

            //Apaga tudo
            apagarTela();
            //Percorre lista
            novaListagem();

        } else if (exemplo == 1) {
            //Apaga tudo
            apagarTela();

            //Percorre lista
            novaListagem();
            return;
        }


    }//GEN-LAST:event_jButtonRemoverTarefaActionPerformed

    private void jTextFieldNomeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNomeKeyPressed
        //Pressionar enter no JTextFild executa o botão
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            jButtonAdicionarTarefaActionPerformed(null);
        }
        
    }//GEN-LAST:event_jTextFieldNomeKeyPressed

    private void saida1(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saida1
        JOptionPane.showMessageDialog(null, "Programa finalizado.", "Encerrando", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }//GEN-LAST:event_saida1

    private void saida2(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_saida2
        JOptionPane.showMessageDialog(null, "Programa finalizado.", "Encerrando", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }//GEN-LAST:event_saida2

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> new TarefaView().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdicionarTarefa;
    private javax.swing.JButton jButtonConcluirTarefa;
    private javax.swing.JButton jButtonRemoverTarefa;
    private javax.swing.JComboBox<String> jComboBoxLista;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelNomeTarefa;
    private javax.swing.JLabel jLabelTotalTarefas;
    private javax.swing.JMenuBar jMenuBarCadastroTarefas;
    private javax.swing.JMenu jMenuSair;
    private javax.swing.JPanel jPanelBotao;
    private javax.swing.JPanel jPanelListaTarefa;
    private javax.swing.JPanel jPanelNovaTarefa;
    private javax.swing.JPanel jPanelTitulo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaLista;
    private javax.swing.JTextField jTextFieldNome;
    // End of variables declaration//GEN-END:variables

}
