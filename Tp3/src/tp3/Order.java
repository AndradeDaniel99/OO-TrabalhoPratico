package tp3;

import java.util.Calendar;

public class Order {

	private Calendar data_emissao = Calendar.getInstance();
	private Calendar data_order = Calendar.getInstance();
	private String status;
	private Cliente cliente;
	private Worker worker;
	private double valor;
	private double rate;
	
	
	public Order(Cliente cliente, Worker worker) {
		this.cliente = cliente;
		this.worker = worker;
		status = "Aberta";
		valor = 0.00;
		rate = 0.00;
	}
	
	
	public String toString() {
		return "data de emissao: "+data_emissao+"\nData marcada: "+data_order+"\nStatus: "+status+"\nCliente: "+
	cliente.getNome()+"\nMarido: "+worker.getNome()+"\nValor: "+valor+"\nAvaliacao: "+rate+"\n";
	}
	
	
	public Calendar getData_emissao() {
		return data_emissao;
	}
	public void setData_emissao(Calendar data_emissao) {
		this.data_emissao = data_emissao;
	}
	public Calendar getData_order() {
		return data_order;
	}
	public void setData_order(Calendar data_order) {
		this.data_order = data_order;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
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
}
