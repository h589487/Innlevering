package no.hvl.dat100;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class O2 {

    
	public static void main(String[] args) {
	      
		for (int student = 1; student <= 10; student++) {
			
		
		int poengSum;	

		do {
		String poengsumTxt = showInputDialog ("Skriv inn poengsum student  " + student);
		poengSum = Integer.parseInt(poengsumTxt);
				if (poengSum > 100 || poengSum < 0) {
					showMessageDialog(null, "Ugyldig poengsum, tast inn på nytt");
						
					}
		}while ( poengSum > 100 ||poengSum < 0);
		
		
		if (poengSum >= 90 || 100 <= poengSum) {
			System.out.println("A");
					}
		else if (poengSum >= 80 || 89  <= poengSum) {
			System.out.println("B");
					}
		else if (poengSum >= 60 || 79 <= poengSum){
			System.out.println("C");
					}
		else if (poengSum >= 50 || 59 <= poengSum) {
			System.out.println("D");
				}
		else if (poengSum >= 40 || 59 <= poengSum) {
			System.out.println("E");
				}
		else if (poengSum >= 0 || 39 <= poengSum) {
			System.out.println("F");
		}
				
			
				
					
			
		




	}
	}
}
