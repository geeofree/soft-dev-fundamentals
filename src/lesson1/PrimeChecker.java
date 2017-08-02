package lesson1;

import java.util.*;

public class PrimeChecker {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a positive integer");
		int primeInput = scanner.nextInt();
		
		if(primeInput < 1) {
			do {
				System.out.println("Not a positive integer, try again:");
				primeInput = scanner.nextInt();
			}while(primeInput < 1);
		}
		else if(primeInput == 1) {
			System.out.println(primeInput + " is a prime!");
			return;
		}

		
		int factor = 2;
		while(primeInput % factor != 0) {
			factor++;
		}
		
		if(factor == primeInput) {
			System.out.println(primeInput + " is a prime!");
		}
		else {
			System.out.println(primeInput + " is not a prime...");
		}
	}
}
