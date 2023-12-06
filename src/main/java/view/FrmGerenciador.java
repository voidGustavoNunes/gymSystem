/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import control.GerInterfaceGrafica;

/**
 *
 * @author Gustavo
 */
public class FrmGerenciador extends javax.swing.JFrame {

    /**
     * Creates new form FrmCadastrarUsuario
     */
    public FrmGerenciador() {
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

        jPanel5 = new javax.swing.JPanel();
        JButtonCadastrarAtividade = new javax.swing.JButton();
        jButtonConsultas = new javax.swing.JButton();
        jButtonCadastrarAluno = new javax.swing.JButton();
        jButtonGerenciarAtividades = new javax.swing.JButton();
        jButtonGerarRelatórios = new javax.swing.JButton();
        jButtonCadastrarProfessor = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuConsultas = new javax.swing.JMenu();
        itemProfessorConsulta = new javax.swing.JMenuItem();
        itemAlunoConsulta = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SGym");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        JButtonCadastrarAtividade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons16px/fitness (1).png"))); // NOI18N
        JButtonCadastrarAtividade.setText("Cadastrar Atividade");
        JButtonCadastrarAtividade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonCadastrarAtividadeActionPerformed(evt);
            }
        });

        jButtonConsultas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons16px/document.png"))); // NOI18N
        jButtonConsultas.setText("Consultas");
        jButtonConsultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConsultasActionPerformed(evt);
            }
        });

        jButtonCadastrarAluno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons16px/excercise.png"))); // NOI18N
        jButtonCadastrarAluno.setText("Cadastrar Aluno");
        jButtonCadastrarAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarAlunoActionPerformed(evt);
            }
        });

        jButtonGerenciarAtividades.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons16px/contract.png"))); // NOI18N
        jButtonGerenciarAtividades.setText("Gerenciar Atividades");
        jButtonGerenciarAtividades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGerenciarAtividadesActionPerformed(evt);
            }
        });

        jButtonGerarRelatórios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons16px/fitness.png"))); // NOI18N
        jButtonGerarRelatórios.setText("Gerar Relatórios");
        jButtonGerarRelatórios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGerarRelatóriosActionPerformed(evt);
            }
        });

        jButtonCadastrarProfessor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons16px/gym (2).png"))); // NOI18N
        jButtonCadastrarProfessor.setText("Cadastrar Professor");
        jButtonCadastrarProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarProfessorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonGerarRelatórios, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonConsultas, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jButtonCadastrarProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(JButtonCadastrarAtividade, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonCadastrarAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonGerenciarAtividades, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonConsultas, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCadastrarAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCadastrarProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 134, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JButtonCadastrarAtividade, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonGerarRelatórios, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonGerenciarAtividades, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel5.setText("Bem vindo ao SGym");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(330, 330, 330)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel5)
                .addContainerGap(35, Short.MAX_VALUE))
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

        jMenu2.setText("Atribuição");
        jMenuBar1.add(jMenu2);

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
        jMenuItem2.setText("Cadastrar Aulas");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        menuCadastros.add(jMenuItem2);

        jMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Y, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons16px/employees.png"))); // NOI18N
        jMenuItem6.setText("Cadastrar Turmas");
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itemProfessorConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemProfessorConsultaActionPerformed
        gerInterGrafica.janelaConsultaProfessor();
    }//GEN-LAST:event_itemProfessorConsultaActionPerformed

    private void itemAlunoConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemAlunoConsultaActionPerformed
        gerInterGrafica.janelaConsultaAluno();

    }//GEN-LAST:event_itemAlunoConsultaActionPerformed

    private void jButtonCadastrarAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarAlunoActionPerformed
        gerInterGrafica.janelaCadastroAluno();
    }//GEN-LAST:event_jButtonCadastrarAlunoActionPerformed

    private void jButtonGerenciarAtividadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGerenciarAtividadesActionPerformed
        gerInterGrafica.janelaGerenciarExercicios();
    }//GEN-LAST:event_jButtonGerenciarAtividadesActionPerformed

    private void itemAtividadeCadastrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemAtividadeCadastrosActionPerformed
        gerInterGrafica.janelaCriarExercicio();

    }//GEN-LAST:event_itemAtividadeCadastrosActionPerformed

    private void jButtonGerarRelatóriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGerarRelatóriosActionPerformed
        gerInterGrafica.janelaIntermediarioGerarRelatorios();
    }//GEN-LAST:event_jButtonGerarRelatóriosActionPerformed

    private void JButtonCadastrarAtividadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonCadastrarAtividadeActionPerformed
        gerInterGrafica.janelaCriarExercicio();
    }//GEN-LAST:event_JButtonCadastrarAtividadeActionPerformed

    private void jButtonConsultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsultasActionPerformed
        gerInterGrafica.janelaConsultaIntermediario();
    }//GEN-LAST:event_jButtonConsultasActionPerformed

    private void jButtonCadastrarProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarProfessorActionPerformed
        gerInterGrafica.janelaCadastroProfessor();
    }//GEN-LAST:event_jButtonCadastrarProfessorActionPerformed

    private void menuConsultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuConsultasActionPerformed
        gerInterGrafica.janelaConsultaProfessor();
    }//GEN-LAST:event_menuConsultasActionPerformed

    private void menuCadastrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadastrosActionPerformed
        gerInterGrafica.janelaCadastroProfessor();

    }//GEN-LAST:event_menuCadastrosActionPerformed

    private void itemAlunoCadastrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemAlunoCadastrosActionPerformed
        gerInterGrafica.janelaCadastroAluno();

    }//GEN-LAST:event_itemAlunoCadastrosActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        gerInterGrafica.janelaGerenciarExercicios();

    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void itemProfessorCadastrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemProfessorCadastrosActionPerformed
        gerInterGrafica.janelaCadastroProfessor();


    }//GEN-LAST:event_itemProfessorCadastrosActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        gerInterGrafica.fecharJanela(this);

    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void AjudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AjudaActionPerformed
        gerInterGrafica.janelaDialogAjuda();

    }//GEN-LAST:event_AjudaActionPerformed

    private void atribuirAulasJMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atribuirAulasJMenuItem8ActionPerformed
       gerInterGrafica.janelaDialogAtribuirAulas();


    }//GEN-LAST:event_atribuirAulasJMenuItem8ActionPerformed

    private void AtribuirTurmasJMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtribuirTurmasJMenuItem9ActionPerformed
        gerInterGrafica.janelaDialogAtribuirTurma();



    }//GEN-LAST:event_AtribuirTurmasJMenuItem9ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        gerInterGrafica.janelaDialogCadastrarAula();


    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        gerInterGrafica.janelaDialogCadastrarTurma();


    }//GEN-LAST:event_jMenuItem6ActionPerformed

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
            java.util.logging.Logger.getLogger(FrmGerenciador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmGerenciador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmGerenciador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmGerenciador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmGerenciador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Ajuda;
    private javax.swing.JMenuItem AtribuirTurmasJMenuItem9;
    private javax.swing.JButton JButtonCadastrarAtividade;
    private javax.swing.JMenuItem atribuirAulasJMenuItem8;
    private javax.swing.JMenuItem itemAlunoCadastros;
    private javax.swing.JMenuItem itemAlunoConsulta;
    private javax.swing.JMenuItem itemAtividadeCadastros;
    private javax.swing.JMenuItem itemProfessorCadastros;
    private javax.swing.JMenuItem itemProfessorConsulta;
    private javax.swing.JButton jButtonCadastrarAluno;
    private javax.swing.JButton jButtonCadastrarProfessor;
    private javax.swing.JButton jButtonConsultas;
    private javax.swing.JButton jButtonGerarRelatórios;
    private javax.swing.JButton jButtonGerenciarAtividades;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
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
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenu menuCadastros;
    private javax.swing.JMenu menuConsultas;
    // End of variables declaration//GEN-END:variables
}
