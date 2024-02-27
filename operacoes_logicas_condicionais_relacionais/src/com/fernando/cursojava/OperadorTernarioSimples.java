package com.fernando.cursojava;

public class OperadorTernarioSimples {
	
public static void main(String[] args) {
		
		int nota1 = 90;
		int nota2 = 90;
		int nota3 = 70;
		int nota4 = 50;
		
		int media = 0;
		
		media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		String saidaResultado = media >= 70 ? "Aluno Aprovado." : (media >= 40 && media <=69 ? "Aluno em recuperação": "Aluno Reprovado");
		
		System.out.println(saidaResultado + "\nMedia final: " + media + " pontos");
		
	}
	

	
	

	
	

}
