package model;

public class Insumo {
	private int id;
	private String nome;
	private double qtdEstoque;
	private String unidadeMedida;
	
	public Insumo(int id, String nome, double qtdEstoque, String unidadeMedida) {
		this.id = id;
		this.nome = nome;
		this.qtdEstoque = qtdEstoque;
		this.unidadeMedida = unidadeMedida;
	}
	
	public int getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}
	public double getQtdEstoque() {
		return qtdEstoque;
	}
	public String getUnidadeMedida() {
		return unidadeMedida;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setQtdEstoque(double qtdEstoque) {
		this.qtdEstoque = qtdEstoque;
	}
	public void setUnidadeMedida(String unidadeMedida) {
		this.unidadeMedida = unidadeMedida;
	}

}
