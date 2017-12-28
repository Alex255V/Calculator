package main;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] arfs) {
		Scanner sc = new Scanner(System.in);
		try {
			CalPlus cp = new CalPlus();
			String exit = "no";
			while(!exit.equals("y")) {
				String first;
				if(cp.getResult()!=0) { first = String.valueOf(cp.getResult());
				} else { 
					System.out.print("first number: ");
					first = sc.next(); 
				}
				System.out.print("arguments: ");
				String arg = sc.next();
				System.out.print("second number: ");
				String second =sc.next();
				if(arg.equals("+"))cp.add(Integer.valueOf(first),Integer.valueOf(second));
				if(arg.equals("-"))cp.mns(Integer.valueOf(first),Integer.valueOf(second));
				if(arg.equals("*"))cp.mlp(Integer.valueOf(first),Integer.valueOf(second));
				if(arg.equals("/"))cp.dvd(Integer.valueOf(first),Integer.valueOf(second));
				System.out.println("resultat: " + cp.getResult());
				System.out.print("save this result: " + cp.getResult() + " y/n ?");
				String save = sc.next();
				if(save.equals("n")) cp.cleanResult();
				if(!save.equals("y")) { System.out.println("Exit: y/n ?");
					exit = sc.next();
				}
			}
		} finally {
			sc.close();
		}
	}
}
