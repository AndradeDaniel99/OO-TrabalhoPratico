package tp3;

public final class Cliente extends Contato {
	
	private Order orders[] = new Order[20];
	

	public Cliente() {
		nome ="desconhecido";
		endereco = "desconhecido";
		email = "desconhecido";
		biografia = "desconhecido";
		cpf = "00000000000";
		telefone = "00000000000";
		}
	
	
	public Cliente(String nome, String email, String biografia, String endereco, String cpf, String telefone) {
		this.setNome(nome);
		this.setEmail(email);
		this.setBiografia(biografia);
		this.setEndereco(endereco);
		this.setCpf(cpf);
		this.setTelefone(telefone);
	}
	


	public String toString() {
		return "CLIENTE\nnome: "+ getNome() + "\nendereco: " + getEndereco() + "\nemail: " + getEmail()+ 
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
	public static Cliente cadastrarCliente(String nome, String email, String biografia, String endereco, String cpf, String telefone) {
		Cliente cliente = new Cliente();
		cliente.setNome(nome);
		cliente.setEmail(email);
		cliente.setBiografia(biografia);
		cliente.setEndereco(endereco);
		cliente.setCpf(cpf);
		cliente.setTelefone(telefone);
		return cliente;
	}
	
	public void mostrarCliente() {
		System.out.println("CLIENTE\nnome: "+ getNome() + "\nendereco: " + getEndereco() + "\nemail: " + getEmail()+ 
				"\nbiografia: " + getBiografia()+ "\ncpf: " +getCpf()+ "\ntelefone: " +getTelefone()+ "\n");
	}
	
	public void atualizarCliente(String atributo, String att) {
		switch(atributo) {
			case "nome":
				setNome(att);
				break;
			case "email":
				setEmail(att);
				break;
			case "biografia":
				setBiografia(att);
				break;
			case "endereco":
				setEndereco(att);
				break;
			case "cpf":
				setCpf(att);
				break;
			case "telefone":
				setTelefone(att);
				break;
			default:
				break;
		}
	}
	
	public static Cliente deletarCliente(Cliente cliente) {
		cliente = null;
		return cliente;
	}
}
