package pirkovic.andrea;
import java.util.Scanner;
public class Zadatak6a {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
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
		System.out.println("Elementi dvodimenzionalnog niza su:");
		for (int i=0; i<red; i++) {
			for (int j=0; j<kolona; j++) { 
				System.out.print(niz[i][j] + " ");}
			System.out.println();	}
		int max = niz[0][0];
		for (int i=0; i<red; i++) {
			for (int j=0; j<kolona; j++) { 
				if (niz[i][j] > max )
					max =niz[i][j];
			}}
				System.out.println( "Najveci element niza je: " + max);
						}}