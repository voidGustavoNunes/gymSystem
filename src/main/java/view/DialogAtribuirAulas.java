/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package view;

import control.GerInterfaceGrafica;
import control.ProfessorAulaTableModel;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Aulas;
import model.Professor;

/**
 *
 * @author Gustavo
 */
public class DialogAtribuirAulas extends javax.swing.JDialog {

    /**
     * Creates new form DialogAtribuirAulas
     */
    GerInterfaceGrafica gerInter = new GerInterfaceGrafica();
    ProfessorAulaTableModel professorTable = new ProfessorAulaTableModel();
    //ProfessorAulaTableModel professorTable = null;

    public DialogAtribuirAulas(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBoxAulas = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jComboBoxProfessor = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableAulasProfessor = new javax.swing.JTable();
        jButtonCancelar = new javax.swing.JButton();
        jButtonAtribuir = new javax.swing.JButton();
        jButtonAdicionar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setText("Atribuir Aulas");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(201, 201, 201)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        jLabel2.setText("Aula:");

        jComboBoxAulas.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxAulasItemStateChanged(evt);
            }
        });

        jLabel3.setText("Professor:");

        jComboBoxProfessor.setEnabled(false);
        jComboBoxProfessor.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxProfessorItemStateChanged(evt);
            }
        });
        jComboBoxProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxProfessorActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Professores da Aula:"));

        jTableAulasProfessor.setModel(professorTable);
        jScrollPane1.setViewportView(jTableAulasProfessor);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 13, Short.MAX_VALUE))
        );

        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jButtonAtribuir.setText("Atribuir");
        jButtonAtribuir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtribuirActionPerformed(evt);
            }
        });

        jButtonAdicionar.setText("Adicionar");
        jButtonAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdicionarActionPerformed(evt);
            }
        });

        jButtonExcluir.setText("Excluir");
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });

        jMenu1.setText("Cadastro");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Atribuição");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Consulta");
        jMenuBar1.add(jMenu3);

        jMenu4.setText("Configurações");
        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBoxAulas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jComboBoxProfessor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jButtonAtribuir, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(394, Short.MAX_VALUE)
                .addComponent(jButtonAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBoxAulas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBoxProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(jButtonAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAtribuir, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        gerInter.fecharJanela(this);
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdicionarActionPerformed

        Professor professorSelecionado = null;
        ProfessorAulaTableModel professorTable = new ProfessorAulaTableModel();

        professorSelecionado = (Professor) jComboBoxProfessor.getSelectedItem();

        ProfessorAulaTableModel model = (ProfessorAulaTableModel) jTableAulasProfessor.getModel();
        int tamanho = model.getRowCount();
        for (int i = 0; i < tamanho; i++) {
            Professor professor = model.getProfessor(i);
            if (professor.equals(professorSelecionado)) {
                JOptionPane.showMessageDialog(this, "O professor já existe na tabela! Selecione outro.");
                jComboBoxProfessor.setSelectedItem(null);
            }

        }

        model.adicionar(professorSelecionado);

    }//GEN-LAST:event_jButtonAdicionarActionPerformed


    private void jComboBoxProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxProfessorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxProfessorActionPerformed


    private void jButtonAtribuirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtribuirActionPerformed
        /*int qntdeLinhas = jTableAulasProfessor.getRowCount();
        //Aulas aula = new Aulas();
        int idAula;
        Object idAulaOb;
        int idProfessor;
        Object idProfessorOb;
        Aulas aula = null;
        Professor professor = null;
        List<Professor> professoresLista = new ArrayList();
        List<Aulas> aulasLista = new ArrayList();

        if (qntdeLinhas > 0) {
            for (int linha = 0; linha < qntdeLinhas; linha++) {
                int coluna = 0;

                idAulaOb = jTableAulasProfessor.getValueAt(linha, coluna++);

                idProfessorOb = jTableAulasProfessor.getValueAt(linha, coluna++);
                idAula = (Integer) idAulaOb;
                idProfessor = (Integer) idProfessorOb;

                //pesquisa no banco e retorna o objeto de acordo com o id
                aula = (Aulas) gerInter.getGerDom().getGenDao().buscarPorId(idAula, Aulas.class);
                professor = (Professor) gerInter.getGerDom().getGenDao().buscarPorId(idProfessor, Professor.class);

                //adiciona na lista
                aulasLista.add(aula);
                professoresLista.add(professor);

            }
            aula.setProfessores(professoresLista);

            professor.setAulas(aulasLista);

            gerInter.getGerDom().getGenDao().alterar(aula);
            gerInter.getGerDom().getGenDao().alterar(professor);

        } else {
            JOptionPane.showMessageDialog(this, "Insira aulas e professores para atribuir!");

        }*/

        ProfessorAulaTableModel model = (ProfessorAulaTableModel) jTableAulasProfessor.getModel();
        Aulas aulaSelecionada = (Aulas) jComboBoxAulas.getSelectedItem();

        List<Professor> listaProfessoresTable = new ArrayList();

        for (int i = 0; i < model.getRowCount(); i++) {
            listaProfessoresTable.add(model.getProfessor(i));

        }
        aulaSelecionada.setProfessores(listaProfessoresTable);
        gerInter.getGerDom().getGenDao().alterar(aulaSelecionada);

    }//GEN-LAST:event_jButtonAtribuirActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTableAulasProfessor.getModel();

        int linha = jTableAulasProfessor.getSelectedRow();

        model.removeRow(linha);
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jComboBoxAulasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxAulasItemStateChanged
        // Ao trocar a aula
        // Pegar a aula

        // Mostrar os professores daquela aula
        Aulas aula = (Aulas) jComboBoxAulas.getSelectedItem();
        List<Professor> professoresLista = aula.getProfessores();

        ProfessorAulaTableModel model = (ProfessorAulaTableModel) jTableAulasProfessor.getModel();
        //model.limpar(); // Limpa a tabela antes de adicionar novos dados

        if (!professoresLista.isEmpty()) {
            for (Professor professor : professoresLista) {
                model.adicionar(professor);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Não há professores associados a esta aula.");
        }
        jComboBoxProfessor.setEnabled(true);

    }//GEN-LAST:event_jComboBoxAulasItemStateChanged

    private void jComboBoxProfessorItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxProfessorItemStateChanged

