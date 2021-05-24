package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		Product[] vect = new Product[n];
		
		for(int i=0;i<vect.length;i++) {
			sc.nextLine();//para consumir a quebra de linha~
			String nome = sc.nextLine();
			double preco = sc.nextDouble();
			vect[i] = new Product(nome, preco);//vect na posição [i] vai receber o objeto instanciado instanciado o produto
		}
		double soma =0.0;
		for(int i=0; i<vect.length; i++) {
			soma += vect[i].getPreco();//para pegar o preço do vetor
		}
		
		double media = soma / vect.length;//length é o tamanho do vetor
		System.out.printf("a Media é : ", media);
		sc.close();
	}

}
