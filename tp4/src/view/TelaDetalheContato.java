package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import tp4.*;

public class TelaDetalheContato implements ActionListener {

	private JFrame janela;
	private JLabel labelNome = new JLabel("Nome: ");
	private JTextField valorNome;
	//private JLabel labelJob = new JLabel("Especializacao: ");
	//private JTextField valorJobNome;
	private JLabel labelEmail = new JLabel("Email: ");
	private JTextField valorEmail;
	private JLabel labelEnd = new JLabel("Endereco: ");
	private JTextField valorEnd;
	private JLabel labelCPF = new JLabel("CPF: ");
	private JTextField valorCPF;
	private JLabel labelBio = new JLabel("Biografia: ");
	private JTextField valorBio;
	private JLabel labelTelefone = new JLabel("Telefone");
	private JTextField valorTelefone;
	private JButton botaoExcluir = new JButton("Excluir");
	private JButton botaoSalvar = new JButton("Salvar");
	private int posicao;
	private int opcao;
	private String s;
	private Cliente clientes[] = new Cliente[50];
	private Worker workers[];
	
	public void inserirEditar(int op, Cliente c[], TelaContato p, int pos) {

		for(int i=0; i<c.length; i++) {
			if(c[i]!=null) {
				clientes[i]=c[i];
			}
		}
		
		opcao = op;
		posicao = pos;

		if (op == 1) s = "Cadastro de Cliente";
		if (op == 2) s = "Detalhe de Cliente";

		janela = new JFrame(s);

		//Preenche dados com dados do cliente clicado
		if (op == 2) {
			valorNome = new JTextField(c[pos].getNome(), 200);
			valorEmail = new JTextField(c[pos].getEmail(), 200);
			valorEnd = new JTextField(c[pos].getEndereco(),200);
			valorCPF = new JTextField(String.valueOf(c[pos].getCpf()), 200);
			valorBio = new JTextField(String.valueOf(c[pos].getBiografia()), 200);
			valorTelefone = new JTextField(String.valueOf(c[pos].getTelefone()), 10);			

		}  else { //Nao preenche com dados

			valorNome = new JTextField(200);
			valorEnd = new JTextField(200);
			valorEmail = new JTextField(200);
			valorCPF = new JTextField(200);
			valorBio = new JTextField(200);
			valorTelefone = new JTextField(10);

			botaoSalvar.setBounds(245, 175, 115, 30);
		}

		labelNome.setBounds(30, 20, 150, 25);
		valorNome.setBounds(180, 20, 180, 25);
		labelEnd.setBounds(30, 50, 150, 25);
		valorEnd.setBounds(180, 50, 180, 25);
		labelBio.setBounds(30, 50, 180, 25);
		valorBio.setBounds(180, 50, 180, 25);		
		labelCPF.setBounds(30, 80, 150, 25);
		valorCPF.setBounds(180, 80, 180, 25);
		labelEmail.setBounds(30, 110, 150, 25);
		valorEmail.setBounds(180, 110, 180, 25);
		labelTelefone.setBounds(30, 140, 150, 25);
		valorTelefone.setBounds(210, 140, 65, 25);

		//Coloca os campos relacionados a endereco se aluno



		//Coloca botoes de excluir e salvar
		if (op == 2) {
			botaoSalvar.setBounds(120, 175, 115, 30);
			botaoExcluir.setBounds(245, 175, 115, 30);
			this.janela.add(botaoExcluir);
		}

		this.janela.add(labelNome);
		this.janela.add(valorNome);
		this.janela.add(labelCPF);
		this.janela.add(valorCPF);
		this.janela.add(labelEmail);
		this.janela.add(valorEmail);
		this.janela.add(labelEnd);
		this.janela.add(valorEnd);
		this.janela.add(labelTelefone);
		this.janela.add(valorTelefone);
		this.janela.add(botaoSalvar);

		this.janela.setLayout(null);

		this.janela.setSize(400, 250);
		this.janela.setVisible(true);

		botaoSalvar.addActionListener(this);
		botaoExcluir.addActionListener(this);
	}
	
