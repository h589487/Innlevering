package no.hvl.dat100;

import static javax.swing.JOptionPane.showInputDialog;

public class O1 {
	public static void main(String[] args) {
		String trinnskattskattTxt = showInputDialog("Bruttoinntekt :");
		double trinnskatt = Integer.parseInt(trinnskattskattTxt);

		// Kalkulere trinnskatt
		if (164100 >= trinnskatt && trinnskatt >= 0 ) {
			 System.out.println("Trinnskatt 1 er " + (int) (trinnskatt * 0));
		}
		if (230950 >= trinnskatt  && trinnskatt >= 164101) {
			System.out.println("Trinnskatt 2 er " + (int)(trinnskatt *0.93));  
		}
		if (580650 >= trinnskatt  && trinnskatt >= 230951) {
			 System.out.println("Trinnskatt 3 er " + (int) (trinnskatt * 2.41));
		}
		if (934050 >=  trinnskatt && trinnskatt >= 580651) {
			 System.out.println("Trinnskatt 4 er " + (int)(trinnskatt * 11.52));	
			}
		if (934051 <= trinnskatt) {
			 System.out.println("Trinnskatt 5 er " + (int) (trinnskatt * 14.52));	
		}
		
						
}
}
