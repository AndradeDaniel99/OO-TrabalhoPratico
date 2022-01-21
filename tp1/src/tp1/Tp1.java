/*Escreva um programa em Java que implemente o jogo da forca. 
O seu jogo deve exibir um menu inicial com as opções: 
“1. Gerenciar Temas”, “2. Gerenciar Palavras”, “3. Jogar” e “4. Sair”.*/

package tp1;

import java.util.Scanner;

public class Tp1 {
	
	static String temasEPalavras[][] = new String [50][51];
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int menu;
		
		do {
			System.out.println("1. Gerenciar Temas");
			System.out.println("2. Gerenciar Palavras");
			System.out.println("3. Jogar");
			System.out.println("4. Sair");
			
			menu = ler.nextInt();
			
			switch(menu) {
				case 1:
					gerenciarTemas();
					break;
				case 2:
					clearScreen();
					gerenciarPalavras();
					break;
				case 3:
					clearScreen();
					//jogar();
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

	public static void clearScreen() {
		for(int i=0; i<30; i++) {
			System.out.print("\n");
		}
	}
	
	public static void gerenciarTemas() {
		clearScreen();
		
		int menu;
		
		do {
			System.out.println("1. Cadastrar Tema");
			System.out.println("2. Excluir Tema");
			System.out.println("3. Buscar Tema");
			System.out.println("4. Voltar");
			
			Scanner ler = new Scanner(System.in);
			menu = ler.nextInt();
			
			switch(menu) {
			
				case 1:
					clearScreen();
					System.out.println("Digite o Tema a ser cadastrado:");
					String tema = ler.next();
					
					for(int i=0; i<50; i++) {
						if(temasEPalavras[i][0]==null){
							temasEPalavras[i][0]=tema;
							clearScreen();
							System.out.println("Tema cadastrado com sucesso!");
							break;
						}
						String comparador=temasEPalavras[i][0];
						int confere_tema=1;
						confere_tema = tema.compareTo(comparador);
						if(confere_tema==0) {
							clearScreen();
							System.out.println("Impossivel. Esse tema ja existe.");
							break;
						}
					}
					break;
					
				case 2:
					boolean excluir_bool=false;
					int excluir_count=0;
					
					do {
						clearScreen();
						if(excluir_count==0) {
							System.out.println("Digite o Tema a ser excluido:");
						} else {
							System.out.println("Tema nao encontrado. Digite novamente:");
						}
						
						String excluir = ler.next();
						
						for(int i=0; i<50; i++) {
							String comparador=temasEPalavras[i][0];
							int confere_tema=1;
							confere_tema = excluir.compareTo(comparador);
						
							if(confere_tema==0){
								for(int j=1; j<51; j++) {
									if(temasEPalavras[i][j]!=null) {
										System.out.println("Não foi possível excluir o tema. Verifique se existem palavras cadastradas nesse tema.");
										break;
									}
								}
								temasEPalavras[i][0]=null;
								excluir_bool=true;
								clearScreen();
								System.out.println("Tema excluido com sucesso!");
								break;
							} else {
								excluir_count++;
								break;
							}
						}
					}while(excluir_bool==false);
					break;
					
				case 3:
					clearScreen();
					System.out.println("Buscar tema:");
					String busca = ler.next();
					
					for(int i=0; i<50; i++) {
						String comparador=temasEPalavras[i][0];
						int confere_busca=1;
						confere_busca = busca.compareTo(comparador);
						if(confere_busca==0) {
							clearScreen();
							System.out.println("O tema "+busca+" existe!");
							break;
						} else {
							clearScreen();
							System.out.println("O tema "+busca+" nao existe.");
							break;
						}
					}
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
	
	public static void gerenciarPalavras() {
		clearScreen();
		
		int menu;
		
		do {
			System.out.println("1. Cadastrar palavra");
			System.out.println("2. Excluir palavra");
			System.out.println("3. Buscar palavra");
			System.out.println("4. Listar todas as palavras de um tema");
			System.out.println("5. Voltar");
			
			Scanner ler = new Scanner(System.in);
			menu = ler.nextInt();
			
			switch(menu) {
			
				case 1:
					clearScreen();
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
						int confere_palavra=1;
						confere_palavra = palavra.compareTo(comparador);
						if(confere_palavra==0) {
							clearScreen();
							System.out.println("Impossivel. Essa palavra ja existe.");
							break;
						}	
					}
					break;
					
				case 2:
					/*
					boolean excluir_bool=false;
					int excluir_count=0;
					
					do {
						clearScreen();
						if(excluir_count==0) {
							System.out.println("Digite o Tema a ser excluido:");
						} else {
							System.out.println("Tema nao encontrado. Digite novamente:");
						}
						
						String excluir = ler.next();
						
						for(int i=0; i<50; i++) {
							String comparador=temasEPalavras[i][0];
							int confere_tema=1;
							confere_tema = excluir.compareTo(comparador);
						
							if(confere_tema==0){
								for(int j=1; j<51; j++) {
									if(temasEPalavras[i][j]!=null) {
										System.out.println("Não foi possível excluir o tema. Verifique se existem palavras cadastradas nesse tema.");
										break;
									}
								}
								temasEPalavras[i][0]=null;
								excluir_bool=true;
								clearScreen();
								System.out.println("Tema excluido com sucesso!");
								break;
							} else {
								excluir_count++;
								break;
							}
						}
					}while(excluir_bool==false);
					*/
					break;
					
				case 3:
					clearScreen();
					/*
					System.out.println("Buscar tema:");
					String busca = ler.next();
					
					for(int i=0; i<50; i++) {
						String comparador=temasEPalavras[i][0];
						int confere_busca=1;
						confere_busca = busca.compareTo(comparador);
						if(confere_busca==0) {
							clearScreen();
							System.out.println("O tema "+busca+" existe!");
							break;
						} else {
							clearScreen();
							System.out.println("O tema "+busca+" nao existe.");
							break;
						}
					}
					*/
					break;
				case 4:
					clearScreen();
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
	
	public static void jogar() {
		
	}
}
