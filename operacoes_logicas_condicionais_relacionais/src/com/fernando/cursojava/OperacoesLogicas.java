package com.fernando.cursojava;

public class OperacoesLogicas {

	public static void main(String[] args) {
		
		int nota1 = 90;
		int nota2 = 80;
		int nota3 = 70;
		int nota4 = 50;
		
		int media = 0;
		
		media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		if (media >= 70) {
			System.out.println("Parabéns você está aprovado. Sua média foi: " + media);
		} else if (media >= 40 && media <= 69) {
			System.out.println("Você está de recuperação. Sua média foi: " + media);
		} 
		else {
			System.out.println("Você está reprovado. Sua media foi: " + media);
		}

	}

}
