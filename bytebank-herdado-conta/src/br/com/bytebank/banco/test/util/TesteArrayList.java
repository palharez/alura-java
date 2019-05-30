package br.com.bytebank.banco.test.util;

import java.util.LinkedList;
import java.util.List;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayList {

	public static void main(String[] args) {
		
		// <> - Generics
		List<Conta> lista = new LinkedList<Conta>();
		
		
		ContaCorrente cc1 = new ContaCorrente(11, 22);
		lista.add(cc1);
		
		ContaPoupanca cp2 = new ContaPoupanca(22, 22);
		lista.add(cp2);
		
		ContaCorrente cc3 = new ContaCorrente(22, 22);
		boolean existe = lista.contains(cp2);
		
		System.out.println("Já existe? " + existe);
		
		for(Conta conta : lista) {
			System.out.println(conta);
		}
	}

}
