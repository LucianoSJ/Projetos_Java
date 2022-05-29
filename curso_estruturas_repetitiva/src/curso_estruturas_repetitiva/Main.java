package curso_estruturas_repetitiva;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
// For 
		/*for (int i=0; i<5; i++) {
			System.out.println("Valor de i: " + i);
			}
		
		Scanner sc1 = new Scanner(System.in);
		int x = sc1.nextInt();
	
// while		
		while (x !=0) {
			x = sc1.nextInt();
		}
		sc1.close();*/

// do while		
		
		int soma = 0;
		Scanner sc11 = new Scanner(System.in);
		int y = sc11.nextInt();
		do {
		   y = sc11.nextInt();
		   soma = soma + y;
		} while (y !=0);
		sc11.close();
		System.out.println("Soma = " + soma);
	}
}
