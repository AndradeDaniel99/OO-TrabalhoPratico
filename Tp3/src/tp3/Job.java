package tp3;

public class Job {

	private String nome;
	private int ids[] = new int[1000];
	private double rate;
	
	
	// Metodo construtor
	public Job(String nome) {
		this.nome = nome;
		rate = 0.00;
	}
	
	
	public String toString() {
		return "Especializacao: "+nome+"\nAvaliacao: "+rate+"\n";
	}
	
	
	// GETTERS and SETTERS
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int[] getIds() {
		return ids;
	}
	public void setIds(int[] ids) {
		this.ids = ids;
	}
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
}
