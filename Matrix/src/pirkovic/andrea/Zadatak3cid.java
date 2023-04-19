package pirkovic.andrea;
import java.util.Scanner;
public class Zadatak3cid {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Broj redova: ");
		int red = sc.nextInt();
		
		System.out.print("Broj kolona: ");
		int kolona = sc.nextInt();
		
		int  niz[][] = new int [red][kolona];
		System.out.println("Elementi matrice: ");
		for (int i=0; i<red; i++) {
			for (int j=0; j<kolona; j++) { 
				System.out.print(" a[" + i + "," + j + "]" + " = " );
				niz[i][j] = sc.nextInt();
				
			}}
			// ispisivanje elemenata
		System.out.println("Elementi dvodimenzionalnog niza su:");
		for (int i=0; i<red; i++) {
			for (int j=0; j<kolona; j++) { 
				System.out.print(niz[i][j] + " ");}
			System.out.println();	
		}
		System.out.println("elementi sa parnim indeksima kolona su ");
for ( int i=0;  i <red; i++) {
	for ( int j = 0; j<kolona; j++) { 
		if (j% 2==0) // ispitivanje parnosti indeksa kolona
		System.out.print(niz[i][j] + " ");}
		System.out.println();
	}
System.out.println("elementi sa neparnim indeksima redova su ");
for (int i=0;  i <red; i++) {
	for (int j=0; j<kolona; j++) { 
		if (i% 2!= 0) // ispitivanje neparnosti kolona
		System.out.print(niz[i][j] + " ");}
	System.out.println();}
	
	
	
	}}
