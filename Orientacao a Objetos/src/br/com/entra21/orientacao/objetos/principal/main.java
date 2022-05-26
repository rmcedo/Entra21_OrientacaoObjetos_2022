package br.com.entra21.orientacao.objetos.principal;

import java.util.Scanner;
import br.com.entra21.orientacao.objetos.principal.aula01.Aluno;
import br.com.entra21.orientacao.objetos.principal.aula01.Professor;
import br.com.entra21.orientacao.objetos.principal.aula02.heranca.Diretor;
import br.com.entra21.orientacao.objetos.principal.aula02.heranca.Funcionario;
import br.com.entra21.orientacao.objetos.principal.aula3.polimorfismo.Atleta;
import br.com.entra21.orientacao.objetos.principal.aula3.polimorfismo.Nadador;
import br.com.entra21.orientacao.objetos.principal.aula3.polimorfismo.Velocista;

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
			System.out.println("\t3 - Aprender Polimorfismo\n");
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
			case 3:
				aprenderPolimorfismo();
				break;

			default:
				System.out.println("\nPor favor, insira uma op��o v�lida :)");
				break;

			}

		} while (option != 0);

	}

	public static void aprenderClassesObjetos() {

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
		Funcionario funcionario1 = new Funcionario();
		funcionario1.setIdade((byte) 27);
		funcionario1.setNome("Rafael");
		funcionario1.setCargoAtual("Estagi�rio Dev. Java");
		funcionario1.setSalario(1800.0f);

		System.out.println("Oi, tenho " + funcionario1.getIdade() + " anos, meu nome � " + funcionario1.getNome()
				+ ", sou um " + funcionario1.getCargoAtual() + " e meu salario � " + funcionario1.getSalario());

		Funcionario funcionario2 = new Funcionario("Rafael", (byte) 27, "02977653023", "Dev. Jr.", 2700.50f);
	}

	public static void aprenderPolimorfismo() {

		// padr�o de polimorfismos para comportamentos(m�todos) � herdar!!!
		// a segunda forma do polimorfismo � fazer completamente os comportamentos do
		// meu jeito, o que eu herdei.
		// a terceira forma do polimorfismo � aproveitar a minha heran�a e fazer um
		// diferencial.

		Atleta atleta1 = new Atleta();
		atleta1.setName("Ronaldo");
		atleta1.comemorarVitoria();

		System.out.println("----------------");

		Nadador cielo = new Nadador("Cesar Cielo", (byte) 40, 15, 8, "Piscina 50m", "Sunga/Touca");
		cielo.setName("Cesar Cielo");

		System.out.println("Quer escrever uma frase?");
		String frase = input.nextLine();
		cielo.comemorarVitoria(frase); // procura primeiro na minha classe Nadador, se n�o tiver busca na heran�a.
		System.out.println("----------------");
		cielo.comemorarVitoria();
		System.out.println("----------------");
		cielo.aprenderComDerrota();
		System.out.println("----------------");

		Velocista flash = new Velocista();
		flash.setMarcaCalcado("Adidas");
		flash.setName("Barry Allen");
		flash.comemorarVitoria();
		System.out.println("--------------");
		flash.comemorarVitoria();
		System.out.println("--------------");

	}

}
