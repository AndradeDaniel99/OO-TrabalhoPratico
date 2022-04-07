/*Escreva um programa em Java que implemente o jogo da forca. 
O seu jogo deve exibir um menu inicial com as opções: 
“1. Gerenciar Temas”, “2. Gerenciar Palavras”, “3. Jogar” e “4. Sair”.*/

package tp1;

import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Random;

public class Tp1 {
	
	static String temasEPalavras[][] = new String [50][51];
	static String t2[] = {"palavra1", "palavra2", "palavra3", "palavra4", "palavra5", "palavra6", "palavra7", "palavra8", "palavra9", "palavra10"};
	static String t3[] = {"palavra11", "palavra12", "palavra13", "palavra14", "palavra15", "palavra16", "palavra17", "palavra18", "palavra19", "palavra20"};
	static String t4[] = {"palavra21", "palavra22", "palavra23", "palavra24", "palavra25", "palavra26", "palavra27", "palavra28", "palavra29", "palavra30"};
	static String t5[] = {"palavra31", "palavra32", "palavra33", "palavra34", "palavra35", "palavra36", "palavra37", "palavra38", "palavra39", "palavra40"};
	
	public static void main(String[] args) {
		temasEPalavras[0][0]= "animais";
		temasEPalavras[1][0]= "tema2";
		temasEPalavras[2][0]= "tema3";
		temasEPalavras[3][0]= "tema4";
		temasEPalavras[4][0]= "tema5";
		
		temasEPalavras[0][1]= "gato";
		temasEPalavras[0][2]= "cachorro";
		temasEPalavras[0][3]= "rinoceronte";
		temasEPalavras[0][4]= "baleia";
		temasEPalavras[0][5]= "hipopotamo";
		temasEPalavras[0][6]= "coruja";
		temasEPalavras[0][7]= "lobo";
		temasEPalavras[0][8]= "touro";
		temasEPalavras[0][9]= "tartaruga";
		temasEPalavras[0][10]= "tigre";
		temasEPalavras[0][11]= "cabrito";
		temasEPalavras[0][12]= "tubarao";
		temasEPalavras[0][13]= "pantera";
		temasEPalavras[0][14]= "galinha";
		criarModel();
		
		Scanner ler = new Scanner(System.in);
		int var=0, menu;
		
		do {
			System.out.println("1. Gerenciar Temas");
			System.out.println("2. Gerenciar Palavras");
			System.out.println("3. Jogar");
			System.out.println("4. Sair");
			
			boolean leituraRealizada=false;
			do {
				try {
					var = ler.nextInt();
					if(var>0 && var<5) {
						leituraRealizada = true;
					}
				} catch(InputMismatchException erro){
					leituraRealizada = false;
					ler.nextLine();
					System.out.println("Caractere inválido. Digite um numero entre 1 e 4: ");
				}
			}while(!leituraRealizada);
			
			menu = var;
			
			switch(menu) {
				case 1:
					gerenciarTemas();
					break;
				case 2:
					gerenciarPalavras();
					break;
				case 3:
					jogar();
					break;
				case 4:
					clearScreen();
					break;
				default:
					while(menu>4 || menu<=0) {
						menu = ler.nextInt();
					}
			}
		}while(menu>0 && menu<4);
	}

	public static void clearScreen() {
		for(int i=0; i<30; i++) {
			System.out.print("\n");
		}
	}
	
	public static void criarModel(){
		for(int i=1; i<=10; i++) {
			temasEPalavras[1][i]=t2[i-1];
			temasEPalavras[2][i]=t3[i-1];
			temasEPalavras[3][i]=t4[i-1];
			temasEPalavras[4][i]=t5[i-1];
		}
	}
	
	public static void gerenciarTemas() {
		clearScreen();
		
		int menu, var=0;
		Scanner ler = new Scanner(System.in);
		
		do {
			System.out.println("1. Cadastrar Tema");
			System.out.println("2. Excluir Tema");
			System.out.println("3. Buscar Tema");
			System.out.println("4. Voltar");
			
			boolean leituraRealizada=false;
			do {
				try {
					var = ler.nextInt();
					if(var>0 && var<5) {
						leituraRealizada = true;
					}
				} catch(InputMismatchException erro){
					leituraRealizada = false;
					ler.nextLine();
					System.out.println("Caractere inválido. Digite um numero entre 1 e 4: ");
				}
			}while(!leituraRealizada);

			menu = var;
			
			switch(menu) {
			
				case 1:
					cadastrarTemas();
					break;
					
				case 2:
					excluirTemas();
					break;
					
				case 3:
					buscarTemas();
					break;
				case 4:
					clearScreen();
					break;
				default:
					while(menu>4 || menu<0) {
						menu = ler.nextInt();
					}
			}
		}while(menu>0 && menu<4);
	}
	
