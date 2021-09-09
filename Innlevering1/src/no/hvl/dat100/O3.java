package no.hvl.dat100;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class O3 {

	public static void main(String[] args) {
		int nF = 1;
		
		int n = Integer.parseInt (showInputDialog("Skriv  inn heltall" ));
		for (int i = 1; i<=n; i++) {	
			nF *= i;
			System.out.println(nF);
	}
showMessageDialog(null, nF);
}
}