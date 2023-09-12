import java.util.Scanner;

public class Aula9Exercicio2333 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int[] notasDaAmandaCristina = new int [4];
		String[]disciplina = {"Português", "Matemática","Ciências","História"};
		
		System.out.println("Insira a nota 1 da Amanda Cristina");
		notasDaAmandaCristina[0] = ler.nextInt();
		
		System.out.println("Insira a nota 2");
		notasDaAmandaCristina[1] = ler.nextInt();
		
		System.out.println("Insira a nota 3");
		notasDaAmandaCristina[2] = ler.nextInt();
		
		System.out.println("Insira a nota 4");
		notasDaAmandaCristina[3] = ler.nextInt();
		
		for(int x = 0; x < notasDaAmandaCristina.length; x++) {
			System.out.println(disciplina[x] + " : " + notasDaAmandaCristina[x]);
		}
	}
}