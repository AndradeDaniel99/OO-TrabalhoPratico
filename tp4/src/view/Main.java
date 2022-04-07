package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import tp4.*;

// a main imprime testes no console. 
// a impressao no console esta detalhada nos comentarios

public class Main implements ActionListener {
	
	
	static Cliente clientes[] = new Cliente [3];
	static Worker workers[] = new Worker [3];
	static Job jobs[] = new Job[3];
	static Order orders[] = new Order[2];
	
	
	private static JFrame janela = new JFrame("Marido de Aluguel 1.0");
	private static JLabel titulo = new JLabel("Menu principal");
	private static JButton clienteButton = new JButton("Cliente");
	private static JButton workerButton = new JButton("Marido de aluguel");
	private static JButton jobButton = new JButton("Especialidades");
	
	public Main() {
		titulo.setFont(new Font("Arial", Font.BOLD, 20));
		titulo.setBounds(120, 10, 150, 30);
		clienteButton.setBounds(120, 60, 150, 30);
		workerButton.setBounds(120, 100, 150, 30);
		jobButton.setBounds(120, 140, 150, 30);
		
		janela.setLayout(null);
		
		janela.add(titulo);
		janela.add(clienteButton);
		janela.add(workerButton);
		janela.add(jobButton);
		
		janela.setSize(400, 250);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setVisible(true);
	}
	

	public static void main(String[] args) {
		
		Main menu = new Main();
		
		clienteButton.addActionListener(menu);
		workerButton.addActionListener(menu);
		jobButton.addActionListener(menu);
		
		
		//CADASTRAR CLIENTES
		//teste 
		
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
		for(int i=0; i<workers.length; i++) {
			workers[i] = new Worker();
		}
		
		
		//MOSTRAR WORKER
		workers[0].mostrarWorker();
		
		
		//ATUALIZAR WORKER
		workers[0].atualizarWorker("nome", "novo nome de trabalhador1");
		workers[1].atualizarWorker("nome", "novo nome de trabalhador2");
		workers[1].atualizarWorker("cpf", "12344667891");
		workers[1].atualizarWorker(jobs, "mecanico premium");
		workers[2].atualizarWorker(jobs, "mecanico premium");
		System.out.println(workers[0]);
		
		
		//DELETAR WORKER
		workers[0] = Worker.deletarWorker(workers[0]);
		System.out.println(workers[0]+"\n");
		
		
		
		
		//CADASTRAR ORDER
		orders[0] = Order.cadastrarOrder(clientes[1], workers[1], 99.99, 4.8);
		orders[1] = Order.cadastrarOrder(clientes[1], workers[2], 99.99, 5.2);
		
		
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

	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		
		if(src == clienteButton)
			new TelaContato().mostrarDados(clientes);
		
		if(src == workerButton)
			JOptionPane.showMessageDialog(null, 
					"Ainda precisam ser implementadas as funcionalidades\n", null, 
					JOptionPane.INFORMATION_MESSAGE);
			//new TelaContato().mostrarDados(workers);
		
		if(src == jobButton)
			JOptionPane.showMessageDialog(null, 
					"Ainda precisam ser implementadas as funcionalidades\n", null, 
					JOptionPane.INFORMATION_MESSAGE);
			//new TelaContato().mostrarDados(jobs);
	}
}
