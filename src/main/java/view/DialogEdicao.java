/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package view;

import control.GerInterfaceGrafica;
import java.util.List;
import javax.swing.JOptionPane;
import model.Aluno;
import model.Aulas;
import model.Exercicio;
import model.Professor;
import model.Turma;

/**
 *
 * @author Gustavo
 */
public class DialogEdicao extends javax.swing.JDialog {

    /**
     * Creates new form DialogEdicao
     */
    public DialogEdicao(java.awt.Frame parent, boolean modal) {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jComboBoxItens = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jComboBoxNome = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jButtonCancelar = new javax.swing.JButton();
        jButtonConfirmar = new javax.swing.JButton();
        jButtonEditar = new javax.swing.JButton();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setText("EDIÇÃO");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(240, 240, 240)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Selecione o item:"));

        jLabel2.setText("Tipo:");

        jComboBoxItens.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Aluno", "Professor", "Turma", "Aula", "Atividade" }));
        jComboBoxItens.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxItensItemStateChanged(evt);
            }
        });

        jLabel3.setText("Nome:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBoxItens, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBoxNome, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBoxItens, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBoxNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jButtonConfirmar.setText("Confirmar");

        jButtonEditar.setText("Editar");
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addComponent(jButtonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addComponent(jButtonConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
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
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 5, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        gerInterGrafica.fecharJanela(this);


    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jComboBoxItensItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxItensItemStateChanged
        int i = jComboBoxItens.getSelectedIndex();

        switch (i) {
            case 0:

                gerInterGrafica.getInstance().carregarCombo(Aluno.class, jComboBoxNome);
                break;
            case 1:
                gerInterGrafica.getInstance().carregarCombo(Professor.class, jComboBoxNome);
                break;
                
            case 2:
                gerInterGrafica.getInstance().carregarCombo(Turma.class, jComboBoxNome);
                break;
            
            case 3:
                gerInterGrafica.getInstance().carregarCombo(Aulas.class, jComboBoxNome);
                break;
                
            case 4:
                gerInterGrafica.getInstance().carregarCombo(Exercicio.class, jComboBoxNome);
                break;
              
        }


    }//GEN-LAST:event_jComboBoxItensItemStateChanged

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
        Object ob = jComboBoxNome.getSelectedItem();
        gerInterGrafica.abreJanelaPreencheCampos(ob);



        

    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown

        gerInterGrafica.carregarCombo(Aluno.class, jComboBoxNome);
    }//GEN-LAST:event_formComponentShown

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
            java.util.logging.Logger.getLogger(DialogEdicao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DialogEdicao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DialogEdicao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DialogEdicao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DialogEdicao dialog = new DialogEdicao(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonConfirmar;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JComboBox<String> jComboBoxItens;
    private javax.swing.JComboBox<String> jComboBoxNome;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenu menuCadastros;
    private javax.swing.JMenu menuConsultas;
    // End of variables declaration//GEN-END:variables
}