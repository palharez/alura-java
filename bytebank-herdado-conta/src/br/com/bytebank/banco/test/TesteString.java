package br.com.bytebank.banco.test;

public class TesteString {

	public static void main(String[] args) {
		
		String vazio = " ";
		String outroVazio = vazio.trim();
		System.out.println(outroVazio.isEmpty());
		
		String nome = "Alura"; // object literal
//		String outro = nome.replace("A", "a");
//		String outro - nome.toLowerCase();
//		String outro = nome.toUpperCase();
		
		System.out.println(nome.contains("Alu"));
		
		System.out.println(nome.length());
		for(int i = 0; i < nome.length(); i++) {
			System.out.println(nome.charAt(i));
		}
		
//		char c = nome.charAt(0);
//		System.out.println(c);
		
//		int pos = nome.indexOf("ra");
//		System.out.println(pos);
		
//		String sub = nome.substring(1);
//		System.out.println(sub);
		
//		char c = 'A';
//		char d = 'a';
//		
//		String outro = nome.replace(c, d);
				
//		System.out.println(nome);
//		System.out.println(outro);
	}

}
