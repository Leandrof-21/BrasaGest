package model;

public class Funcionario {
	private int id;
	private String nome;
	private String login;
	private String senha;
	private Cargo cargo;
	
	public Funcionario(int id, String nome, String login, String senha, Cargo cargo) {
		this.id = id;
		this.nome = nome;
		this.login = login;
		this.senha = senha;
		this.cargo = cargo;
	}
	public int getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}
	public String getLogin() {
		return login;
	}
	public String getSenha() {
		return senha;
	}
	public Cargo getCargo() {
		return cargo;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}
}
