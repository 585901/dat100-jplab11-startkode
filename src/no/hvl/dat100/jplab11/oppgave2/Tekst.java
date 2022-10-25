package no.hvl.dat100.jplab11.oppgave2;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave1.*;

public class Tekst extends Innlegg {

	private String tekst;  
	
	public Tekst () {
		
	}
	
	public Tekst(int id, String bruker, String dato, String tekst) {
		this(id, bruker, dato, 0, tekst); 
	}
	
	public Tekst(int id, String bruker, String dato, int likes, String tekst) {
		super(id, bruker, dato, likes); 
		this.tekst = tekst; 
	}
	
	public String getTekst() {
		return tekst; 

	}

	public void setTekst(String tekst) {
		this.tekst = tekst; 
	}

	@Override
	public String toString() {
		return "TEKST" + "\n" + getId() + "\n" + getBruker() + "\n" + getDato() + "\n" + getLikes() + "\n" + tekst + "\n";

	}
	
	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {
			
		throw new UnsupportedOperationException(TODO.method());
				
	}
}

//Implementer subklassen Tekst for klassen Innlegg som skal ha en objektvariabel tekst som er teksten i et blogg-innlegg. 
//Implementer videre subklassen Bilde for klassen Tekst som skal ha en objektvariabel url (tekststreng) som gir en URL (web-lenke) 
//til der vi kan finne bildet for blogg-innlegget. Dvs. klassen Bilde er subklasse av klassen Tekst som igjen er subklasse av klassen Innlegg.

//Implementer konstruktørene i de to klassene Bilde og Tekst som initialiserer alle objektvariable (også de som er arvet fra superklassen) ut 
//fra de verdier som er gitt med som parametre til konstruktøren. Begge subklassene skal ha to konstruktører.

//Bruk private/protected på alle objektvariabler sli som du finner nødvendig og lag public get-metoder / set-metoder.

//Implementer metoden String toString() i hver av subklassene Bilde og Tekst som gir en tekst-representasjon av alle objektvariable 
//inkludert de som er arvet fra superklassen.

//For klassen Tekst skal strengen som returneres ha formen:

//TEKST\n1\nOle Olsen\n23-10\n0\nen tekst\n
//der en tekst er verdien av objektvariablen tekst.