	/*
	public void inserirEditar(int op, Worker w[], 
			TelaContato p, int pos) {

		opcao = op;
		posicao = pos;

		if (op == 3) s = "Cadastro de Marido";
		if (op == 4) s = "Detalhe de Marido";

		janela = new JFrame(s);

		//Preenche dados com dados do cliente clicado
		if (op == 3) {
			valorNome = new JTextField(c[pos].getNome(), 200);
			valorEmail = new JTextField(c[pos].getEmail(), 200);
			valorEnd = new JTextField(c[pos].getEndereco(),200);
			valorCPF = new JTextField(String.valueOf(c[pos].getCpf()), 200);
			valorBio = new JTextField(String.valueOf(c[pos].getBiografia()), 200);
			valorTelefone = new JTextField(String.valueOf(c[pos].getTelefone()), 10);			

		} else if (op == 4) { //Preenche dados com dados do professor clicado 
			valorNome = new JTextField(dados.getProfessores()[pos].getNome(), 200);
			valorHoraAula = new JTextField(String.valueOf(dados.getProfessores()[pos].getValorHoraAula()),200);
			valorEnd = new JTextField(200);
			valorCPF = new JTextField(String.valueOf(dados.getProfessores()[pos].getCPF()), 200);
			valorID = new JTextField(String.valueOf(dados.getProfessores()[pos].getNumID()), 200);
			valorDDD = new JTextField(String.valueOf(dados.getProfessores()[pos].getNumTel().getDDD()), 3);
			valorTelefone = new JTextField(String.valueOf(dados.getProfessores()[pos].getNumTel().getNumero()), 10);

		} else { //N�o preenche com dados

			valorNome = new JTextField(200);
			valorEnd = new JTextField(200);
			valorHoraAula = new JTextField(200);
			valorCPF = new JTextField(200);
			valorID = new JTextField(200);
			valorDDD = new JTextField(3);
			valorTelefone = new JTextField(10);

			botaoSalvar.setBounds(245, 175, 115, 30);
		}

		labelNome.setBounds(30, 20, 150, 25);
		valorNome.setBounds(180, 20, 180, 25);
		labelEnd.setBounds(30, 50, 150, 25);
		valorEnd.setBounds(180, 50, 180, 25);
		labelHoraAula.setBounds(30, 50, 180, 25);
		valorHoraAula.setBounds(180, 50, 180, 25);		
		labelCPF.setBounds(30, 80, 150, 25);
		valorCPF.setBounds(180, 80, 180, 25);
		labelID.setBounds(30, 110, 150, 25);
		valorID.setBounds(180, 110, 180, 25);
		labelTelefone.setBounds(30, 140, 150, 25);
		valorDDD.setBounds(180, 140, 28, 25);
		valorTelefone.setBounds(210, 140, 65, 25);

		//Coloca os campos relacionados a endereco se aluno
		if (op == 1 || op == 3 ) {
			this.janela.add(labelEnd);
			this.janela.add(valorEnd);

		}

		//Coloca campos relacionados a valor hora/aula se professor
		if (op == 2 || op == 4) {

			this.janela.add(labelHoraAula);
			this.janela.add(valorHoraAula);
		}

		//Coloca botoes de excluir e salvar
		if (op == 3 || op == 4) {
			botaoSalvar.setBounds(120, 175, 115, 30);
			botaoExcluir.setBounds(245, 175, 115, 30);
			this.janela.add(botaoExcluir);
		}

		this.janela.add(labelNome);
		this.janela.add(valorNome);
		this.janela.add(labelCPF);
		this.janela.add(valorCPF);
		this.janela.add(labelID);
		this.janela.add(valorID);
		this.janela.add(labelTelefone);
		this.janela.add(valorDDD);
		this.janela.add(valorTelefone);
		this.janela.add(botaoSalvar);

		this.janela.setLayout(null);

		this.janela.setSize(400, 250);
		this.janela.setVisible(true);

		botaoSalvar.addActionListener(this);
		botaoExcluir.addActionListener(this);
	}
	*/
	
	
	public void actionPerformed(ActionEvent e) {
		int cont =0;
		Object src = e.getSource();
		if(src == botaoSalvar) {
			try {
				boolean res;
				if(opcao == 1) {//cadastro de novo cliente
					cont=0;
					for(int i=0; i<clientes.length; i++) {
						if(clientes[i]==null) {
							clientes[i].setNome(valorNome.getText());
							clientes[i].setBiografia(valorBio.getText());
							clientes[i].setCpf(valorCPF.getText());
							clientes[i].setEmail(valorEmail.getText());
							clientes[i].setEndereco(valorEnd.getText());
							clientes[i].setTelefone(valorTelefone.getText());
							cont=1;
						}
						if(cont==1)
							break;
					}
				} else if (opcao == 3){//cadastro de novo marido
					cont=0;
					for(int i=0; i<workers.length; i++) {
						if(workers[i]==null) {
							workers[i].setNome(valorNome.getText());
							workers[i].setBiografia(valorBio.getText());
							workers[i].setCpf(valorCPF.getText());
							workers[i].setEmail(valorEmail.getText());
							workers[i].setEndereco(valorEnd.getText());
							workers[i].setTelefone(valorTelefone.getText());
							cont=1;
						}
						if(cont==1)
							break;
					}
				} else if (opcao == 2) { // edicao de cliente
					clientes[posicao].atualizarCliente("nome", valorNome.getText());
					clientes[posicao].atualizarCliente("biografia", valorBio.getText());
					clientes[posicao].atualizarCliente("cpf", valorCPF.getText());
					clientes[posicao].atualizarCliente("email", valorEmail.getText());
					clientes[posicao].atualizarCliente("endereco", valorEnd.getText());
					clientes[posicao].atualizarCliente("telefone", valorTelefone.getText());
				}
				
				else if (opcao == 4) { // edicao de marido
					workers[posicao].atualizarWorker("nome", valorNome.getText());
					workers[posicao].atualizarWorker("biografia", valorBio.getText());
					workers[posicao].atualizarWorker("cpf", valorCPF.getText());
					workers[posicao].atualizarWorker("email", valorEmail.getText());
					workers[posicao].atualizarWorker("endereco", valorEnd.getText());
					workers[posicao].atualizarWorker("telefone", valorTelefone.getText());
				}
				res=true;

				if(res) {
					mensagemSucessoCadastro();
				}
				else mensagemErroCadastro();

			} catch (NullPointerException exc1) {
				mensagemErroCadastro();
			} catch (NumberFormatException exc2) {
				mensagemErroCadastro();
			}
		}

		if(src == botaoExcluir) {
			boolean res = false;

			if (opcao == 2) {//exclui aluno
				//res = dados.removerAluno(posicao);
				if (res) mensagemSucessoExclusao(); 
				else mensagemErroExclusaoAluno(); 
			}
				
			if (opcao == 4){ //exclui professor
				//res = dados.removerProfessor(posicao);
				if (res) mensagemSucessoExclusao(); 
				else mensagemErroExclusaoProf(); 
			}
		}
	}
	
