package pirkovic.andrea;
import java.util.Scanner;
public class Zadatak5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int suma = 0;
		System.out.print("Unesite broj redova: ");
		int red = sc.nextInt();
		
		System.out.print("Unesite broj kolona: ");
		int kolona = sc.nextInt();
		
		int  niz[][] = new int [red][kolona];
		
		for (int i=0; i<red; i++) {
			for (int j=0; j<kolona; j++) { 
				System.out.print(" niz[" + i + "," + j + "]" + " = " );
				niz[i][j] = sc.nextInt();
				
			}}
			
		
		for (int i=0; i<red; i++) {
			for (int j=0; j<kolona; j++) { 
				suma += niz[i][j];}}
				System.out.println( "Suma svih elemenata niza je: " + suma);
						}}
