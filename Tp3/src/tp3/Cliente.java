package tp3;

public final class Cliente extends Contato {
	
	private Order orders[] = new Order[20];
	
	//Essa classe herda o construtor de Contato.java
	
	public String toString() {
		return "nome: "+ getNome() + "\nendereco: " + getEndereco() + "\nemail: " + getEmail()+ 
				"\nbiografia: " + getBiografia()+ "\ncpf: " +getCpf()+ "\ntelefone: " +getTelefone()+ "\n"; 
	}
	
	
	// GETTERS and SETTERS
	public Order[] getOrders() {
		return orders;
	}
	public void setOrders(Order[] orders) {
		this.orders = orders;
	}

	
	// CRUD
	public void cadastrarCliente(String nome, String email, String biografia, String endereco, String cpf, String telefone) {
		this.setNome(nome);
		this.setEmail(email);
		this.setBiografia(biografia);
		this.setEndereco(endereco);
		this.setCpf(cpf);
		this.setTelefone(telefone);
	}
	
	public void mostrarCliente(Cliente cliente) {
			
	}
	
	public void atualizarCliente(Cliente cliente) {
		
	}
	
	public void deletarCliente(Cliente cliente) {
		
	}
}