	public static void cadastrarTemas() {
		clearScreen();
		System.out.println("Digite o Tema a ser cadastrado:");
		Scanner ler = new Scanner(System.in);
		String tema = ler.next();
		int confere_tema=1;
		
		for(int i=0; i<50; i++) {
			if(temasEPalavras[i][0]==null){
				temasEPalavras[i][0]=tema;
				clearScreen();
				System.out.println("Tema cadastrado com sucesso!");
				break;
			}
			
			String comparador=temasEPalavras[i][0];
			if(comparador!=null) {
				confere_tema = tema.compareTo(comparador);
			}

			if(confere_tema==0) {
				clearScreen();
				System.out.println("Impossivel. Esse tema ja existe.");
				break;
			}
		}
	}
	
	public static void excluirTemas() {
		boolean excluir_bool=false;
		int excluir_count=0, no_excluir=0;
		int confere_tema=1;
		Scanner ler = new Scanner(System.in);
		do {
			clearScreen();
			if(excluir_count==0) {
				System.out.println("Digite o Tema a ser excluido:");
			} else {
				System.out.println("Tema nao encontrado. Digite novamente:");
			}
			
			String excluir = ler.next();
			
			no_excluir=0;
			
			for(int i=0; i<50; i++) {
				String comparador=temasEPalavras[i][0];
				
				if(comparador!=null) {
					confere_tema = excluir.compareTo(comparador);
				}
			
				if(confere_tema==0){
					for(int j=1; j<51; j++) {
						if(temasEPalavras[i][j]!=null) {
							System.out.println("Não foi possível excluir o tema. Verifique se existem palavras cadastradas nesse tema.\n\n");
							no_excluir++;
							break;
						}
					}
					if(no_excluir==0) {
						temasEPalavras[i][0]=null;
						excluir_bool=true;
						clearScreen();
						System.out.println("Tema excluido com sucesso!\n\n");
						break;
					}
					
				} else {
					excluir_count++;
				}
			}
			if(no_excluir!=0) {
				break;
			}
		}while(excluir_bool==false);
	}
	
	public static void buscarTemas() {
		clearScreen();
		Scanner ler = new Scanner(System.in);
		System.out.println("Buscar tema:");
		String busca = ler.next();
		int confere_busca=1;
		
		for(int i=0; i<50; i++) {
			String comparador=temasEPalavras[i][0];
			if(comparador!=null) {
				confere_busca = busca.compareTo(comparador);
			}
			if(confere_busca==0) {
				clearScreen();
				System.out.println("O tema "+busca+" existe!\n\n");
				break;
			} 
		}
		if(confere_busca!=0) {
			clearScreen();
			System.out.println("O tema "+busca+" nao existe.\n\n");
		}
	}
	
	public static void gerenciarPalavras() {
		clearScreen();
		
		int menu, var = 0;
		Scanner ler = new Scanner(System.in);
		
		do {
			System.out.println("1. Cadastrar palavra");
			System.out.println("2. Excluir palavra");
			System.out.println("3. Buscar palavra");
			System.out.println("4. Listar todas as palavras de um tema");
			System.out.println("5. Voltar");
			
			boolean leituraRealizada=false;
			do {
				try {
					var = ler.nextInt();
					if(var>0 && var<=5) {
						leituraRealizada = true;
					}
				} catch(InputMismatchException erro){
					leituraRealizada = false;
					ler.nextLine();
					System.out.println("Caractere inválido. Digite um numero entre 1 e 5: ");
				}
			}while(!leituraRealizada);

			menu = var;
			
			switch(menu) {
			
				case 1:
					cadastrarPalavra();
					break;
					
				case 2:
					excluirPalavra();
					break;
					
				case 3:
					buscarPalavra();					
					break;
					
				case 4:
					listagemPalavras();
					break;
					
				case 5:
					clearScreen();
					break;
				default:
					while(menu>5 || menu<0) {
						menu = ler.nextInt();
					}
			}
		}while(menu>0 && menu<5);
	}
	
	public static void cadastrarPalavra() {
		clearScreen();
		int confere_palavra=1;
		Scanner ler = new Scanner(System.in);
		System.out.println("Primeiro escolha um tema:");
		for(int i=0; i<50; i++) {
			if(temasEPalavras[i][0]!=null) {
				System.out.println((i+1)+". "+temasEPalavras[i][0]);
			}
		}
		int tema = ler.nextInt();
		
		System.out.println("Digite a palavra que deseja cadastrar:");
		String palavra = ler.next();
		
		for(int j=1; j<51; j++) {
			if(temasEPalavras[tema-1][j]==null){
				temasEPalavras[tema-1][j]=palavra;
				clearScreen();
				System.out.println("Palavra cadastrada com sucesso!");
				break;
			}
			
			String comparador=temasEPalavras[tema-1][j];
			if(comparador!=null) {
				confere_palavra = palavra.compareTo(comparador);
			}
			
			if(confere_palavra==0) {
				clearScreen();
				System.out.println("Impossivel. Essa palavra ja existe.");
				break;
			}	
		}
	}
	
