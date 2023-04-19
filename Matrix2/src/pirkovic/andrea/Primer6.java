package pirkovic.andrea;
import java.util.Scanner;
public class Primer6 {
public static void main(String[] args) {
	// ucitavanje podataka
		
		int red= 5;
		int kolona= 5;
		Scanner sc= new Scanner(System.in);
		
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
	int suma=0;
	for(int i=0;i<red;i++ ) {
		for (int j=0;j<kolona;j++ ) {// u for petlji uslov za ispis ispod dijagonale i>=j
			if (i==2)
				suma+= matrica[i][j];
				
					}
		
		}System.out.print("suma je" + suma);
	
	}

}

