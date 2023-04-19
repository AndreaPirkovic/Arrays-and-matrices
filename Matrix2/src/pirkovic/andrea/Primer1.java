package pirkovic.andrea;
import java.util.Scanner;
public class Primer1 {
public static void main(String[] args) {
	// ucitavanje podataka
	Scanner sc= new Scanner(System.in);
	System.out.print("Unesite broj redova:");
	int red= sc.nextInt();
	System.out.print("Unesite broj kolona:");
	int kolona= sc.nextInt();
	// "matrica"= naziv naseg dvodimenzionalnog niza
	int matrica[][]= new int [red][kolona];
	System.out.println("Unesite elemente:");
	for(int i=0;i<red;i++ ) {
		for (int j=0;j<red;j++ ) {
			System.out.print("Matrica[" + i +"," + j + "]" + " = ");
			matrica[i][j]= sc.nextInt();
			
		}
	}
	System.out.println("Elementi dvodimenzionalnog niza su:");
	for(int i=0;i<red;i++ ) {
		for (int j=0;j<red;j++ ) {
			System.out.print(matrica[i][j]+ " ");
		}System.out.println();//mora biti ovde!!! da se ispravno stampa
		}
	
}
}