	public void mensagemSucessoExclusao() {
		JOptionPane.showMessageDialog(null, "Os dados foram excluidos com sucesso!", null, 
				JOptionPane.INFORMATION_MESSAGE);
		janela.dispose();
	}

	public void mensagemSucessoCadastro() {
		JOptionPane.showMessageDialog(null, "Os dados foram salvos com sucesso!", null, 
				JOptionPane.INFORMATION_MESSAGE);
		janela.dispose();
	}

	public void mensagemErroCadastro() {
		JOptionPane.showMessageDialog(null,"ERRO AO SALVAR OS DADOS!\n "
				+ "Pode ter ocorrido um dos dois erros a seguir:  \n"
				+ "1. Nem todos os campos foram preenchidos \n"
				+ "2. CPF, identidade, DDD e telefone n�o cont�m apenas n�meros", null, 
				JOptionPane.ERROR_MESSAGE);
	}

	public void mensagemErroExclusaoAluno() {
		JOptionPane.showMessageDialog(null,"Ocorreu um erro ao excluir o dado.\n "
				+ "Verifique se o aluno est� matriculado\n"
				+ "em alguma disciplina. Se sim, cancele\n "
				+ "a matricula e tente novamente.", null, 
				JOptionPane.ERROR_MESSAGE);
	}
	
	public void mensagemErroExclusaoProf() {
		JOptionPane.showMessageDialog(null,"Ocorreu um erro ao excluir o dado.\n "
				+ "Verifique se o professor est� respons�vel\n"
				+ "por alguma disciplina. Se sim, substitua\n "
				+ "o professor e tente novamente.", null, 
				JOptionPane.ERROR_MESSAGE);
	}
}
