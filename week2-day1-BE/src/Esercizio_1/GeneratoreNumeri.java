package Esercizio_1;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class GeneratoreNumeri {
	
	Scanner in = new Scanner(System.in);
	int[] array = new int[5];
	int index;
	int newNumero = 0;
	
	Random numR = new Random();
	

	public void generaArray() {
		 for(int i=0;i<5;i++)
	        {
	            array[i] = numR.nextInt(1,11);
	            System.out.println("Il valore nell'indice "+ i +" e': "+array[i]);
	        }
	}
	
	public void sostituisciNumero() {
			do {
				try { 
					System.out.println("Inserisci l'indice del numero da sostituire(da 0 a 4): ");
					index = in.nextInt();
				} catch(ArrayIndexOutOfBoundsException e) {
					System.out.println("Hai inserito un indice non esistente!");
				} catch(InputMismatchException e) {
					System.out.println("Hai inserito un valore diverso da un numero!");
				}
				
				System.out.println("Il numero da sostituire dall'indice " + index + " e': " + array[index]);
				try {
					System.out.println("Inserisci un numero con cui sostituirlo: ");
					newNumero = in.nextInt();
				} catch(InputMismatchException e) {
					System.out.println("Hai inserito un valore diverso da un numero!");
				}
				if (newNumero != 0) {
					System.out.println("Hai sostituito il numero " + array[index] + " con il numero " + newNumero);
					array[index] = newNumero;
					generaNewArray();
				} else {
					chiudiProgramma();
				}
					
			} while (newNumero != 0);
			
			}
		
			
	
	public void generaNewArray() {
		System.out.println("Genero il nuovo array...");
		for(int i=0;i<5;i++) {
			System.out.println("Il valore nell'indice "+ i +" e': "+array[i]);
		}
	}
	
	public void chiudiProgramma() {
		System.out.println("Programma terminato");
		System.exit(0);
	}
}
