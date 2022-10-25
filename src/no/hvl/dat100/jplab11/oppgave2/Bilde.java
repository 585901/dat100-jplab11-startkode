package no.hvl.dat100.jplab11.oppgave2;

import no.hvl.dat100.jplab11.common.TODO;

public class Bilde extends Tekst {

	private String url; 
	
	public Bilde(int id, String bruker, String dato, String tekst, String url) {
		this(id, bruker, dato,0, tekst, url); 
		
	}

	public Bilde(int id, String bruker, String dato, int likes, String tekst, String url) {
		super(id, bruker, dato, likes, tekst); 
		this.url = url; 
	}
	
	public String getUrl() {
		return url; 

	}

	public void setUrl(String url) {
		this.url = url; 
	}

	@Override
	public String toString() {
		return "BILDE" + "\n" + getId() + "\n" + getBruker() + "\n" + getDato() + "\n" + getLikes() + "\n" + getTekst() + "\n" + url + "\n";

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

//For klassen Bilde skal strengen som returnere ha formen:
//BILDE\n1\nOle Olsen\n23-10\n0\net bilde\nhttp://www.picture.com/oo.jpg\n
