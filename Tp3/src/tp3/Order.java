package tp3;

public class Order {

	private Cliente cliente;
	private Worker worker;
	private double valor;
	private double rate;
	
	
	// Metodo construtor
	public Order(Cliente cliente, Worker worker, double valor) {
		this.cliente = cliente;
		this.worker = worker;
		this.valor = valor;
		rate = 0.00;
	}
	
	
	public String toString() {
		return "ORDER\nCliente: "+getCliente().getNome()+"\n"+getWorker().getJob().getNome()+ ": "+
		getWorker().getNome()+"\nValor: "+getValor()+"\nAvaliacao: "+getRate()+"\n";
	}
	
	
	// GETTERS and SETTERS
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Worker getWorker() {
		return worker;
	}
	public void setWorker(Worker worker) {
		this.worker = worker;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
	
	
	// CRUD
	public static Order cadastrarOrder(Cliente cliente, Worker worker, double valor, double rate) {
		Order order = new Order(cliente, worker, valor);
		order.rate = rate;
		return order;
	}
	
	public void mostrarOrder() {
			System.out.println("ORDER\nCliente: "+getCliente().getNome()+"\n"+getWorker().getJob().getNome()+ ": "+
		getWorker().getNome()+"\nValor: "+getValor()+"\nAvaliacao: "+getRate()+"\n");
	}
	
	/*
	public void atualizarOrder(String atributo, String att) {
		switch(atributo) {
			case "cliente":
				
				break;
			default:
				break;
		}
	}
	*/
	
	public static Order deletarOrder(Order order) {
		order = null;
		return order;
	}
}
