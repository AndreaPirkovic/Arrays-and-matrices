package pirkovic.andrea;
import java.util.Scanner;
public class Zadatak2aib {
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
			// ispisivanje parnih elemenata
		//svaki element ima svoju poziciju koja se
		//oderdjuje vrednoscu reda [i] i kolone [j]
		System.out.println("Parni elementi dvodimenzionalnog niza su: ");
		for (int i=0; i<red; i++) {
			for (int j=0; j<kolona; j++) { 
				if (niz[i][j]% 2==0)// da li je element niza (clan  reda i, kolone j)deljiv sa 2 bez ostatka
				System.out.println(niz[i][j] + " ");}
						}
		System.out.println("Neparni elementi dvodimenzionalnog niza su: ");
		for (int i=0; i<red; i++) {
			for (int j=0; j<kolona; j++) { 
				if (niz[i][j]% 2!=0)// da li je element niza neparan
				System.out.println(niz[i][j] + " ");}
						}

		}}