package br.com.entra21.orientacao.objetos.principal;

import java.util.Scanner;

import br.com.entra21.orientacao.objetos.principal.classes.Aluno;

public class main {

	static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		
		Aluno alunoTeste = new Aluno();
		Aluno outroAluno = new Aluno();
		Aluno alunoNovato = new Aluno();
		Aluno alunoObjeto;
		
		alunoObjeto = new Aluno();
		alunoObjeto.idade=18;
		
		alunoTeste.nome="Rafael";
		alunoTeste.idade=27;
		
		outroAluno.idade=18;
		outroAluno.nome="Visitante";
		
		alunoTeste.responderChamada();
		alunoTeste.responderChamada();
		
		
		/*
		 * System.out.println("Qual o nome do aluno novato? ");
		 * alunoNovato.nome=entrada.next();
		 * 
		 * System.out.println("\nQual a idade do "+alunoNovato.nome+" ?");
		 * alunoNovato.idade=entrada.nextByte();
		 * 
		 * System.out.println("\nBem vindo "+alunoNovato.nome);
		 */
	}

}
