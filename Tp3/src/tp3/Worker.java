package tp3;

public final class Worker extends Contato {

	private int id;
	private int orders_count;
	private double rate;
	private Job job;
	
	
	// Metodo Construtor
	public Worker() {
		orders_count = 0;
		rate = 0.00;
		job = new Job("sem especializacao");
	}
	
	
	public String toString() {
		return "nome: "+ getNome() + "\nendereco: " + getEndereco() + "\nemail: " + getEmail()+ 
				"\nbiografia: " + getBiografia()+ "\ncpf: " +getCpf()+ "\ntelefone: " +
				getTelefone()+ "\nordens: " + getOrders_count()+ "\navaliacao: "+
				getRate()+"\nespecializacao: "+getJob().getNome(); 
	}
	
	
	// GETTERS and SETTERS
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getOrders_count() {
		return orders_count;
	}
	public void setOrders_count(int orders_count) {
		this.orders_count = orders_count;
	}
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
	public Job getJob() {
		return job;
	}
	public void setJob(Job job) {
		this.job = job;
	}
	
	
	// CRUD
	public void cadastrarWorker() {
		
	}
	
	public void mostrarWorker() {
			
	}
	
	public void atualizarWorker() {
		
	}
	
	public void deletarWorker() {
	
	}
	
}
