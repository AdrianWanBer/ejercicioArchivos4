package edu.ejercicio4archivo;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Inicio {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Linea: ");
		int linea = sc.nextInt();
		
		System.out.println("Posicion: ");
		int posicion = sc.nextInt();
		
		System.out.print("Texto: ");
		String texto = sc.nextLine();
		texto = sc.nextLine();
		
		try {
			PrintWriter archivo = new PrintWriter("Archivo.txt");
			for(int i = 0; i < linea ; i++) {
				archivo.println();
			}
			for(int j = 0; j < posicion ; j++) {
				archivo.print(" ");
			}
			archivo.println(texto);
			archivo.close();
		} catch (IOException e){
			
		}

	}

}
