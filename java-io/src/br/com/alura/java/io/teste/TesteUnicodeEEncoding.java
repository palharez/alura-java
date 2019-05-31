package br.com.alura.java.io.teste;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class TesteUnicodeEEncoding {
	public static void main(String[] args) throws Exception {
		String s = "ç";
		System.out.println(s.codePointAt(0));
		
		Charset charset = Charset.defaultCharset();
		System.out.println(charset.displayName());
		
		byte[] bytes = s.getBytes("windows-1252");
		System.out.println(bytes.length + ", ");
		String snovo = new String(bytes, "windows-1252");
		System.out.println(snovo);
		
		bytes = s.getBytes("UTF-16");
		snovo = new String(bytes,"UTF-16");
		System.out.println(snovo);
		System.out.println(bytes.length);
		
		bytes = s.getBytes(StandardCharsets.US_ASCII);
		snovo = new String(bytes, "US-ASCII");
		System.out.println(snovo);
		System.out.println(bytes.length);
	}
}
