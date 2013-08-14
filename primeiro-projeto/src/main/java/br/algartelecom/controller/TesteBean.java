package br.algartelecom.controller;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

import br.algartelecom.bean.Pessoa;

@ManagedBean
public class TesteBean {

	private Pessoa pessoa;
	
	private List<Pessoa> pessoas;
	
	public TesteBean() {
		pessoa = new Pessoa();
	}

	@PostConstruct
	public void iniciar() {
		
	}
	
	public void preRender() {
		
	}
	
	public void testar() {
		StringBuilder sb = new StringBuilder();
		sb.append(pessoa.getNome());
		pessoa.setNomeInvertido(sb.reverse().toString());
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public List<Pessoa> getPessoas() {
		return pessoas;
	}

	public void setPessoas(List<Pessoa> pessoas) {
		this.pessoas = pessoas;
	}

}