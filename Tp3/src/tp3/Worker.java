package tp3;

public final class Worker extends Contato {

	private int orders_count;
	private double rate;
	private Job job;
	
	
	// Metodo Construtor
	public Worker() {
		nome ="desconhecido";
		endereco = "desconhecido";
		email = "desconhecido";
		biografia = "desconhecido";
		cpf = "00000000000";
		telefone = "00000000000";
		orders_count = 0;
		rate = 0.00;
		job = new Job("sem especializacao");
	}
	
	
	public String toString() {
		return "\nWORKER\nnome: "+ getNome() + "\nendereco: " + getEndereco() + "\nemail: " + getEmail()+ 
				"\nbiografia: " + getBiografia()+ "\ncpf: " +getCpf()+ "\ntelefone: " +
				getTelefone()+ "\nordens: " + getOrders_count()+ "\navaliacao: "+
				getRate()+"\nespecializacao: "+getJob().getNome()+"\n"; 
	}
	
	
	// GETTERS and SETTERS
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
	public static Worker cadastrarWorker(String nome, String email, String biografia, String endereco, String cpf, String telefone, Job job) {
		Worker worker = new Worker();
		
		worker.setNome(nome);
		worker.setEmail(email);
		worker.setBiografia(biografia);
		worker.setEndereco(endereco);
		worker.setCpf(cpf);
		worker.setTelefone(telefone);
		worker.setJob(job);
		worker.setOrders_count(0);
		worker.setRate(0);
		
		return worker;
	}
	
	public void mostrarWorker() {
			System.out.println("\nWORKER\nnome: "+ getNome() + "\nendereco: " + getEndereco() + "\nemail: " + getEmail()+ 
					"\nbiografia: " + getBiografia()+ "\ncpf: " +getCpf()+ "\ntelefone: " +
					getTelefone()+ "\nordens: " + getOrders_count()+ "\navaliacao: "+
					getRate()+"\nespecializacao: "+getJob().getNome()+"\n");
	}
	
	public void atualizarWorker(String atributo, String att) {
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
		case "job":
			job.atualizarJob(att);
			break;
		default:
			break;
	}
	}
	
	public static Worker deletarWorker(Worker worker) {
		worker = null;
		return worker;
	}
	
}
