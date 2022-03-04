package tp3;

public class Order {

	private Cliente cliente;
	private Worker worker;
	private double valor;
	private double rate;
	
	
	// Metodo construtor
	public Order(Cliente cliente, Worker worker) {
		this.cliente = cliente;
		this.worker = worker;
		valor = 0.00;
		rate = 0.00;
	}
	
	
	public String toString() {
		return "\nCliente: "+getCliente().getNome()+"\n"+getWorker().getJob().getNome()+ ": "+
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
	public void cadastrarOrder() {
		
	}
	
	public void mostrarOrder() {
			
	}
	
	public void atualizarOrder() {
		
	}
	
	public void deletarOrder() {
	
	}
}
