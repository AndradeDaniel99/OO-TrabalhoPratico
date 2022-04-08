package tp4;

/**
 * Classe que representa dados de contato
 * @author danieldeandradesouza
 *
 */
public abstract class Contato {
	
	
	protected String nome;
	protected String endereco;
	protected String email;
	protected String biografia;
	protected String cpf;
	protected String telefone;
	
	
	/**
	 * o primeiro construtor nao recebe parametros
	 * o segundo construtor precisa de todos os parametros de atributos
	 */
	public Contato() {
		nome ="desconhecido";
		endereco = "desconhecido";
		email = "desconhecido";
		biografia = "desconhecido";
		cpf = "00000000000";
		telefone = "00000000000";
	}
	
	public Contato(String nome, String endereco, String email, String biografia, String cpf, String telefone) {
		this.nome = nome;
		this.endereco = endereco;
		this.email = email;
		this.biografia = biografia;
		this.cpf = cpf;
		this.telefone = telefone;
	}
	
	
	/**
	 * Getters e setters da classe
	 * @return
	 */
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getBiografia() {
		return biografia;
	}
	public void setBiografia(String biografia) {
		this.biografia = biografia;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
}
