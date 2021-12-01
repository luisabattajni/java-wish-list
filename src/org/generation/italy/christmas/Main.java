package org.generation.italy.christmas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Creare una classe Main con metodo main, 
		 * in cui implementare il seguente programma:
			1 creare una nuova ArrayList 
			dove salvare la lista dei desideri
			2 continuare a chiedere all’utente 
			di inserire un nuovo desiderio nella lista, 
			fino a che l’utente sceglie di fermarsi 
			(vedi esempio di schermata)
			3. ad ogni iterazione mostrare la lunghezza della lista 
			e chiedere all’utente se vuole continuare
			4. ad ogni iterazione aggiungere il desiderio alla lista
			5. al termine dell’inserimento ordinare la lista
			6. stampare a video la lista ordinata

		 */
		
		
		

		Scanner scan = new Scanner (System.in);
		
		ArrayList<String> wishlist;
		wishlist = new ArrayList<String>();
		boolean cont = true;

		
		
		while (cont) {
			System.out.print("Aggiungi un elemento all tua lista dei desideri: ");
			wishlist.add(scan.nextLine());
			
			String desideri = "desideri";
			if (wishlist.size() == 1) {
				desideri = "desiderio";
			}
			 System.out.println("La tua lista contiene " + wishlist.size()  + " " + desideri);
			System.out.println("Continuare? s/n");
			String continuareSN = scan.nextLine();
			if (continuareSN.equals("n")) {
				cont = false;
			} 

		}
		
		Collections.sort(wishlist);
//		// prova Iterator
		System.out.println("Ecco la tua lista: ");
		Iterator<String> iterator = wishlist.iterator();
		while(iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}

		
//		Collections.sort(wishlist);
//		System.out.println("Ecco la tua lista: " + wishlist);
		
		scan.close();

	}

}
