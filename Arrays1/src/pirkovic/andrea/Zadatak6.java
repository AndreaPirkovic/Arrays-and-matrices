package pirkovic.andrea;


import java.util.Scanner; 
public class Zadatak6 { 
	public static void main(String[] args) { 
		Scanner ulaz = new Scanner (System.in); 
		System.out.println("Unesite broj članova niza n: "); 
		int n = ulaz.nextInt(); 
		int x[] = new int[n]; 
		System.out.println("Unesite članove niza:"); 
		for (int i = 0; i < x.length; i++){ 
			System.out.print("x[" + i + "] = "); 
			x[i] = ulaz.nextInt(); } 
		int cifra; 
		for(int i = 0; i < x.length; i++) {
			int a = x[i], p=1;// p mora biti ovde unutar for petlje jer ako ide iznad nje onda se radi za clanove niza i mnozi sa poslednjim clanom koji je prosao petlju
			// a u suprotnom p se resetuje na 1 pre ulaska u petlju
			while (a != 0) { 
				cifra = a % 10; 
				p *= cifra; 
				a /= 10; }
			System.out.println("Proizvod cifra članova niza " + x[i] + " je " + p); } ulaz.close(); } }