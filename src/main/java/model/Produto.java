package model;

import java.math.BigDecimal;

public class Produto {
	private int id;
	private String nome;
	private BigDecimal preco;
	private Categoria categoria;
	
	public Produto(int id, String nome, BigDecimal preco, Categoria categoria) {
		this.id = id;
		this.nome = nome;
		this.preco = preco;
		this.categoria = categoria;
	}
	
	public int getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}
	public BigDecimal getPreco() {
		return preco;
	}
	public Categoria getCategoria() {
		return categoria;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	

}

