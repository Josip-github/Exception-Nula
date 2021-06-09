package kalkulator;

public class Program {

	public static void main(String[] args) {
		
		Kalkulator.zbrajanje(20, 6758);
		
		Kalkulator.oduzimanje(4769, 4632);
		
		Kalkulator.množenje(34, 12);
		
		try {
			Kalkulator.dijeljenje(20, 0);
		} catch (ExceptionNeDijelitiSNulom e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
