package br.com.alura.java.io.teste;

import java.io.IOException;
import java.io.PrintWriter;

public class TesteEscritaPrintWriter {

	public static void main(String[] args) throws IOException {
		
		// Fluxo de Saída com Arquivo
//		OutputStream fos = new FileOutputStream("lorem2.txt");
//		Writer osw = new OutputStreamWriter(fos);
//		BufferedWriter bw = new BufferedWriter(osw);
		// PrintStream ps = new PrintStream("lorem2.txt");
		PrintWriter ps = new PrintWriter("lorem2.txt", "UTF-8");
		ps.println("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
		ps.println("impsum dolor is impsum pimpsum");

		ps.close();
	}
}
