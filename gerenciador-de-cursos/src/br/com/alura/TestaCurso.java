package br.com.alura;

public class TestaCurso {

	public static void main(String[] args) {
		var javaColecoes = new Curso("Dominando as colecoes do Java", "Paulo Silveira");
		
		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
		javaColecoes.adiciona(new Aula("Lidando com coleções", 22));
		
		System.out.println(javaColecoes.getAulas());
	}
	
}
