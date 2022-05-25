package br.com.entra21.orientacao.objetos.principal;

import java.util.Scanner;
import br.com.entra21.orientacao.objetos.principal.aula01.Aluno;
import br.com.entra21.orientacao.objetos.principal.aula01.Professor;
import br.com.entra21.orientacao.objetos.principal.aula02.heranca.Diretor;
import br.com.entra21.orientacao.objetos.principal.aula02.heranca.Funcionario;

public class main {
	// o objeto da classe Scanner esta na variavel de entrada, ent�o � um objeto
	// porem o System.in � uma chamada static pq para acessar o in do System
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		byte option;

		do {
			System.out.println("\n\nEscolha uma op��o: \n");
			System.out.println("\t0 - Sair\n");
			System.out.println("\t1 - Aprender Classes\n");
			System.out.println("\t2 - Aprender Heran�a\n");
			option = input.nextByte();

			switch (option) {

			case 0:
				System.out.println("Saindo... Tchau :(");
				break;
			case 1:
				aprenderClassesObjetos();
				break;
			case 2:
				aprenderHeranca();
				break;

			default:
				System.out.println("\nPor favor, insira uma op��o v�lida :)");
				break;

			}

		} while (option != 0);

	}

	public static void aprenderClassesObjetos() {

		Funcionario funcionario1 = new Funcionario();
		funcionario1.setIdade((byte) 27);
		funcionario1.setNome("Rafael");
		funcionario1.setCargoAtual("Estagi�rio Dev. Java");
		funcionario1.setSalario(1800.0f);

		System.out.println("Oi, tenho " + funcionario1.getIdade() + " anos, meu nome � " + funcionario1.getNome()
				+ ", sou um " + funcionario1.getCargoAtual() + " e meu salario � " + funcionario1.getSalario());
		

		//// PARA TESTAR AS OUTRAS LINHAS DO C�DIGO, BASTA TIRAR OS COMENT�RIOS ====
		//// CTRL+SHIFT+\

		Diretor diretor1 = new Diretor();

		Professor professorJava = new Professor();
		Professor professoraIngles = new Professor("Isabelle", (byte) 30);

		System.out.println("O nome dela = " + professoraIngles.getNome());
		professoraIngles.setNome("Isabelle 2");
		System.out.println("Agora o nome dela = " + professoraIngles.getNome());
		System.out.println("A idade dela � " + professoraIngles.getIdade());

		System.out.println("Os professores trabalham na " + Professor.instituicao);

		Aluno alunoTeste = new Aluno();

		alunoTeste.nome = "Rafael";
		alunoTeste.idade = 27;

		Aluno outroAluno = new Aluno();

		outroAluno.idade = 18;
		outroAluno.nome = "Visitante";

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

	public static void aprenderHeranca() {

	}
}
