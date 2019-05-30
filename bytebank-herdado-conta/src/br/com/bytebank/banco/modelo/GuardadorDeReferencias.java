package br.com.bytebank.banco.modelo;

public class GuardadorDeReferencias {
	private Object[] referencias;
	private int posicaolivre;
	
	public GuardadorDeReferencias() {
		this.referencias = new Object[10];
		this.posicaolivre = 0;
	}
	
	public void adiciona(Object obj) {
		this.referencias[this.posicaolivre] = obj;
		this.posicaolivre++;
	}
	
	public int getQuantidadeDeelementos() {
		return this.posicaolivre;
	}
	
	public Object getReferencia(int pos) {
		return this.referencias[pos];
	}

}
