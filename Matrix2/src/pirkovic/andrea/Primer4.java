package pirkovic.andrea;
import java.util.Scanner;
public class Primer4 {
public static void main(String[] args) {
	// ucitavanje podataka
		
		int red= 5;
		int kolona= 5;
	
	int matrica[][]= new int [red][kolona];
	// ili ovako inicijalizovati: int niz[][]={{1,1,1,1,1},{1,1,1,1,1},{1,1,1,1,1},{1,1,1,1,1},{1,1,1,1,1}}
	for(int i=0;i<red;i++ ) {
		for (int j=0;j<red;j++ ) {
			
			matrica[i][j]= 1;
			
		}
	}
	System.out.println("Elementi dvodimenzionalnog niza su:");
	for(int i=0;i<red;i++ ) {
		for (int j=0;j<red;j++ ) {
			System.out.print(matrica[i][j]+ " ");
		}System.out.println();
		}
	System.out.println("Elementi uredjenog niza ispod dijagonale su:");
	for(int i=0;i<red;i++ ) {
		for (int j=0;i>=j;j++ ) {// u for petlji uslov za ispis ispod dijagonale i>=j
			System.out.print(matrica[i][j]+ " ");
					}
		System.out.println();
		}
	
	}

}

