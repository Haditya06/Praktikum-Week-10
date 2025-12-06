import java.util.Scanner;

public class Latihan2 {
	 public static boolean cekPrima(int n, int pembagi) {

	 	if (pembagi == 1) {
	 		return true;
	 }
	 	if (n % pembagi == 0) {
	 		System.out.println(n + " Habis dibagi " + pembagi);
	 		return false;
	}
	 	System.out.println(n + " tidak habis dibagi " + pembagi);
	 	return cekPrima(n, pembagi - 1);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Masukan angka : ");
	 	int angka = sc.nextInt();

	 	boolean isPrima = cekPrima(angka, angka / 2);
	 	if (isPrima) {
	 	System.out.println(angka + " adalah bilangan prima.");
	} else {
	 	System.out.println(angka + " bukan bilangan prima.");
	}
 	}
}