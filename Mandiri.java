import java.util.Scanner;

public class Mandiri {
	 public static int sumRecursive(int n) {
	 	if (n == 0) {
	 		return 0;
	 	}
	 		return n + sumRecursive(n - 1);
	 }

	 public static void main(String[] args) {
	 	Scanner sc = new Scanner(System.in);

	 	System.out.print("Masukan bilangan : ");
	 	int angka = sc.nextInt();
	 	int jumlah = sumRecursive(angka);
	 	System.out.println("hasil penjumlahan  " + angka + "..N  = " + jumlah);
	}
}
