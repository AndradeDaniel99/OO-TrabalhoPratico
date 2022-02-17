package tp3;

public abstract class Contato {
	
	
	protected String nome;
	protected String endereco;
	protected String email;
	protected String biografia;
	protected int cpf;
	protected int telefone;
	
	
	public Contato() {
		nome ="desconhecido";
		endereco = "desconhecido";
		email = "desconhecido";
		biografia = "desconhecido";
		cpf = 0;
		telefone = 0;
	}
	
	public Contato(String nome, String endereco, String email, String biografia, int cpf, int telefone) {
		this.nome = nome;
		this.endereco = endereco;
		this.email = email;
		this.biografia = biografia;
		this.cpf = cpf;
		this.telefone = telefone;
	}
	
	
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
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
}
