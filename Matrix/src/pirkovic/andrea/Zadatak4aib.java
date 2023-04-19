package pirkovic.andrea;
import java.util.Scanner;
public class Zadatak4aib {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int red, kolona;
		System.out.print("Unestite broj redova: ");
		red = sc.nextInt();
		
		System.out.print("Unesite broj kolona: ");
		kolona = sc.nextInt();
		
		int  a[][] = new int [red][kolona];
		int  b[][] = new int [red][kolona];
		int  c[][] = new int [red][kolona];
		int  d[][] = new int [red][kolona];
		System.out.println("Elementi prve matrice: ");
		for (int i=0; i<red; i++) {
			for (int j=0; j<red; j++) {
				System.out.print(" a[" + i + "," + j + "]" + " = " );
				a[i][j]= sc.nextInt();
			}
		}
		System.out.println("Elementi druge matrice: ");
		for (int i=0; i<red; i++) {
			for (int j=0; j<red; j++) {
				System.out.print(" b[" + i + "," + j + "]" + " = " );
				b[i][j]= sc.nextInt();
			}
		}
		System.out.println("Elementi dvodimenzionalnog niza a su:");
		for (int i=0; i<red; i++) {
			for (int j=0; j<red; j++) {
				System.out.print(a[i][j]+ " ");}
				System.out.println();	
			}
		System.out.println("Elementi dvodimenzionalnog niza b su:");
		for (int i=0; i<red; i++) {
			for (int j=0; j<red; j++) {
				System.out.print(b[i][j]+ " ");}
				System.out.println();	
			}
		for (int i=0; i<red; i++) {
			for (int j=0; j<red; j++) {
			c[i][j]= a[i][j]+b[i][j];
			}
			}
		System.out.println("Elementi dvodimenzionalnog niza c su:");
		for (int i=0; i<red; i++) {
			for (int j=0; j<red; j++) {
		System.out.print(c[i][j]+ " ");}
	System.out.println();	}
		
		for (int i=0; i<red; i++) {
			for (int j=0; j<red; j++) {
			d[i][j]= a[i][j]-b[i][j];
			}
			}
		System.out.println("Elementi dvodimenzionalnog niza d su:");
		for (int i=0; i<red; i++) {
			for (int j=0; j<red; j++) {
		System.out.print(d[i][j]+ " ");}
	System.out.println();	}
			}
}