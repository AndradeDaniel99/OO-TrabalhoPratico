package tp3;


public class Main {
	
	static Cliente clientes[] = new Cliente [1];
	static Worker workers[] = new Worker [1];
	static Job jobs[] = new Job[2];
	static Order orders[] = new Order[1];

	public static void main(String[] args) {
		
		//CADASTRAR CLIENTES
		clientes[0]=Cliente.cadastrarCliente("teste", "teste", "teste", "teste", "teste", "teste");
		
		
		//MOSTRAR CLIENTES
		clientes[0].mostrarCliente();
		// OU AINDA:
		//System.out.println(clientes[0]);
		
		
		//ATUALIZAR CLIENTE
		clientes[0].atualizarCliente("nome", "novo nome");
		clientes[0].atualizarCliente("email", "novoemail@email.com");
		System.out.println(clientes[0]);
		
		
		//DELETAR CLIENTE
		clientes[0] = Cliente.deletarCliente(clientes[0]);
		System.out.println(clientes[0]+"\n");
		
		
		
		
		//CADASTRAR JOB
		jobs[0] = Job.cadastrarJob("encanador");
		jobs[1] = Job.cadastrarJob("mecanico");
		
		
		//MOSTRAR JOB
		jobs[0].mostrarJob();
		
		
		//ATUALIZAR JOB
		jobs[0].atualizarJob("encanador premium");
		System.out.println(jobs[0]);
		
		
		//DELETAR JOB
		jobs[0] = Job.deletarJob(jobs[0]);
		System.out.println(jobs[0]+"\n");
		
		
		
		
		//CADASTRAR WORKER
		workers[0]=Worker.cadastrarWorker("teste", "teste", "teste", "teste", "teste", "teste", jobs[1]);
		
		
		//MOSTRAR WORKER
		workers[0].mostrarWorker();
		
		
		//ATUALIZAR WORKER
		workers[0].atualizarWorker("nome", "novo nome de trabalhador");
		workers[0].atualizarWorker("job", "mecanico premium");
		System.out.println(workers[0]);
		
		
		//DELETAR WORKER
		workers[0] = Worker.deletarWorker(workers[0]);
		System.out.println(workers[0]+"\n");
		
		
		
		
		//CADASTRAR ORDER
		
		
	}

}
