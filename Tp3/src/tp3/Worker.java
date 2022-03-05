package tp3;

public final class Worker extends Contato {

	private int orders_count=0;
	private double prerate=0.0;
	private double rate=0.0;
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
	public void sumOrders_count() {
		this.orders_count++;
	}
	public double getPrerate() {
		return prerate;
	}
	public void setPrerate(double prerate) {
		this.prerate += prerate;
	}
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate += rate;
	}
	public Job getJob() {
		return job;
	}
	public void setJob(Job job) {
		this.job = job;
	}
	
	
	// CRUD
	
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
			default:
				break;
		}
	}
	
	// SOBRECARGA DO METODO
	public void atualizarWorker(Job jobs[], String att) {
		
		// AQUI A FUNCAO DELETA O CPF DO TRABALHADOR DA LISTA DE CPFS DA ANTIGA ESPECIALIZACAO
		this.getJob().setCpf(null);
		
		for (int i = 0; i < jobs.length; i++) {
			if (jobs[i]!=null) {
				if (jobs[i].getNome()==att) {
					
					//AQUI A FUNCAO ATUALIZA A NOVA ESPECIALIZACAO DO TRABALHADOR, 
					// E ADICIONA O CPF DELE NA LISTA DE CPFS DA NOVA ESPECIALIZACAO.
					this.setJob(jobs[i]);
					jobs[i].setCpf(this.getCpf());
					break;
				}
			}
			
		}
	}
	
	
	public static Worker deletarWorker(Worker worker) {
		worker = null;
		return worker;
	}
	
}
