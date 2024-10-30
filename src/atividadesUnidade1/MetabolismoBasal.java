package atividadesUnidade1;

import java.util.Scanner;

public class MetabolismoBasal {
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		
		System.out.println("Quanto você pesa?");
		
		float peso = scanner.nextFloat();
		
		System.out.println("Quanto você tem de altura?");
		
		float altura = scanner.nextFloat();
		
		System.out.println("Qual o seu gênero?");
		
		String genero = scanner.next();
		
		System.out.println("Quantos anos você tem?");
		
		int idade  = scanner.nextInt();
		
		double tmb =0;

		if(genero.equals("masculino")) {
	
		tmb = 88.36 + (13.4 * peso) + (4.8 * altura) - (5.7 * idade);
		
		System.out.println("Sua taxa de metabolismo basal é de " + tmb);
			
		}
		else if (genero.equals("feminino")) {
            tmb = 447.6 + (9.2 * peso) + (3.1 * altura) - (4.3 * idade);
            System.out.println("Sua taxa de metabolismo basal é de " + tmb);
        }
		
		
	}
}
