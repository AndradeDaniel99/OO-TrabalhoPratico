/*Escreva um programa em Java que implemente o jogo da forca. 
O seu jogo deve exibir um menu inicial com as opções: 
“1. Gerenciar Temas”, “2. Gerenciar Palavras”, “3. Jogar” e “4. Sair”.*/

package tp1;

import java.util.Scanner;

public class Tp1 {

	public static void main(String[] args) {
		
		int menu;
		Scanner ler = new Scanner(System.in);
		
		do {
			System.out.println("1. Gerenciar Temas");
			System.out.println("2. Gerenciar Palavras");
			System.out.println("3. Jogar");
			System.out.println("4. Sair");
			menu = ler.nextInt();
			
			switch(menu) {
				case 1:
					clearScreen();
					//gerenciarTemas();
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
	
}
