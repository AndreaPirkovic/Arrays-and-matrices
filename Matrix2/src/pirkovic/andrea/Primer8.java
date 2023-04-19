package pirkovic.andrea;
import java.util.Scanner;
public class Primer8 {
public static void main(String[] args) {
	int suma=0;// suma clanova vecih od 3
	Scanner sc= new Scanner(System.in);
	int red= 5;
	int kolona= 5;
	
		int matrica[][]= new int [red][kolona];
		System.out.println("Unesite elemente:");
		for(int i=0;i<red;i++ ) {
			for (int j=0;j<kolona;j++ ) {
				System.out.print("Matrica[" + i +"," + j + "]" + " = ");
				matrica[i][j]= sc.nextInt();
				
			}
		}
	System.out.println("Elementi dvodimenzionalnog niza su:");
	for(int i=0;i<red;i++ ) {
		for (int j=0;j<kolona;j++ ) {
			System.out.print(matrica[i][j]+ " ");
		}System.out.println();
		}
	System.out.println("Suma elemenata sa vrednosti vecom od 3:");
	
	for(int i=0;i<red;i++ ) {
		for (int j=0;j<kolona;j++ ) {
			if (matrica[i][j]>3)
				suma+= matrica[i][j];
			
					}
		
		}
	System.out.print(suma);
	}

}
