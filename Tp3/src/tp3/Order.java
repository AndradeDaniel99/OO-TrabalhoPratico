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
		
		// AQUI A FUNCAO CALCULA A AVALIACAO DO TRABALHADOR
		worker.sumOrders_count();
		worker.setPrerate(rate);
		worker.setRate(worker.getPrerate()/worker.getOrders_count());
		
		//E A AVALIACAO DA ESPECIALIZACAO
		worker.getJob().setPrerate(worker.getRate());
		worker.getJob().sumOrdersCount();
		worker.getJob().setRate(worker.getJob().getPrerate()/worker.getJob().getOrdersCount());
		
		cliente.setOrder(order);
		return order;
	}
	
	public void mostrarOrder() {
			System.out.println("ORDER\nCliente: "+cliente.getNome()+"\n"+getWorker().getJob().getNome()+ ": "+
		getWorker().getNome()+"\nValor: "+getValor()+"\nAvaliacao: "+getRate()+"\n");
	}
	
	
	public void atualizarOrder(Cliente clientes[], String att) {
		for (int i = 0; i < clientes.length; i++) {
			if (clientes[i]!=null) {
				if (clientes[i].getNome()==att) {
					this.setCliente(clientes[i]);
				}
			}
		}
	}
	
	// SOBRECARGA DO METODO 
	public void atualizarOrder(Worker workers[], String att) {
		for (int i = 0; i < workers.length; i++) {
			if (workers[i]!=null) {
				if (workers[i].getNome()==att) {
					this.setWorker(workers[i]);
					
					// CALCULO DA AVALIACAO DO TRABALHADOR = prerate / orders_count
					this.getWorker().sumOrders_count();
					this.getWorker().setPrerate(rate);
					this.getWorker().setRate(this.getWorker().getPrerate()/this.getWorker().getOrders_count());
					
					//E A AVALIACAO DA ESPECIALIZACAO = prerate / ordersCount
					this.getWorker().getJob().setPrerate(rate);
					this.getWorker().getJob().sumOrdersCount();
					this.getWorker().getJob().setRate(this.getWorker().getJob().getPrerate()/this.getWorker().getJob().getOrdersCount());
				}
			}
		}
	}
	
	
	public static Order deletarOrder(Order order) {
		order = null;
		return order;
	}
}
