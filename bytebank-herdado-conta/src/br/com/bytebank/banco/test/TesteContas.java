package br.com.bytebank.banco.test;

//import br.com.bytebank.banco.especial.ContaEspecial;
//Full Qualified Name FQN
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteContas {

	public static void main(String[] args) {
//		ContaEspecial contaEspecial = new ContaEspecial(111, 111)
		
		ContaCorrente contaCorrente = new ContaCorrente(11, 11);
		contaCorrente.deposita(100.0);
		
		ContaPoupanca contaPoupanca = new ContaPoupanca(22, 22);
		contaPoupanca.deposita(200.0);
		
//		contaCorrente.transfere(10.0, contaPoupanca);
		
		System.out.println("CC: " + contaCorrente.getSaldo());
		System.out.println("CP: " + contaPoupanca.getSaldo());
	}

}
