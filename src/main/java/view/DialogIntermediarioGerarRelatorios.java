/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package view;

import control.GerInterfaceGrafica;

/**
 *
 * @author Gustavo
 */
public class DialogIntermediarioGerarRelatorios extends javax.swing.JDialog {

    /**
     * Creates new form DialogGerarRelatórios
     */
    public DialogIntermediarioGerarRelatorios(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    
        GerInterfaceGrafica gerInterGrafica = new GerInterfaceGrafica();


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton4 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jButtonAtividades = new javax.swing.JButton();
        jButtonProfessores = new javax.swing.JButton();
        jButtonAlunos = new javax.swing.JButton();
        jButtonAtividades1 = new javax.swing.JButton();
        jButtonAtividades2 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuConsultas = new javax.swing.JMenu();
        itemProfessorConsulta = new javax.swing.JMenuItem();
        itemAlunoConsulta = new javax.swing.JMenuItem();
        menuCadastros = new javax.swing.JMenu();
        itemProfessorCadastros = new javax.swing.JMenuItem();
        itemAlunoCadastros = new javax.swing.JMenuItem();
        itemAtividadeCadastros = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        atribuirAulasJMenuItem8 = new javax.swing.JMenuItem();
        AtribuirTurmasJMenuItem9 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        Ajuda = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem7 = new javax.swing.JMenuItem();

        jButton4.setText("Alunos");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Deseja gerar relatório de:"));

        jButtonAtividades.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons16px/fitness (1).png"))); // NOI18N
        jButtonAtividades.setText("Atividades");

        jButtonProfessores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons16px/gym (2).png"))); // NOI18N
        jButtonProfessores.setText("Professores");

        jButtonAlunos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons16px/excercise.png"))); // NOI18N
        jButtonAlunos.setText("Alunos");
        jButtonAlunos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlunosActionPerformed(evt);
            }
        });

        jButtonAtividades1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons16px/trainer.png"))); // NOI18N
        jButtonAtividades1.setText("Aulas");

        jButtonAtividades2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons16px/employees.png"))); // NOI18N
        jButtonAtividades2.setText("Turmas");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButtonAtividades, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                    .addComponent(jButtonAlunos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jButtonAtividades1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonProfessores, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAtividades2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(14, 14, 14))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAlunos, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonProfessores, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAtividades2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAtividades, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonAtividades1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(105, 105, 105))
        );

        menuConsultas.setMnemonic('c');
        menuConsultas.setText("Consultas");
        menuConsultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuConsultasActionPerformed(evt);
            }
        });

        itemProfessorConsulta.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        itemProfessorConsulta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons16px/gym (2).png"))); // NOI18N
        itemProfessorConsulta.setMnemonic('p');
        itemProfessorConsulta.setText("Professor");
        itemProfessorConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemProfessorConsultaActionPerformed(evt);
            }
        });
        menuConsultas.add(itemProfessorConsulta);

        itemAlunoConsulta.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itemAlunoConsulta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons16px/excercise.png"))); // NOI18N
        itemAlunoConsulta.setMnemonic('a');
        itemAlunoConsulta.setText("Aluno");
        itemAlunoConsulta.setToolTipText("");
        itemAlunoConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemAlunoConsultaActionPerformed(evt);
            }
        });
        menuConsultas.add(itemAlunoConsulta);

        jMenuBar1.add(menuConsultas);

        menuCadastros.setMnemonic('d');
        menuCadastros.setText("Cadastros");
        menuCadastros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadastrosActionPerformed(evt);
            }
        });

        itemProfessorCadastros.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        itemProfessorCadastros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons16px/gym (2).png"))); // NOI18N
        itemProfessorCadastros.setText("Professor");
        itemProfessorCadastros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemProfessorCadastrosActionPerformed(evt);
            }
        });
        menuCadastros.add(itemProfessorCadastros);

        itemAlunoCadastros.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        itemAlunoCadastros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons16px/excercise.png"))); // NOI18N
        itemAlunoCadastros.setText("Aluno");
        itemAlunoCadastros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemAlunoCadastrosActionPerformed(evt);
            }
        });
        menuCadastros.add(itemAlunoCadastros);

        itemAtividadeCadastros.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        itemAtividadeCadastros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons16px/fitness (1).png"))); // NOI18N
        itemAtividadeCadastros.setText("Atividade");
        itemAtividadeCadastros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemAtividadeCadastrosActionPerformed(evt);
            }
        });
        menuCadastros.add(itemAtividadeCadastros);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons16px/trainer.png"))); // NOI18N
        jMenuItem2.setText("Aulas");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        menuCadastros.add(jMenuItem2);

        jMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Y, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons16px/employees.png"))); // NOI18N
        jMenuItem6.setText(" Turmas");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        menuCadastros.add(jMenuItem6);

        jMenuBar1.add(menuCadastros);

        jMenu5.setMnemonic('g');
        jMenu5.setText("Gerenciar");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons16px/contract.png"))); // NOI18N
        jMenuItem1.setMnemonic('a');
        jMenuItem1.setText("Atividades");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem1);

        atribuirAulasJMenuItem8.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        atribuirAulasJMenuItem8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons16px/trainer.png"))); // NOI18N
        atribuirAulasJMenuItem8.setText("Atribuir Aulas");
        atribuirAulasJMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atribuirAulasJMenuItem8ActionPerformed(evt);
            }
        });
        jMenu5.add(atribuirAulasJMenuItem8);

        AtribuirTurmasJMenuItem9.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        AtribuirTurmasJMenuItem9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons16px/employees.png"))); // NOI18N
        AtribuirTurmasJMenuItem9.setText("Atribuir Turmas");
        AtribuirTurmasJMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtribuirTurmasJMenuItem9ActionPerformed(evt);
            }
        });
        jMenu5.add(AtribuirTurmasJMenuItem9);

        jMenuBar1.add(jMenu5);

        jMenu4.setMnemonic('n');
        jMenu4.setText("Configurações");

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons16px/fitness.png"))); // NOI18N
        jMenu1.setMnemonic('g');
        jMenu1.setText("Gerar Relatórios");

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons16px/excercise.png"))); // NOI18N
        jMenuItem3.setMnemonic('l');
        jMenuItem3.setText("Alunos");
        jMenu1.add(jMenuItem3);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons16px/gym (2).png"))); // NOI18N
        jMenuItem4.setMnemonic('p');
        jMenuItem4.setText("Professores");
        jMenu1.add(jMenuItem4);

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons16px/fitness (1).png"))); // NOI18N
        jMenuItem5.setMnemonic('t');
        jMenuItem5.setText("Atividades");
        jMenu1.add(jMenuItem5);

        jMenu4.add(jMenu1);

        Ajuda.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        Ajuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons16px/icons8-help-5022.png"))); // NOI18N
        Ajuda.setMnemonic('a');
        Ajuda.setText("Ajuda");
        Ajuda.setToolTipText("");
        Ajuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AjudaActionPerformed(evt);
            }
        });
        jMenu4.add(Ajuda);
        jMenu4.add(jSeparator1);

        jMenuItem7.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons16px/icons8-exit-50 (1).png"))); // NOI18N
        jMenuItem7.setMnemonic('s');
        jMenuItem7.setText("Sair");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem7);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAlunosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlunosActionPerformed

    }//GEN-LAST:event_jButtonAlunosActionPerformed

    private void itemProfessorConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemProfessorConsultaActionPerformed
        gerInterGrafica.janelaConsultaProfessor();
    }//GEN-LAST:event_itemProfessorConsultaActionPerformed

    private void itemAlunoConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemAlunoConsultaActionPerformed
        gerInterGrafica.janelaConsultaAluno();
    }//GEN-LAST:event_itemAlunoConsultaActionPerformed

    private void menuConsultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuConsultasActionPerformed
        gerInterGrafica.janelaConsultaProfessor();
    }//GEN-LAST:event_menuConsultasActionPerformed

    private void itemProfessorCadastrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemProfessorCadastrosActionPerformed
        gerInterGrafica.janelaCadastroProfessor();

    }//GEN-LAST:event_itemProfessorCadastrosActionPerformed

    private void itemAlunoCadastrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemAlunoCadastrosActionPerformed
        gerInterGrafica.janelaCadastroAluno();
    }//GEN-LAST:event_itemAlunoCadastrosActionPerformed

    private void itemAtividadeCadastrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemAtividadeCadastrosActionPerformed
        gerInterGrafica.janelaCriarExercicio();
    }//GEN-LAST:event_itemAtividadeCadastrosActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        gerInterGrafica.janelaDialogCadastrarAula();

    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        gerInterGrafica.janelaDialogCadastrarTurma();

    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void menuCadastrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadastrosActionPerformed
        gerInterGrafica.janelaCadastroProfessor();
    }//GEN-LAST:event_menuCadastrosActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        gerInterGrafica.janelaGerenciarExercicios();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void atribuirAulasJMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atribuirAulasJMenuItem8ActionPerformed
        gerInterGrafica.janelaDialogAtribuirAulas();

    }//GEN-LAST:event_atribuirAulasJMenuItem8ActionPerformed

    private void AtribuirTurmasJMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtribuirTurmasJMenuItem9ActionPerformed
        gerInterGrafica.janelaDialogAtribuirTurma();

    }//GEN-LAST:event_AtribuirTurmasJMenuItem9ActionPerformed

    private void AjudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AjudaActionPerformed
        gerInterGrafica.janelaDialogAjuda();
    }//GEN-LAST:event_AjudaActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        gerInterGrafica.fecharJanela(this);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DialogIntermediarioGerarRelatorios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DialogIntermediarioGerarRelatorios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DialogIntermediarioGerarRelatorios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DialogIntermediarioGerarRelatorios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DialogIntermediarioGerarRelatorios dialog = new DialogIntermediarioGerarRelatorios(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Ajuda;
    private javax.swing.JMenuItem AtribuirTurmasJMenuItem9;
    private javax.swing.JMenuItem atribuirAulasJMenuItem8;
    private javax.swing.JMenuItem itemAlunoCadastros;
    private javax.swing.JMenuItem itemAlunoConsulta;
    private javax.swing.JMenuItem itemAtividadeCadastros;
    private javax.swing.JMenuItem itemProfessorCadastros;
    private javax.swing.JMenuItem itemProfessorConsulta;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButtonAlunos;
    private javax.swing.JButton jButtonAtividades;
    private javax.swing.JButton jButtonAtividades1;
    private javax.swing.JButton jButtonAtividades2;
    private javax.swing.JButton jButtonProfessores;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenu menuCadastros;
    private javax.swing.JMenu menuConsultas;
    // End of variables declaration//GEN-END:variables
}
