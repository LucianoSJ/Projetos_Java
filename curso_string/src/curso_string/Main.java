package curso_string;

public class Main {

	public static void main(String[] args) {	
		String original = "abcde FGHIJ ABC abc DEFG ";
		
// Minúscula:		
		String s01 = original.toLowerCase();
		System.out.println("toLowerCase: -" + s01 + "-");
		
//Maiúscula:	
		String s02 = original.toUpperCase();
		System.out.println("toUpperCase: -" + s02 + "-");
		
//Elimina espaços em branco nos cantos das strings:		
		String s03 = original.trim();
		System.out.println("trim: -" + s03 + "-");
		
//Pega o caracter apartir da posição indicada:
		String s04 = original.substring(2);
		System.out.println("substring(2): -" + s04 + "-");
		
//Pega o caracter apartir da posição indicada até a final indicada:
		String s05 = original.substring(2, 9);
		System.out.println("substring(2, 9): -" + s05 + "-");
		
//Substitue:	
		String s06 = original.replace('a', 'x');
		System.out.println("replace('a', 'x'): -" + s06 + "-");
		
//Substitue Palavras:		
		String s07 = original.replace("abc", "xy");
		System.out.println("replace('abc', 'xy'): -" + s07 + "-");
		
//Traz a primeira posição:		
		int i = original.indexOf("bc");
		System.out.println("Index of 'bc': " + i);
		
// Traz a primeira posição e a última:
		int j = original.lastIndexOf("bc");
		System.out.println("Last index of 'bc': " + j);
		
//Separa a strings:
		String s = "Luciano Santos de Jesus";
		String[] vect = s.split(" ");
		String word1 = vect[0];
		String word2 = vect[1];
		String word3 = vect[2];
		System.out.println(vect[0]);
		System.out.println(vect[1]);
		System.out.println(vect[2]);
		System.out.println(vect[3]);
		
	}
}
