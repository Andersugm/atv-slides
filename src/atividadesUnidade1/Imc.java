package atividadesUnidade1;

import java.util.Scanner;

public class Imc {

	public static void main(String[] args) {
		
		Scanner scanner= new Scanner(System.in);
		
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
	
}
