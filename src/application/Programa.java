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
			sc.nextLine();
			String nome = sc.nextLine();
			double preco = sc.nextDouble();
			vect[i] = new Product(nome, preco);
		}
		double soma =0.0;
		for(int i=0; i<vect.length; i++) {
			soma += vect[i].getPreco();
		}
		
		double media = soma / vect.length;//length � o tamanho do vetor
		System.out.printf("a Media � : ", media);
		sc.close();
	}

}
