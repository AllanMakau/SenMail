package com.example.mail;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;

public class SimplesAutenticacao extends Authenticator {
	
	public String usuario = null;
	public String senha = null;


	public SimplesAutenticacao(String usuario, String senha) {
		this.usuario = usuario;
		this.senha = senha;
	}

	protected PasswordAuthentication getPasswordAuthentication() {
		return new PasswordAuthentication (usuario,senha);
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	

	
}
