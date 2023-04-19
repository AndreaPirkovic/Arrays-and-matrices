package pirkovic.andrea;
import java.util.Scanner;
public class Primer3 {
public static void main(String[] args) {
	// ucitavanje podataka
	int suma=0;
	Scanner sc= new Scanner(System.in);
	System.out.print("Unesite broj redova:");
	int red= sc.nextInt();
	System.out.print("Unesite broj kolona:");
	int kolona= sc.nextInt();
	if (red <0 || kolona< 0) {// provera uslova za kreiranje matrice
		System.out.println("Uneli ste vrednost manje od nule, unesite ponovo");}
	else {
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
		}System.out.println();
		}
	
	for(int i=0;i<red;i++ ) {
		for (int j=0;j<red;j++ ) {
			if(i==j)// ovo je ako se racuna samo za elemente ispod glavne dijagonale
				suma +=(matrica[i][j]*matrica[i][j]);// racunanje sume kvadrata elemenata matrice
					}
		}
	System.out.print( "Suma kvadrata elemenata matrice je: " + suma);
	}
}
}
