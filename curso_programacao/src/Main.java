import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		/*
		 * System.out.println("Trabalhando com números"); // Atalho= sysou + Ctrl +
		 * espaço int n = 32; System.out.println(n); double x = 10.35784;
		 * System.out.println(x); System.out.printf("%.1f%n", x);
		 * System.out.printf("%.2f%n", x); System.out.printf("%.3f%n", x);
		 * 
		 * System.out.println("Imprime com ponto(.) ao invés de vírgula (,)"); //
		 * Locale.setDefault(Locale.US); System.out.printf("%.3f%n", x);
		 * 
		 * System.out.println("Concatenar: " + x + " e palavras");
		 * 
		 * System.out.printf("%s, Valores das variáveis no lugar do porcento %.2f%n", n,
		 * x);
		 * 
		 * System.out.println(
		 * "-------------------------------------------------------------"); String nome
		 * = "Maria"; int idade = 31; double renda = 4000.0;
		 * System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade,
		 * renda);
		 * 
		 * System.out.println(
		 * "-------------------------------------------------------------");
		 * System.out.println("Conversão de tipos (Casting)"); int a, b; double
		 * resultado; a = 5; b = 2; resultado = (double) a / b;
		 * System.out.println(resultado);
		 * 
		 * System.out.println(
		 * "-------------------------------------------------------------"); double c;
		 * int d; c = 5.0; d = (int) c;// Convertido para int System.out.println(d);
		 * 
		 * System.out.
		 * println(" Entrada de dados-------------------------------------------------------------"
		 * );
		 * 
		 * Scanner sc = new Scanner(System.in); String L; L = sc.next();
		 * System.out.println(L); sc.close();
		 */

		/*
		 * System.out.
		 * println(" Entrada de números inteiros-------------------------------------------------------------"
		 * ); int y; y = sc.nextInt(); System.out.println(y); sc.close();
		 * 
		 * System.out.
		 * println(" Entrada de número com ponto flutuante digitar com vírgula-----------------------------"
		 * ); double e; e = sc.nextDouble(); System.out.println(e); sc.close();
		 */

		Scanner sc = new Scanner(System.in);
		String s1, s2, s3;
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		System.out.println("DADOS DIGITADOS:");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		sc.close();

	}
}
