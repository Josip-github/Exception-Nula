package kalkulator;

import javax.swing.JOptionPane;

public class Program {

	public static void main(String[] args) {
		
		int operacija = Integer.parseInt(
				JOptionPane.showInputDialog("Dobrodošli u kalkulator!\n"
						+ "Upišite 1 za zbrajanje, 2 za odiuzimanje\n"
						+ "3 za množenje ili 4 za dijeljenje!\n"
						+ "Ako upišete neki drugi broj, program se neæe nastaviti.")
				);
		
		int unosKorisnika1 = Integer.parseInt(
				JOptionPane.showInputDialog("Unesite jedan cijeli broj!")
				);
		
		int unosKorisnika2 = Integer.parseInt(
				JOptionPane.showInputDialog("Unesite jedan cijeli broj!")
				);
		
		
		
		
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
