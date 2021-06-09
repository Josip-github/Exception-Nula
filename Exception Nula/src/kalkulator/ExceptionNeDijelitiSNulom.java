package kalkulator;

public class ExceptionNeDijelitiSNulom extends Exception{

	public ExceptionNeDijelitiSNulom() {
		
		System.out.println("Ne može se dijeliti s nulom,\n"
				+ "molim odaberite neki drugi broj");
	}
}
