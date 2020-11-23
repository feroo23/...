package Trainingslager;

import java.io.IOException;

import oop.IO;

public class PQFormel {

	public static void main(String[] args) throws IOException {
		System.out.println("Bitte gebensie die zahl f�r a eingeben: ");
		double a = IO.readDouble();
		System.out.println("Bitte geben sie die Zahl f�r b ein: ");
		double b = IO.readDouble();
		System.out.println("Bitte geben sie die Zahl f�r c ein: ");
		double c = IO.readDouble();
		double d = Math.pow (b, 2) - 4 * a * c;
		if (d < 0) {
			System.out.println("kein l�sung vorhanden! ");
		}else {
			double ergebnis1 = (-b + Math.sqrt(d)) / (2 * a);
			double ergebnis2 = (-b - Math.sqrt(d)) / (2 * a);
			System.out.println("Eine Nullstelle bei x = " + ergebnis1);
			System.out.println("Eine Nullstelle bei x = " + ergebnis2);
		}
			
	}

}
