package com.fernando.cursojava;

public class OperadorTernarioSimples {
	
public static void main(String[] args) {
		
		int nota1 = 100;
		int nota2 = 80;
		int nota3 = 70;
		int nota4 = 50;
		
		int media = 0;
		
		media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		String saidaResultado = media >= 70 ? "Aluno Aprovado." : "Aluno Reprovado";
		
		System.out.println(saidaResultado + "\nMedia final: " + media + " pontos");
		
	}
	

	
	

	
	

}
