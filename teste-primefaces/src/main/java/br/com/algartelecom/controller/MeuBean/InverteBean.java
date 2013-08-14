package br.com.algartelecom.controller.MeuBean;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class InverteBean {

	private String nome;
	
	public void inverter() {
		nome = "abc";
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
