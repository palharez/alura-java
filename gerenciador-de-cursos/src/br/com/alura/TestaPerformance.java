package br.com.alura;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class TestaPerformance {

	public static void main(String[] args) {

        Collection<Integer> numeros = new ArrayList<>();

        long inicio = System.currentTimeMillis();

        for (int i = 1; i <= 50000; i++) {
            numeros.add(i);
        }
        
        long fim = System.currentTimeMillis();
        
        long tempoDeExecucao = fim - inicio;
        
        System.out.println("Tempo gasto inserção: " + tempoDeExecucao);

        inicio = System.currentTimeMillis();
        
        for (Integer numero : numeros) {
            numeros.contains(numero);
        }

        fim = System.currentTimeMillis();

        tempoDeExecucao = fim - inicio;

        System.out.println("Tempo gasto buscas: " + tempoDeExecucao);

	}

}
