package no.hvl.dat100.jplab11.oppgave1;

import no.hvl.dat100.jplab11.common.TODO;

public abstract class Innlegg {
	
// A) Gjør ferdig implementasjon av den abstrakte klassen Innlegg.java med 
//	objektvariable id (heltall), bruker (tekststreng), dato (tekststreng), 
//	og antall likes (heltall). De fire objektvariable skal ikke være synlige 
//	utenfor klassen. Objektvariablen id skal brukes om en unik identifikasjon 
//	på et innlegg.
	
	private int id; 
	private String bruker; 
	private String dato; 
	private int likes; 
	
	public Innlegg() {
		
		this(0, "standardbruker", "25.10.22", 0); 
		
	}
	
// B) Klassen skal ha to konstruktører: public Innlegg(int id, String bruker, String dato) 
//	public Innlegg(int id, String bruker, String dato, int likes)som gir verdi til 
//	objektvariablene. Konstruktøren som bare tar tre parametre skal sette likes lik 0.
	
	public Innlegg(int id, String bruker, String dato) {

		this(id, bruker, dato, 0); 
		
	}

	public Innlegg(int id, String bruker, String dato, int likes) {

		this.id = id; 
		this.bruker = bruker; 
		this.dato = dato; 
		this.likes = likes; 
		
	}
	
// C) Klassen skal ha get- og set- metoder for de tre objektvariable id, bruker og dato.
	
	public String getBruker() {
		
		return bruker; 

	}

	public void setBruker(String bruker) {
		
		this.bruker = bruker; 
	
	}

	public String getDato() {
		
		return dato;  
		
	}

	public void setDato(String dato) {
		
		this.dato = dato; 
		
	}

	public int getId() {
		
		return id; 

	}

	public int getLikes() {
		
		return likes; 

	}
	
// D) Implementer metoden void doLike() som øker antall likes for innlegget med 1.
	
	public void doLike () {
		
		likes += 1;
		
	}
	
// F) Implementer metoden public boolean erLik(Innlegg innlegg) som returnerer true hvis 
//	og kun hvis innlegget har samme id som innlegget innlegg git med som parameter.
	public boolean erLik(Innlegg innlegg) {
		if(innlegg.getId() == id) {
			return true; 
		} else {
			return false; 
		}

	}
	
// E) Implementer metoden public String toString() som returnerer en tekststreng representasjon 
//	på formen:"1\nOle Olsen\n23-10\n7\n"der det først tallet er id for innlegget og 7 er 
//	antall likes for eksemplet.

	@Override
	public String toString() {
		
		return id + "\n" + bruker + "\n" + dato + "\n" + likes + "\n"; 
				
	}
	
	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {
		
		throw new UnsupportedOperationException(TODO.method());
				
	}
}
