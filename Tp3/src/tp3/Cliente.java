package tp3;

public final class Cliente extends Contato {
	
	private Order orders[] = new Order[20];
	

	// CONSTRUTORES
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
	public void setOrder(Order order) {
		for (int i = 0; i < orders.length; i++) {
			if (orders[i]==null) {
				orders[i]=order;
				break;
			}
		}
	}

	
	// CRUD
	
	public void mostrarCliente() {
		System.out.println("CLIENTE\nnome: "+ this.getNome() + "\nendereco: " + this.getEndereco() + 
				"\nemail: " + this.getEmail()+ "\nbiografia: " + this.getBiografia()+ 
				"\ncpf: " +this.getCpf()+ "\ntelefone: " +this.getTelefone()+ "\n");
	}
	
	public void atualizarCliente(String atributo, String att) {
		switch(atributo) {
			case "nome":
				this.setNome(att);
				break;
			case "email":
				this.setEmail(att);
				break;
			case "biografia":
				this.setBiografia(att);
				break;
			case "endereco":
				this.setEndereco(att);
				break;
			case "cpf":
				this.setCpf(att);
				break;
			case "telefone":
				this.setTelefone(att);
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
