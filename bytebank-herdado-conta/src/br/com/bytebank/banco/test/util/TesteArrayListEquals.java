package br.com.bytebank.banco.test.util;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayListEquals {

	public static void main(String[] args) {
		
		// <> - Generics
		ArrayList<Conta> lista = new ArrayList<Conta>();
		
//		ArrayList<String> nomes = ArrayList<String>();
		
		
		ContaCorrente cc1 = new ContaCorrente(110, 223);
		lista.add(cc1);
		
		ContaPoupanca cp2 = new ContaPoupanca(108, 224);
		lista.add(cp2);
		
		System.out.println("Tamanho: " + lista.size());
		
		Conta ref = lista.get(0);
		
		System.out.println(ref);
		
		lista.remove(0);
		
		System.out.println("Tamanho: " + lista.size());
		
		ContaCorrente cc3 = new ContaCorrente(110, 225);
		lista.add(cc3);
		
		ContaPoupanca cp4 = new ContaPoupanca(108, 227);
		lista.add(cp4);
		
		for(int i = 0; i < lista.size(); ++i) {
			System.out.println(lista.get(i));
		}
		System.out.println("-------------");
		for(Conta conta : lista) {
			System.out.println(conta);
		}
	}

}
