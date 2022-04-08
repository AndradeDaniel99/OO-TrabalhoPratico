package tp4;

/**
 * Classe modelo para abstrair dados de um cliente
 * 
 * @author danieldeandradesouza
 * @version 1.0 (Apr 2022)
 */

public final class Cliente extends Contato {
	
	private Order orders[] = new Order[20];
	

	/**
	 * O primeiro construtor nao recebe parametro e inicializa valores arbitrarios
	 * O segundo construtor precisa receber todos os parametros de atributos da classe
	 */
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
	
/**
 * @deprecated
 */
	public String toString() {
		return getNome(); 
	}
	
	
	/**
	 * Getters e Setters da classe, no caso so tem order pq os outros foram herdados de Contato
	 * @return lista de ordens de um cliente
	 */
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

	
	
	/**
	 * Imprime no console todos os dados de um cliente
	 */
	public void mostrarCliente() {
		System.out.println("CLIENTE\nnome: "+ this.getNome() + "\nendereco: " + this.getEndereco() + 
				"\nemail: " + this.getEmail()+ "\nbiografia: " + this.getBiografia()+ 
				"\ncpf: " +this.getCpf()+ "\ntelefone: " +this.getTelefone()+ "\n");
	}
	
	/**
	 * atualiza os dados de um cliente
	 * @param atributo
	 * @param att
	 */
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
	
	/**
	 * deleta um cliente
	 * @param cliente
	 * @return cliente nulo
	 */
	public static Cliente deletarCliente(Cliente cliente) {
		cliente = null;
		return cliente;
	}
}
