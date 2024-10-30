package atividadesUnidade1;

import java.util.Scanner;

public class ParOuImpar {
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		
		System.out.println("Digite um número");
		
		int numero = scanner.nextInt();
		
		if (numero % 2 == 0) {
			System.out.println("Este número é par");
		}
		else {
			System.out.println("Este número é impar");
		}
		
	}
}
