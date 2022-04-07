package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

import tp4.*;

public class TelaJob implements ActionListener, ListSelectionListener {

	private JFrame janela;
	private JLabel titulo;
	private JButton cadastroJob;
	private JButton refreshJob;
	private JList<String> listaJobCadastrados;
	String[] listaJobs = new String[50];
	
	public void mostrarDados(Job jobs[]) {
		for(int i =0; i<jobs.length; i++) {
			if(jobs[i]!=null) {
				listaJobs[i]=jobs[i].getNome();
			}
		}
		listaJobCadastrados = new JList<String>(listaJobs);
		janela = new JFrame("Especialidades");
		titulo = new JLabel("Especialidades Cadastradas");
		cadastroJob = new JButton("Cadastrar");
		refreshJob = new JButton("Atualizar");

		titulo.setFont(new Font("Arial", Font.BOLD, 16));
		titulo.setBounds(90, 10, 250, 30);
		listaJobCadastrados.setBounds(20, 50, 350, 120);
		listaJobCadastrados.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		listaJobCadastrados.setVisibleRowCount(10);

		cadastroJob.setBounds(70, 177, 100, 30);
		refreshJob.setBounds(200, 177, 100, 30);

		janela.setLayout(null);

		janela.add(titulo);
		janela.add(listaJobCadastrados);
		janela.add(cadastroJob);
		janela.add(refreshJob);

		janela.setSize(400, 250);
		janela.setVisible(true);

		cadastroJob.addActionListener(this);
		refreshJob.addActionListener(this);
		listaJobCadastrados.addListSelectionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		
		//Cadastro de novo job
		if(src == cadastroJob)
			JOptionPane.showMessageDialog(null, 
					"Ainda precisam ser implementadas as funcionalidades\n", null, 
					JOptionPane.INFORMATION_MESSAGE);
			//new TelaDetalhePessoa().inserirEditar(1, dados, this, 0);

		// Atualiza a lista de nomes de jobs mostrada no JList
		if(src == refreshJob) {
			listaJobCadastrados.setListData(listaJobs);			
			listaJobCadastrados.updateUI();
		}
	}
	
	public void valueChanged(ListSelectionEvent e) {
		Object src = e.getSource();

		if(e.getValueIsAdjusting() && src == listaJobCadastrados) {
			//new TelaDetalhePessoa().inserirEditar(3, dados, this, 
					//listaAlunosCadastrados.getSelectedIndex());
		}
	}
}
