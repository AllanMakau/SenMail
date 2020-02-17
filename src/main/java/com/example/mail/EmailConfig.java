package com.example.mail;

public class EmailConfig {
	
	private String servidor;
	private Long porta;
	private String usuario;
	private String senha;
	

	public EmailConfig() {
		super();
	}


	public EmailConfig(String servidor, Long porta, String usuario, String senha) {
		super();
		this.servidor = servidor;
		this.porta = porta;
		this.usuario = usuario;
		this.senha = senha;
	}
	
	
	public String getServidor() {
		return servidor;
	}
	public void setServidor(String servidor) {
		this.servidor = servidor;
	}
	public Long getPorta() {
		return porta;
	}
	public void setPorta(Long porta) {
		this.porta = porta;
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
