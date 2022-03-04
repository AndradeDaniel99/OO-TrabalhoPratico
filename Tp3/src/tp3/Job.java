package tp3;

public class Job {

	private String nome;
	private int cpfs[] = new int[10];
	private double rate;
	
	
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
	public int[] getIds() {
		return cpfs;
	}
	public void setIds(int[] ids) {
		this.cpfs = ids;
	}
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
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
