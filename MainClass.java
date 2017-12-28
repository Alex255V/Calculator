package main;

import java.text.DecimalFormat;



public class MainClass {

	public static void main(String[] arg) {
		int number = 10;
		double com = Math.sqrt(number); 
		DecimalFormat nf = new DecimalFormat("0");
		System.out.println("computing: " + nf.format(com) + " : " + com);
		
	}
	
}
