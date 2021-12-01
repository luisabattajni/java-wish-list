package org.generation.italy.christmas;


import java.util.List;
import java.util.ArrayList;

public class LetteraBabboNatale {
	

	//attributi
	private String nome;
	private String indirizzo;
	private List<String> listaDesideri;

	
	/*
	 * 
	 * Implementare un opportuno costruttore e il metodo invia():String.
	Il metodo deve controllare che la lunghezza della lista 
	non superi la lunghezza massima consentita (5 desideri): 
	se la supera il metodo lancia un’eccezione, 
	altrimenti ritorna una stringa contenente un recap 
	di tutte le informazioni(nome, indirizzo, lista).
	
	Nel metodo main, in coda al programma già implementato, 
	chiedere all’utente il nome e l’indirizzo a cui inviare i regali. 
	Con quei parametri e con la lista dei desideri già creata 
	istanziare un nuovo oggetto di tipo LetteraBabboNatale.
	Chiamare il metodo invia() e stampare a video l’esito dell’invio, 
	gestendo opportunamente eventuali eccezioni.
	 */
	
	// costruttore
	
	public LetteraBabboNatale (String nome, String indirizzo) {
		this.nome = nome;
		this.indirizzo = indirizzo;
		this.listaDesideri = new ArrayList<String>();
	}
	
	public LetteraBabboNatale (String nome, String indirizzo, List<String> listaDesideri ) {
		this.nome = nome;
		this.indirizzo = indirizzo;
		this.listaDesideri = listaDesideri;
	}
	

	public String invia() throws Exception {
		 if(listaDesideri.size() > 5) {
			 throw new Exception("Your list is too long");
		 } 	else {
			 String risultato = "Nome: " + nome + "\n"
					  + "Indirizzo: "  + indirizzo + "\n"
					  + "Lista desideri: ";
			 // for che mette ogni desiderio nella variabile risultato
			 return risultato;
			 //return new List<String> = ;
		 }
	 }
	
	


}