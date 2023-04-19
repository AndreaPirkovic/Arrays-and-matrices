package pirkovic.andrea;
import java.util.Scanner;
public class Primer9 {//suma negativnih elemenata
public static void main(String[] args) {
	int suma=0;
	Scanner sc= new Scanner(System.in);
	System.out.print("Unesite broj redova:");
	int red= sc.nextInt();
	System.out.print("Unesite broj kolona:");
	int kolona= sc.nextInt();
	
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
	System.out.println("Suma negativnih elemenata je:");
	
	for(int i=0;i<red;i++ ) {
		for (int j=0;j<kolona;j++ ) {
			if (matrica[i][j]<0)
				suma+= matrica[i][j];
			
					}
		
		}
	System.out.print(suma);
	}

}