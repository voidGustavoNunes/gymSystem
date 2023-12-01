/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Properties;
import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.SimpleEmail;

/**
 *
 * @author Gustavo
 */
public class ConexaoAjuda {

    public void conectar(String cpfRecebido, String nomeRecebido, String emailRecebido, String duvidaRecebida) {

        String host = "smtp-mail.outlook.com"; // or the correct SMTP server for Outlook
        String username = "aplicacaoJavaAcademy@outlook.com"; // Seu email
        String password = "Admin@rps813"; // Sua senha
        int port = 587; // Porta SMTP (normalmente 587 ou 465)

        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", host);
        props.put("mail.smtp.port",port);

        SimpleEmail email = new SimpleEmail();

        email.setHostName(host);

        email.setSmtpPort(port);

        email.setAuthenticator(
                new DefaultAuthenticator(username, password));
        email.setStartTLSRequired(true); // Habilita o uso do TLS
        email.setSSLOnConnect(true);

        try {
            email.setFrom(username);
            email.setSubject("Dúvida Projeto Academy"); //asssunto
            email.setMsg("\n CPF: " + cpfRecebido + ";\n NOME: " + nomeRecebido + ";\n EMAIL DESTINATARIO: " + emailRecebido
                    + ";\n DUVIDA: " + duvidaRecebida);
            email.addTo(username);
            email.send();
            System.out.println("\n\n EMAIL ENVIADO COM SUCESSO! \n\n");

        } catch (Exception e) {
            e.printStackTrace();

        }

    }

    public ConexaoAjuda() {
    }

}
