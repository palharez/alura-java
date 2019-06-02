package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCurso2 {
	public static void main(String[] args) {
		var javaColecoes = new Curso("Dominando as colecoes do Java", "Paulo Silveira");
		
		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
		javaColecoes.adiciona(new Aula("Lidando com coleções", 22));
		
		List<Aula> aulasImutaveis = javaColecoes.getAulas();
		
		System.out.println(aulasImutaveis);
		
		List<Aula> aulas = new ArrayList<>(aulasImutaveis);
		
		Collections.sort(aulas);
		System.out.println(aulas);
		System.out.println(javaColecoes.getTempoTotal());
		
		System.out.println(javaColecoes);
	}
}
