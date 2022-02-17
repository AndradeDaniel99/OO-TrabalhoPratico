package tp3;

public final class Worker extends Contato {

	private int id;
	private int orders_count;
	private double rate;
	private Job job;
	
	
	
	
	
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
}
