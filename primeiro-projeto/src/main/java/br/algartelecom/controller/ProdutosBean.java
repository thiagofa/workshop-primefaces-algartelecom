package br.algartelecom.controller;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.algartelecom.bean.Produto;

@ManagedBean
@ViewScoped
public class ProdutosBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Produto produtoSelecionado;
	private Produto produto;
	private List<Produto> produtos;
	
	@PostConstruct
	public void inicializar() {
		produtos = new ArrayList<>();
		produtos.add(new Produto("Arroz", "Alimentos", 
				new BigDecimal(10.5), 40));
		produtos.add(new Produto("Feijão", "Alimentos", 
				new BigDecimal(6.23), 93));
		produtos.add(new Produto("Água mineral", "Bebidas", 
				new BigDecimal(3.4), 102));
	}
	
	public void prepararNovoProduto() {
		System.out.println("Preparando...");
		produto = new Produto();
	}
	
	public void incluir() {
		produtos.add(produto);
		
		//RequestContext.getCurrentInstance().execute("novoProdutoWidget.hide()");
	}
	
	public void excluir() {
		produtos.remove(produtoSelecionado);
	}
	
	public List<Produto> getProdutos() {
		return produtos;
	}

	public Produto getProduto() {
		return produto;
	}

	public Produto getProdutoSelecionado() {
		return produtoSelecionado;
	}

	public void setProdutoSelecionado(Produto produtoSelecionado) {
		this.produtoSelecionado = produtoSelecionado;
	}
	
}
