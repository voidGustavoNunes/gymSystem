/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import view.DialogCadastroAluno;
import view.DialogCadastroProfessor;
import view.DialogConsultaAluno;
import view.DialogConsultaIntermediario;
import view.DialogConsultaProfessor;
import view.DialogCriarExercicio;
import view.DialogGerenciarExercicios;
import view.DialogIntermediarioGerarRelatorios;
import view.DialogLogin;
import view.FrmGerenciador;
import java.awt.Frame;
import java.awt.Image;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import view.DialogAjuda;

/**
 *
 * @author Gustavo
 */
public class GerInterfaceGrafica {

    //JANELAS
    private FrmGerenciador janPrinc = null;
    private DialogCadastroProfessor janCadProf = null;
    private DialogCadastroAluno janCadAluno = null;
    private DialogConsultaAluno janConsAluno = null;
    private DialogConsultaIntermediario janConsInter = null;
    private DialogConsultaProfessor janConsProf = null;
    private DialogCriarExercicio janCriaEx = null;
    private DialogGerenciarExercicios janGerEx = null;
    private DialogIntermediarioGerarRelatorios janIntGerRel = null;
    private DialogLogin janLogin = null;
    private DialogAjuda janAjuda = null;

    public GerInterfaceGrafica() {
    }

    //ABRIR DIALOG
    private JDialog abrirJanela(java.awt.Frame parent, JDialog dlg, Class classe) {
        if (dlg == null) {
            try {
                dlg = (JDialog) classe.getConstructor(Frame.class, boolean.class).newInstance(parent, true);
            } catch (NoSuchMethodException | InstantiationException | IllegalAccessException
                    | IllegalArgumentException | InvocationTargetException ex) {
                JOptionPane.showMessageDialog(parent, "Erro ao abrir a janela" + classe.getName());
            }

        }
        dlg.setVisible(true);
        return dlg;

    }

    // ABRIR DIALOG
    private JFrame abrirJanela(JDialog parent, JFrame frame, Class classe) {
        if (frame == null) {
            try {
                frame = (JFrame) classe.getConstructor().newInstance();
            } catch (NoSuchMethodException | InstantiationException | IllegalAccessException
                    | IllegalArgumentException | InvocationTargetException ex) {
                JOptionPane.showMessageDialog(parent, "Erro ao abrir a janela" + classe.getName());
            }
        }

        frame.setVisible(true);
        return frame;
    }

    public void janelaCadastroAluno() {
        janCadAluno = (DialogCadastroAluno) abrirJanela(janPrinc, janCadAluno, DialogCadastroAluno.class);

    }

    public void janelaCadastroProfessor() {
        janCadProf = (DialogCadastroProfessor) abrirJanela(janPrinc, janCadProf, DialogCadastroProfessor.class);

    }

    public void janelaConsultaAluno() {
        janConsAluno = (DialogConsultaAluno) abrirJanela(janPrinc, janConsAluno, DialogConsultaAluno.class);

    }

    public void janelaConsultaIntermediario() {
        janConsInter = (DialogConsultaIntermediario) abrirJanela(janPrinc, janConsInter, DialogConsultaIntermediario.class);

    }

    public void janelaConsultaProfessor() {
        janConsProf = (DialogConsultaProfessor) abrirJanela(janPrinc, janConsProf, DialogConsultaProfessor.class);

    }

    public void janelaCriarExercicio() {
        janCriaEx = (DialogCriarExercicio) abrirJanela(janPrinc, janCriaEx, DialogCriarExercicio.class);

    }

    public void janelaGerenciarExercicios() {
        janGerEx = (DialogGerenciarExercicios) abrirJanela(janPrinc, janGerEx, DialogGerenciarExercicios.class);

    }

    public void janelaIntermediarioGerarRelatorios() {
        janIntGerRel = (DialogIntermediarioGerarRelatorios) abrirJanela(janPrinc, janIntGerRel, DialogGerenciarExercicios.class);

    }

    public void janelaDialogLogin() {
        janLogin = (DialogLogin) abrirJanela(janPrinc, janLogin, DialogLogin.class);

    }

    public void janelaFrmGerenciador() {
        janPrinc = (FrmGerenciador) abrirJanela(janLogin, janPrinc, FrmGerenciador.class);

    }
    
    public void janelaDialogAjuda(){
        janAjuda = (DialogAjuda) abrirJanela(janPrinc, janAjuda, DialogAjuda.class);
    }

    public static void main(String[] args) {

    }
    
    public void fecharJanela(JDialog dlg1){
        if(dlg1 != null && dlg1.isVisible()){
            dlg1.dispose();
        }  
    }
    
    
    public void fecharJanela(JFrame frm1){
        if(frm1 != null && frm1.isVisible()){
            frm1.dispose();
        }  
    }
    
    private void redimensionaFoto(ImageIcon imagem, JLabel label){
        imagem.setImage(imagem.getImage().getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_DEFAULT));
        label.setText("");
        label.setIcon(imagem);
    }

    public void abrirFoto(JDialog janela, JLabel label){
        JFileChooser janArq = new JFileChooser();
        
        janArq.setAcceptAllFileFilterUsed(false);
        janArq.setFileFilter(new FileNameExtensionFilter("Arquivos de imagem", "png", "bmp", "jpg", "gif"));
        
        if(janArq.showOpenDialog(janela) == JFileChooser.APPROVE_OPTION){
            File arq = janArq.getSelectedFile();
            ImageIcon imagem = new ImageIcon(arq.getAbsolutePath());
            redimensionaFoto(imagem, label);
        }
    }
}
