package com.fernando.cursojava;

public class OperacoesLogicasAninhadas {

	public static void main(String[] args) {
		
		int nota1 = 100;
		int nota2 = 100;
		int nota3 = 100;
		int nota4 = 100;
		
		int media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		if (media >= 50) {
			if (media >= 70) { 
				if (media == 100) {
					System.out.println("Aluno aprovado com louvor!");
				} else {
				System.out.println("Aluno aprovado.");
				}
			} else {
				System.out.println("Aluno em recuperação.");
			} 
		} else {
			System.out.println("Aluno reprovado.");
		}
	}

}
