package pirkovic.andrea;

import java.util.Scanner;
public class Zadatak7 { 
	public static void main(String[] args) { 
		Scanner ulaz = new Scanner (System.in); 
		System.out.println("Unesite broj članova niza n: "); 
		int n = ulaz.nextInt(); 
		int x[] = new int[n]; 
		System.out.println("Unesite članove niza:"); 
		
		for (int i = 0; i < x.length; i++){ 
			System.out.print("x[" + i + "] = "); 
			x[i] = ulaz.nextInt(); } 
		int s = 0;
		for(int i = 0; i < x.length; i++) 
			if (x[i] % 10 == 5) // moduo od 10 ti uvek pokazuje poslednju cifru odnosno cifru jedinica
				s += x[i]; 
		System.out.println("Suma je "+ s);
		
		ulaz.close(); } }
