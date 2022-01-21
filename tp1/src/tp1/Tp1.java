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
					//gerenciarPalavras();
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
					boolean excluir_count=false;
					do {
						clearScreen();
						System.out.println("Digite o Tema a ser excluido:");
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
								excluir_count=true;
								clearScreen();
								System.out.println("Tema excluido com sucesso!");
								break;
							}
						}
						if(!excluir_count) {
							System.out.println("Tema nao encontrado. Digite novamente:");
						}
					}while(excluir_count==false);
					break;
					
				case 3:
					clearScreen();
					System.out.println("Buscar tema:");
					//String busca = ler.next();
					for(int i=0; i<50; i++) {
						System.out.println(temasEPalavras[i][0]);
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
	
}
