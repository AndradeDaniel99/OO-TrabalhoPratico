package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

import tp4.*;

public class TelaContato implements ActionListener, ListSelectionListener {

	private JFrame janela;
	private JLabel titulo;
	private JButton cadastroCliente;
	private JButton refreshCliente;
	private JButton cadastroWorker;
	private JButton refreshWorker;
	public JList<String> listaClientesCadastrados;
	public JList<String> listaWorkerCadastrados;
	String[] listaNomes = new String[10];
	private Cliente c[] = new Cliente[10];
	private Worker w[] = new Worker[10];
	
	
	public void mostrarDados(Cliente clientes[]) {
		for(int i =0; i<clientes.length; i++) {
			if(clientes[i]!=null) {
				c[i]=clientes[i];
				listaNomes[i]=clientes[i].getNome();
			}
		}
		listaClientesCadastrados = new JList<String>(Main.nomesCliente());
		janela = new JFrame("Clientes");
		titulo = new JLabel("Clientes Cadastrados");
		cadastroCliente = new JButton("Cadastrar");
		refreshCliente = new JButton("Atualizar");

		titulo.setFont(new Font("Arial", Font.BOLD, 20));
		titulo.setBounds(90, 10, 250, 30);
		listaClientesCadastrados.setBounds(20, 50, 350, 120);
		listaClientesCadastrados.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		listaClientesCadastrados.setVisibleRowCount(10);

		cadastroCliente.setBounds(70, 177, 100, 30);
		refreshCliente.setBounds(200, 177, 100, 30);

		janela.setLayout(null);

		janela.add(titulo);
		janela.add(listaClientesCadastrados);
		janela.add(cadastroCliente);
		janela.add(refreshCliente);

		janela.setSize(400, 250);
		janela.setVisible(true);

		cadastroCliente.addActionListener(this);
		refreshCliente.addActionListener(this);
		listaClientesCadastrados.addListSelectionListener(this);
	}
	
	public void mostrarDados(Worker workers[]) {
		for(int i =0; i<workers.length; i++) {
			if(workers[i]!=null) {
				listaNomes[i]=workers[i].getNome();
				w[i]=workers[i];
			}
		}
		listaWorkerCadastrados = new JList<String>(listaNomes);
		janela = new JFrame("Maridos de aluguel");
		titulo = new JLabel("Maridos Cadastrados");
		cadastroWorker = new JButton("Cadastrar");
		refreshWorker = new JButton("Atualizar");

		titulo.setFont(new Font("Arial", Font.BOLD, 20));
		titulo.setBounds(90, 10, 250, 30);
		listaWorkerCadastrados.setBounds(20, 50, 350, 120);
		listaWorkerCadastrados.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		listaWorkerCadastrados.setVisibleRowCount(10);

		cadastroWorker.setBounds(70, 177, 100, 30);
		refreshWorker.setBounds(200, 177, 100, 30);

		janela.setLayout(null);

		janela.add(titulo);
		janela.add(listaWorkerCadastrados);
		janela.add(cadastroWorker);
		janela.add(refreshWorker);

		janela.setSize(400, 250);
		janela.setVisible(true);

		cadastroWorker.addActionListener(this);
		refreshWorker.addActionListener(this);
		listaWorkerCadastrados.addListSelectionListener(this);
		
	}

	public void mostrarDados(Job jobs[]) {
	
	
	}
	
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		
		//Cadastro de novo cliente
		if(src == cadastroCliente)
			new TelaDetalheContato().inserirEditar(1, c, this, 0);

		//Cadastro de novo worker
		if(src == cadastroWorker)
			JOptionPane.showMessageDialog(null, 
					"Ainda precisam ser implementadas as funcionalidades\n", null, 
					JOptionPane.INFORMATION_MESSAGE);
			//new TelaDetalhePessoa().inserirEditar(2, dados, this, 0);

		// Atualiza a lista de nomes de clientes mostrada no JList
		if(src == refreshCliente) {
			listaClientesCadastrados.setListData(Main.nomesCliente());
			listaClientesCadastrados.updateUI();
		}

		// Atualiza a lista de nomes de workers mostrada no JList
		if(src == refreshWorker) {
			listaWorkerCadastrados.setListData(listaNomes);
			listaWorkerCadastrados.updateUI();
		}
	}

	public void valueChanged(ListSelectionEvent e) {
		Object src = e.getSource();

		if(e.getValueIsAdjusting() && src == listaClientesCadastrados) {
			new TelaDetalheContato().inserirEditar(2, c, this, listaClientesCadastrados.getSelectedIndex());
			
		}

		if(e.getValueIsAdjusting() && src == listaWorkerCadastrados) {
			//new TelaDetalhePessoa().inserirEditar(4, dados, this, 
			//		listaProfsCadastrados.getSelectedIndex());
		}
	}
}
