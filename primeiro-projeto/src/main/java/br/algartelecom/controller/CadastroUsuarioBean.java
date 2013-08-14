package br.algartelecom.controller;

import javax.faces.application.FacesMessage;
import javax.faces.application.FacesMessage.Severity;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@ViewScoped
public class CadastroUsuarioBean {

	private String login;
	private String nome;
	
	public void verificarLogin() {
		FacesContext context = FacesContext.getCurrentInstance();
		
		if ("joao".equals(login)) {
			context.addMessage(null, 
					new FacesMessage(FacesMessage.SEVERITY_ERROR, 
							"Login já está em uso.", "Login já está em uso."));
		} else {
			context.addMessage(null, 
					new FacesMessage(FacesMessage.SEVERITY_INFO, 
							"Login disponível.", "Login disponível."));
		}
	}
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
