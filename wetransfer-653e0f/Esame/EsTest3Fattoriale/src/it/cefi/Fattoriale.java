package it.cefi;

public interface Fattoriale {
	public static int calcolaFattoriale(int fattoriale) {
		int risultato =1; 
		for (int i = 1; i<= fattoriale; i++) {
			risultato *= i;
		}
		return risultato;
		
	}

}
