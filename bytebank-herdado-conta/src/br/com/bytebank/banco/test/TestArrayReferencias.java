package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TestArrayReferencias {
	public static void main(String[] args) {
		Object[] referencias = new Conta[5];
		
		ContaCorrente cc1 = new ContaCorrente(110, 223);
		referencias[0] = cc1;
		
		ContaPoupanca cp2 = new ContaPoupanca(108, 224);
		referencias[1] = cp2;
		
//		System.out.println( referencias[1].getNumero() );
		
		ContaPoupanca ref = (ContaPoupanca) referencias[1];
		
		System.out.println(ref.getNumero());
	}

}
