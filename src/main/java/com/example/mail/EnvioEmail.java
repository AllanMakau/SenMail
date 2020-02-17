package com.example.mail;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class EnvioEmail {
	


	public void envio(Evento newEvento, EmailConfig config ) {
		
		
		Properties props = new Properties();
		props.put("mail.transport.protocol", "smtp"); //define protocolo de envio como SMTP
		props.put("mail.smtp.starttls.enable","true"); 
		props.put("mail.smtp.host", config.getServidor()); //server SMTP do GMAIL
		props.put("mail.smtp.auth", "true"); //ativa autenticacao
		props.put("mail.smtp.user", config.getUsuario()); //usuario ou seja, a conta que esta enviando o email (tem que ser do GMAIL)
		props.put("mail.debug", "true");
		props.put("mail.smtp.port", config.getPorta()); //porta
		props.put("mail.smtp.socketFactory.port", config.getPorta()); //mesma porta para o socket
		props.put("mail.smtp.socketFactory.fallback", "true");

		SimplesAutenticacao auth = null;
				auth = new SimplesAutenticacao (config.getUsuario(), config.getSenha());
				Session sessao = Session.getDefaultInstance(props, auth);
				sessao.setDebug(true);
				Message msg = new MimeMessage(sessao);
				
				try {

					msg.setRecipient(Message.RecipientType.TO, new InternetAddress(newEvento.getDestinatario()));
					msg.setFrom(new InternetAddress(newEvento.getOrigem()));
					msg.setSubject(newEvento.getAssunto());
					msg.setContent(newEvento.getCorpo(),"text/html");
					
				} catch (Exception e) {
					System.out.println(">> Erro: Completar Mensagem");
					e.printStackTrace();
				}
				
				Transport tr;
				
				try {
					tr = sessao.getTransport("smtp"); //define smtp para transporte
					tr.connect(config.getServidor(), config.getPorta().intValue(),config.getUsuario(), config.getSenha());
					msg.saveChanges(); // don't forget this
					tr.sendMessage(msg, msg.getAllRecipients());
					tr.close();
				} catch (Exception e) {
					System.out.println(">> Erro: Envio Mensagem");
					e.printStackTrace();
				}
		
		
	}

}
