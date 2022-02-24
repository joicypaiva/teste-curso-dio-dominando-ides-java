package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {

	public static void main(String[] args) {
		
		Gato gato = new Gato ();
		Livros livros = new Livros();
		int a = 1;
		int b = 2;
		
		System.out.println("a soma de A + B é igual a : " + (a+b));
		System.out.println(livros);
		System.out.println(gato);
		}
}


 class Livros {
	private String nome;
	private String nupag;
}
	
		
	



