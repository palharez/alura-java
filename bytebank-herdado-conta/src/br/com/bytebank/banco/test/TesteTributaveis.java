package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.SeguroDeVida;
import br.com.bytebank.banco.modelo.CalculadorDeImposto;

public class TesteTributaveis {

	public static void main(String[] args) {
		ContaCorrente contaCorrente = new ContaCorrente(222, 333);
		contaCorrente.deposita(100);
		
		SeguroDeVida seguroDeVida = new SeguroDeVida();
		
		CalculadorDeImposto calc = new CalculadorDeImposto();
		calc.registra(contaCorrente);
		calc.registra(seguroDeVida);
		
		System.out.println(calc.getTotalImposto());
		
	}

}
