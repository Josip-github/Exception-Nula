package kalkulator;

public class ExceptionNeDijelitiSNulom extends Exception{

	public ExceptionNeDijelitiSNulom() {
		
		System.out.println("Ne mo�e se dijeliti s nulom,\n"
				+ "molim odaberite neki drugi broj");
	}
}
