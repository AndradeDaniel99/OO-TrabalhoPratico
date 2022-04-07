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
	private JList<String> listaClientesCadastrados;
	private JList<String> listaWorkerCadastrados;
	String[] listaNomes = new String[50];
	
	public void mostrarDados(Cliente clientes[]) {
		for(int i =0; i<clientes.length; i++) {
			if(clientes[i]!=null) {
				listaNomes[i]=clientes[i].getNome();
			}
				
		}
		listaClientesCadastrados = new JList<String>(listaNomes);
		janela = new JFrame("Clientes");
		titulo = new JLabel("Clientes Cadastrados");
		cadastroCliente = new JButton("Cadastrar");
		refreshCliente = new JButton("Atualizar");

		titulo.setFont(new Font("Arial", Font.BOLD, 20));
		titulo.setBounds(90, 10, 250, 30);
		listaClientesCadastrados.setBounds(20, 50, 350, 120);
		listaClientesCadastrados.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
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
			JOptionPane.showMessageDialog(null, 
					"Ainda precisam ser implementadas as funcionalidades\n", null, 
					JOptionPane.INFORMATION_MESSAGE);
			//new TelaDetalhePessoa().inserirEditar(1, dados, this, 0);

		//Cadastro de novo worker
		if(src == cadastroWorker)
			JOptionPane.showMessageDialog(null, 
					"Ainda precisam ser implementadas as funcionalidades\n", null, 
					JOptionPane.INFORMATION_MESSAGE);
			//new TelaDetalhePessoa().inserirEditar(2, dados, this, 0);

		// Atualiza a lista de nomes de clientes mostrada no JList
		if(src == refreshCliente) {
			listaClientesCadastrados.setListData(listaNomes);			
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
			//new TelaDetalhePessoa().inserirEditar(3, dados, this, 
					//listaAlunosCadastrados.getSelectedIndex());
		}

		if(e.getValueIsAdjusting() && src == listaWorkerCadastrados) {
			//new TelaDetalhePessoa().inserirEditar(4, dados, this, 
			//		listaProfsCadastrados.getSelectedIndex());
		}
	}
}
