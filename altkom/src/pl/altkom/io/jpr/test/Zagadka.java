package pl.altkom.io.jpr.test;

import java.util.Random;
import java.util.Scanner;

public class Zagadka {

	public static void main(String[] args) {

		Random generator = new Random();
		int val = generator.nextInt(10);

		System.out
				.println("Wymyslilem sobie liczbe z przedzialu 0 - 9, ogdadnij jaka to liczba");
		Scanner in = new Scanner(System.in);

		boolean wygrana = false;

		for(;;) {
		
			for (int i = 0; i < 3; i++) {
	
				int liczba = in.nextInt();
	
				if (liczba == val) {
					System.out.println("Wygrales");
					wygrana = true;
					break;
				} else if (liczba < val) {
					System.out.println("za malo, sproboj jeszzcze raz");
				} else { 
					System.out.println("za dużo, sproboj jeszcze raz");
				}
				
			}
			if (!wygrana)
				System.out.print("za duzo prób - przegrales");
	
			System.out.println("grasz jeszcze raz? 1 = tak, 0 = nie");
	
			int wartosc = in.nextInt();
	
			switch (wartosc) {
			case 1:
				System.out.println("Gramy dalej");
				break;
			case 0:
				System.out.println("Koniec");
				System.exit(0);
			default:
				System.out.print("nieprawidowa wartosc - koniec");
				System.exit(0);
			}
		}
	}

}
