package tp3;

public abstract class Contato {
	
	
	protected static String nome;
	protected static String endereco;
	protected static String email;
	protected static String biografia;
	protected static String cpf;
	protected static String telefone;
	
	
	// Construtores
	public Contato() {
		nome ="desconhecido";
		endereco = "desconhecido";
		email = "desconhecido";
		biografia = "desconhecido";
		cpf = "00000000000";
		telefone = "00000000000";
	}
	
	public Contato(String nome, String endereco, String email, String biografia, String cpf, String telefone) {
		Contato.nome = nome;
		Contato.endereco = endereco;
		Contato.email = email;
		Contato.biografia = biografia;
		Contato.cpf = cpf;
		Contato.telefone = telefone;
	}
	
	
	// GETTERS and SETTERS
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		Contato.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		Contato.endereco = endereco;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		Contato.email = email;
	}
	public String getBiografia() {
		return biografia;
	}
	public void setBiografia(String biografia) {
		Contato.biografia = biografia;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		Contato.cpf = cpf;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		Contato.telefone = telefone;
	}
}
