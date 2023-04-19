package pirkovic.andrea;

public class Primer1 {

	public static void main(String[] args) {
		// I nacin: inicijalizacija dvodimenzionalnog niza
		int[][]a = { {10,20,30}, {40,50,60}, {70,80,90}};//niz[red][kolona]
	// stampanje elemenata dvodimenzionalnog niza:
	for (int i=0; i<3;i++) { // prolazimo kroz redove
		for ( int j=0; j<3; j++) { //prolazak kroz kolone
		System.out.print(a[i][j] + " " );	
		}
		System.out.println();
		}
	}
}
