package no.hvl.dat100.jplab11.oppgave4;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

import no.hvl.dat100.jplab11.oppgave3.*;

public class SkrivBlogg {

	public static boolean skriv(Blogg samling, String mappe, String filnavn) {

		try { 
			PrintWriter skriver = new PrintWriter(mappe + "" + filnavn); 
			skriver.println(samling.getAntall()); 
			for (int i = 0; i < samling.getAntall(); i++) {
				
				skriver.println(samling.getSamling()[i].toString()); 
			}
			skriver.close(); 
		}
		catch (FileNotFoundException e) {
			return false; 
		}
		return true; 
	}
	
}

// Implementer følgende metode i klassen SkrivBlogg.java: public static boolean skriv(Blogg samling, String mappe, String filnavn)
//som skriver ut samlingen til fil. Eksempel på innhold av fil for en samling med to elementer:

//2
//TEKST
//1
//Ole Olsen
//23-10
//0
//en tekst
//BILDE
//2
//Oline Olsen
//24-10
//0
//et bilde
//http://www.picture.com/oo.jpg
//Metoden skal returnere true om filen blev skrevet og skal håndtere eventuelle unntak ifm. fil-håndtering ved å bruke try-catch. 
//Hint: bruk toString()-metoden på innlegg-samling. Filen bloggkorrekt.dat i Eclipse-prosjektet med tester inneholder korrekt resultat. 
//Når testen TestSkriv-testen kjøres vil der bli skrevet i filen blogg.dat der resultatet kan inspiseres. Dvs. om metoden er korrekt 
//implementert skal innholdet av filen blogg.dat være lik innholdet av filen bloggkorrekt.dat
