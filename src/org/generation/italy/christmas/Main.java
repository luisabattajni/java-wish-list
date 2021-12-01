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
		
		scan.close();

	}

}
