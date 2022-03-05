package tp3;


public class Main {
	
	static Cliente clientes[] = new Cliente [3];
	static Worker workers[] = new Worker [2];
	static Job jobs[] = new Job[3];
	static Order orders[] = new Order[1];

	public static void main(String[] args) {
		
		//CADASTRAR CLIENTES
		for(int i=0; i<clientes.length; i++) {
			clientes[i] = new Cliente();
		}
		
		
		//MOSTRAR CLIENTES
		clientes[0].mostrarCliente();
		//System.out.println(clientes[0]);
		
		
		//ATUALIZAR CLIENTE
		clientes[0].atualizarCliente("nome", "novo nome de cliente 1");
		clientes[1].atualizarCliente("nome", "novo nome de cliente 2");
		clientes[2].atualizarCliente("nome", "jose");
		System.out.println(clientes[0]);
		
		
		//DELETAR CLIENTE
		clientes[0] = Cliente.deletarCliente(clientes[0]);
		System.out.println(clientes[0]+"\n");
		
		
		
		
		//CADASTRAR JOB
		jobs[0] = Job.cadastrarJob("encanador");
		jobs[1] = Job.cadastrarJob("mecanico");
		jobs[2] = Job.cadastrarJob("mecanico premium");
		
		
		//MOSTRAR JOB
		jobs[0].mostrarJob();
		
		
		//ATUALIZAR JOB
		jobs[0].atualizarJob("encanador premium");
		System.out.println(jobs[0]);
		
		
		//DELETAR JOB
		jobs[0] = Job.deletarJob(jobs[0]);
		System.out.println(jobs[0]+"\n");
		
		
		
		
		//CADASTRAR WORKER
		Worker workers[] = new Worker [2];
		for(int i=0; i<workers.length; i++) {
			workers[i] = new Worker();
		}
		
		
		//MOSTRAR WORKER
		workers[0].mostrarWorker();
		
		
		//ATUALIZAR WORKER
		workers[0].atualizarWorker("nome", "novo nome de trabalhador1");
		workers[1].atualizarWorker("nome", "novo nome de trabalhador2");
		workers[1].atualizarWorker(jobs, "mecanico premium");
		System.out.println(workers[0]);
		
		
		//DELETAR WORKER
		workers[0] = Worker.deletarWorker(workers[0]);
		System.out.println(workers[0]+"\n");
		
		
		
		
		//CADASTRAR ORDER
		orders[0] = Order.cadastrarOrder(clientes[1], workers[1], 99.99, 4.8);
		
		
		//MOSTRAR ORDER
		orders[0].mostrarOrder();
		
		
		//ATUALIZAR ORDER
		orders[0].atualizarOrder(clientes, "jose");
		System.out.println(orders[0]);
		
		
		//DELETAR ORDER
		orders[0] = Order.deletarOrder(orders[0]);
		System.out.println(workers[0]+"\n");
		
		
		// IMPRIMIR LISTA DE CPFS DE TRABALHADORES CADASTRADOS COMO MECANICO PREMIUM
		String teste[] = jobs[2].getCpfs();
		for (int i = 0; i < teste.length; i++) {
			System.out.println(teste[i]);
		}
		
	}

}
