package kalkulator;

import javax.swing.JOptionPane;

public class Program {

	public static void main(String[] args) {
		
		int operacija = Integer.parseInt(
				JOptionPane.showInputDialog("Dobrodo�li u kalkulator!\n"
						+ "Upi�ite 1 za zbrajanje, 2 za odiuzimanje\n"
						+ "3 za mno�enje ili 4 za dijeljenje!\n"
						+ "Ako upi�ete neki drugi broj, program se ne�e nastaviti.")
				);
		
		int unosKorisnika1 = Integer.parseInt(
				JOptionPane.showInputDialog("Unesite jedan cijeli broj!")
				);
		
		int unosKorisnika2 = Integer.parseInt(
				JOptionPane.showInputDialog("Unesite jedan cijeli broj!")
				);
		
		
		
		
		Kalkulator.zbrajanje(20, 6758);
		
		Kalkulator.oduzimanje(4769, 4632);
		
		Kalkulator.mno�enje(34, 12);
		
		try {
			Kalkulator.dijeljenje(20, 0);
		} catch (ExceptionNeDijelitiSNulom e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
