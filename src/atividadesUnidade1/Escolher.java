package atividadesUnidade1;

import java.util.Scanner;

public class Escolher {
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("1.imc 2.metabolismo 3.nenhum");
		System.out.println("O que você deseja calcular?");
		
		String escolha = scanner.next();
		
		
		if(escolha.equals("1")) {
			
			System.out.println("Qual o seu nome?");
			
			String nome = scanner.next();
			
			System.out.println("Qual o seu peso?");
			
			int peso = scanner.nextInt();
			
			System.out.println("Qual a sua altura?");
			
			float altura = scanner.nextFloat();
			
			int imc = peso /= (altura*altura);
			
			if(imc< 19) {
				System.out.println(nome + " você está abaixo do peso");
			}
			else if(imc >= 19 && imc < 25) {
			System.out.println(nome + " você está no peso ideal");
			}
			else if(imc <= 25 && imc <30) {
				System.out.println(nome + " você está com sobrepeso");
			}
			else if(imc <= 30 && imc > 40) {
				System.out.println(nome + " você está com obesidade tipo 1");
			}
			else {
				System.out.println(nome + " você está com obesidade mórbida");
			}
			
			System.out.println(" Seu IMC é de "+ imc);

			
		}
		else if (escolha.equals("2")) {
			
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
			
			else {
				System.out.println("Acabou o programa");
			}
		}
	}
}