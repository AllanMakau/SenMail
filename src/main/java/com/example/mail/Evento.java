package com.example.mail;

public class Evento {
	
	
	private String origem;
	private String destinatario;
	private String assunto;
	private String corpo;
	

	public Evento() {
		super();
	}
	
	public Evento(String origem, String destinatario, String assunto, String corpo) {
		super();
		this.origem = origem;
		this.destinatario = destinatario;
		this.assunto = assunto;
		this.corpo = corpo;
	}
	
	public String getOrigem() {
		return origem;
	}
	public void setOrigem(String origem) {
		this.origem = origem;
	}
	public String getDestinatario() {
		return destinatario;
	}
	public void setDestinatario(String destinatario) {
		this.destinatario = destinatario;
	}
	public String getAssunto() {
		return assunto;
	}
	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}
	public String getCorpo() {
		return corpo;
	}
	public void setCorpo(String corpo) {
		this.corpo = corpo;
	}
	
	

}
