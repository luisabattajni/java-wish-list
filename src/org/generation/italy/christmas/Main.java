package org.generation.italy.christmas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		

		Scanner scan = new Scanner (System.in);
		
		ArrayList<String> wishlist;
		wishlist = new ArrayList<String>();
		boolean cont = true;

		
		
		while (cont) {
			System.out.print("Aggiungi un elemento alla tua lista dei desideri: ");
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

		System.out.println("Ecco la tua lista: ");
		Iterator<String> iterator = wishlist.iterator();
		while(iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
		
		
		/*
		 * 
		
		Nel metodo main, in coda al programma già implementato, 
		chiedere all’utente il nome e l’indirizzo a cui inviare i regali. 
		Con quei parametri e con la lista dei desideri già creata 
		istanziare un nuovo oggetto di tipo LetteraBabboNatale.
		Chiamare il metodo invia() e stampare a video l’esito dell’invio, 
		gestendo opportunamente eventuali eccezioni.
		 */
		
		System.out.println(" ");
		
		System.out.print("A chi sono destinati questi regali? (inserire nome): ");
		String nome = scan.nextLine();
		System.out.print("Dove dovranno essere spediti questi regali? (inserire indirizzo): ");
		String indirizzo = scan.nextLine();

//		LetteraBabboNatale listaDesideri = new LetteraBabboNatale(nome, indirizzo, wishlist);
		
		
		try {
			LetteraBabboNatale listaDesideri = new LetteraBabboNatale(nome, indirizzo, wishlist);
			System.out.println(listaDesideri.invia());
		} catch (Exception e) {
			System.out.println("Impossibile creare il biglietto:");
			System.out.println(e.getMessage());
		}
		
		System.out.println("La tua lettera è stata inviata!");
			

			
			
//		//aggiungi t c
//		try {
//			Biglietto b = new Biglietto(km, eta, flessibile);
//			System.out.println("Costo del biglietto: " + b.calcolaPrezzo() + "€");
//
//		System.out.println(listaDesideri.invia())
//		try 
//		;
//		
		scan.close();

	}

}