//        Aulas aulaSelecionada = null;
//        List<Professor> professoresNaTable = new ArrayList();
//        List<Professor> todosOsProfessores = gerInter.getGerDom().pesquisarProfessor(); //pega todos os professores
//        ProfessorAulaTableModel tableModel = (ProfessorAulaTableModel) jTableAulasProfessor.getModel();
//
//        //todos os professores das aulas inseridos
//        for (int i = 0; i < tableModel.getRowCount(); i++) {
//            Professor professor = tableModel.getProfessor(i);
//            professoresNaTable.add(professor);
//        }
//
//        // lista para armazenar os professores não adicionados na table
//        List<Professor> professoresNaoAdicionados = new ArrayList<>();
//
//        // Percorre todos os professores disponíveis e verifica se estão na tabela, coloca quem nao esta numa lista
//        for (Professor professor : todosOsProfessores) {
//            if (!professoresNaTable.contains(professor)) {
//                professoresNaoAdicionados.add(professor);
//            }
//        }
//
//        jComboBoxProfessor.removeAllItems();
//
//        for (Professor professor : professoresNaoAdicionados) {
//            jComboBoxProfessor.addItem(professor.getNome()); // Adiciona apenas o nome do professor
//        }
        gerInter.carregarCombo(Professor.class, jComboBoxProfessor);
    }//GEN-LAST:event_jComboBoxProfessorItemStateChanged

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        gerInter.getInstance().carregarCombo(Aulas.class, jComboBoxAulas);
        gerInter.getInstance().carregarCombo(Professor.class, jComboBoxProfessor);

    }//GEN-LAST:event_formComponentShown

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdicionar;
    private javax.swing.JButton jButtonAtribuir;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JComboBox<String> jComboBoxAulas;
    private javax.swing.JComboBox<String> jComboBoxProfessor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableAulasProfessor;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
