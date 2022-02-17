package tp3;

import java.util.Date;

public class Order {

	private Date data_emissao;
	private Date data_order;
	private String status;
	private Cliente cliente;
	private Worker worker;
	private float valor;
	private double rate;
	
	
	
	
	
	public Date getData_emissao() {
		return data_emissao;
	}
	public void setData_emissao(Date data_emissao) {
		this.data_emissao = data_emissao;
	}
	public Date getData_order() {
		return data_order;
	}
	public void setData_order(Date data_order) {
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
	public float getValor() {
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