	public static void excluirPalavra() {
		boolean excluir_bool=false;
		int excluir_count=0;
		int confere_palavra=1;
		Scanner ler = new Scanner(System.in);
		
		do {
			clearScreen();
			
			if(excluir_count==0) {
				System.out.println("Digite a palavra a ser excluida:");
			} else {
				System.out.println("Palavra nao encontrada. Digite novamente:");
			}
			
			String excluir = ler.next();
			
			for(int i=0; i<50; i++) {
				for(int j=1; j<51; j++) {
					String comparador=temasEPalavras[i][j];
					if(comparador!=null) {
						confere_palavra = excluir.compareTo(comparador);
					}
					if(confere_palavra==0){
						temasEPalavras[i][j]=null;
						excluir_bool=true;
						clearScreen();
						System.out.println("Palavra excluida com sucesso!");
						break;
					} else {
						excluir_count++;
					}
				}
			}
		}while(excluir_bool==false);
	}
	
	public static void buscarPalavra() {
		clearScreen();
		Scanner ler = new Scanner(System.in);
		System.out.println("Buscar palavra:");
		String busca = ler.next();
		int confere_busca=1;
		
		for(int i=0; i<50; i++) {
			for(int j=0; j<51; j++) {
				String comparador=temasEPalavras[i][j];
				if(comparador!=null) {
					confere_busca = busca.compareTo(comparador);
				}
				if(confere_busca==0) {
					clearScreen();
					System.out.print("Palavra encontrada no tema "+temasEPalavras[i][0]+"\n\n\n");
					break;
				} 
			}
			if(confere_busca==0) {
				break;
			}
		}
		if(confere_busca != 0) {
			clearScreen();
			System.out.println("Palavra não encontrada");
		}
	}
	
	public static void listagemPalavras() {
		clearScreen();
		Scanner ler = new Scanner(System.in);
		System.out.println("Escolha um tema para ver suas palavras associadas:");
		for(int i=0; i<50; i++) {
			if(temasEPalavras[i][0]!=null) {
				System.out.println((i+1)+". "+temasEPalavras[i][0]);
			}
		}
		int listagem = ler.nextInt();
		
		System.out.print("\n\n\n");
		System.out.println(temasEPalavras[listagem-1][0]);
		for(int j=1; j<51; j++) {
			if(temasEPalavras[listagem-1][j]!=null) {
				System.out.println((j)+". "+temasEPalavras[listagem-1][j]);
			}
		}
		System.out.print("\n\n\n");
	}
	
	public static void jogar() {
		clearScreen();
		
		int tema, game=0, registro=0, confere_palavra=1, vitoria=0, tente=0, erro=0, checkError=0;
		Scanner ler = new Scanner(System.in);
		
		do {
			System.out.println("Escolha um tema para jogar:");
			for(int i=0; i<50; i++) {
				if(temasEPalavras[i][0]!=null) {
					System.out.println((i+1)+". "+temasEPalavras[i][0]);
				}
			}
			tema = ler.nextInt();
			
			for(int j=1; j<51; j++) {
				if(temasEPalavras[tema-1][j]!=null) {
					registro++;
				}
			}
			
			Random generator = new Random();
			int randomIndex = generator.nextInt(registro);
			if(randomIndex==0) {
				randomIndex=1;
			}
			
			String palavra = temasEPalavras[tema-1][randomIndex];
			char[] forca = palavra.toCharArray();
			
			clearScreen();
			
			System.out.println("Tema: "+temasEPalavras[tema-1][0]);
			System.out.println("____________");
			System.out.print("\n");
			System.out.print("Regras: \n       Escolha uma letra por vez. \n       Voce pode errar até 5 vezes antes de perder.\n");
			System.out.println("____________________________________________________");
			System.out.print("\n\n");
			
			char[] display = new char[palavra.length()];
			for(int i=0; i<display.length; i++) {
				display[i]='_';
			}
			do {
				clearScreen();
				System.out.println("Tema: "+temasEPalavras[tema-1][0]);
				System.out.println("____________");
				System.out.print("\n");
				
				for(int i=0; i<display.length; i++) {
					System.out.print(display[i]+" ");
				}
				System.out.print("\n");
				if(tente!=0){
					System.out.println("Tente outra letra!");
				}
				
				System.out.println("Erros: "+erro);
				
				String entrada = ler.next();
				char letra = entrada.charAt(0);
				
				
				for(int i=0; i<palavra.length(); i++) {
					if(display[i]==letra) {
						tente++;
						break;
					}
					if(forca[i]==letra) {
						display[i]=letra;
						vitoria++;
						tente=0;
					}else {
						checkError++;
					}
				}
				if(checkError==palavra.length()) {
					erro++;
				}
			checkError=0;
			if(erro==6) {
				break;
			}
				
			}while(vitoria<palavra.length());
			System.out.print("\n\n");
			if(erro==6) {
				System.out.println("Você perdeu! Deseja Deseja jogar novamente?");
			}else {
				System.out.println("Parabéns! Você acertou a palavra! Deseja jogar novamente?");
			}
			
			System.out.print("\n\n");
			System.out.print("1. Jogar novamente \n2. Sair\n");
			tema = ler.nextInt();
			
			if(tema==1) {
				clearScreen();
			} else if(tema==2) {
				game=1;
				clearScreen();
			}
			registro=0;
			vitoria=0;
			tente=0;
			erro=0;
			
		}while(game==0);
	}
}
