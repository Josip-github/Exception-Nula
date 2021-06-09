package kalkulator;

import javax.swing.JOptionPane;

public class Program {

	public static void main(String[] args) {

		int operacija = Integer.parseInt(
				JOptionPane.showInputDialog("Dobrodošli u kalkulator!\n"
				+ "Upišite 1 za zbrajanje, 2 za oduzimanje\n" 
				+ "3 za množenje ili 4 za dijeljenje!\n"
				+ "Ako upišete neki drugi broj, program se neæe nastaviti.")
				);

		int unosKorisnika1 = Integer.parseInt(
				JOptionPane.showInputDialog("Unesite jedan cijeli broj!")
				);

		int unosKorisnika2 = Integer.parseInt(
				JOptionPane.showInputDialog("Unesite jedan cijeli broj!")
				);

		if (operacija < 1 | operacija > 4) {
			System.out.println("Program se neæe nastaviti, krivi unos.");
		} else if (operacija == 1) {
			Kalkulator.zbrajanje(unosKorisnika1, unosKorisnika2);
		} else if (operacija == 2) {
			Kalkulator.oduzimanje(unosKorisnika1, unosKorisnika2);
		} else if (operacija == 3) {
			Kalkulator.množenje(unosKorisnika1, unosKorisnika2);
		} else if (operacija == 4) {
			try {
				Kalkulator.dijeljenje(unosKorisnika1, unosKorisnika2);
			} catch (ExceptionNeDijelitiSNulom e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
