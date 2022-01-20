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
				default:
					clearScreen();
					break;
			}
		}while(menu>0 && menu<4);
	}

	public static void clearScreen() {
		for(int i=0; i<30; i++) {
			System.out.print("\n");
		}
	}
	
	public static void gerenciarTemas() {
		
		int menu;
		
		clearScreen();
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
						String comparador=temasEPalavras[i][0];
						int confere_tema=1;
						
						if(temasEPalavras[i][0]==null){
							temasEPalavras[i][0]=tema;
							System.out.println("Tema cadastrado com sucesso!");
							break;
						}  
						
						confere_tema = tema.compareTo(comparador);
						if(confere_tema==0) {
							System.out.println("Impossivel. Esse tema ja existe.");
							break;
						}
					}
					break;
				case 2:
					clearScreen();
					//gerenciarPalavras();
					break;
				case 3:
					clearScreen();
					System.out.println("Buscar tema:");
					//String busca = ler.next();
					for(int i=0; i<50; i++) {
						System.out.println(temasEPalavras[i][0]);
					}
					break;
				default:
					clearScreen();
					break;
			}
		}while(menu>0 && menu<4);
		
		
	}
	
}
