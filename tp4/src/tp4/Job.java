package tp4;

/**
 * Classe que representa os dados de especialidades dos maridos de aluguel
 * @author danieldeandradesouza
 *
 */
public class Job {

	private String nome;
	private String cpfs[] = new String [10];
	private double rate = 0.0;                 //avaliacao
	private double prerate = 0.0;              //variavel usada pra calcular a avaliacao
	private int ordersCount = 0;               //total de ordens criadas pra essa especializacao
	
	
	// Metodo construtor
	public Job(String nome) {
		this.nome = nome;
		rate = 0.00;
	}
	
	
	public String toString() {
		return "JOB\nEspecializacao: "+getNome()+"\nAvaliacao: "+getRate()+"\n";
	}
	
	
	// GETTERS and SETTERS
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String[] getCpfs() {
		return cpfs;
	}
	public void setCpf(String cpf) {
		for (int i = 0; i < cpfs.length; i++) {
			if (cpfs[i]==null) {
				cpfs[i] = cpf;
				break;
			}
		}
	}
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
	public double getPrerate() {
		return prerate;
	}
	public void setPrerate(double prerate) {
		this.prerate += prerate;
	}
	public int getOrdersCount() {
		return ordersCount;
	}
	public void sumOrdersCount() {
		this.ordersCount++;
	}
	
	
	
	
	// CRUD
		public static Job cadastrarJob(String nome) {
			Job job = new Job(nome);
			return job;
		}
		
		public void mostrarJob() {
				System.out.println("JOB\nEspecializacao: "+getNome()+"\nAvaliacao: "+getRate()+"\n");
		}
		
		public void atualizarJob(String att) {
			setNome(att);
		}
		
		public static Job deletarJob(Job job) {
		job = null;
		return job;
		}
	
}
