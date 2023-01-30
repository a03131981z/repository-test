package brincando_com_java;

public abstract class Pessoa {

	private String nome;
	private String cpf;
	private String funcao;
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCpf() {
		return this.cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getFuncao() {
		return this.funcao;
	}
	
	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}
}
