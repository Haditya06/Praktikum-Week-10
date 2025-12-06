import java.util.Scanner;

public class Mandiri2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan bilangan desimal : ");
        int desimal = sc.nextInt();

        System.out.print("Desimal dari Biner: ");
        aBiner(desimal);
    }
    public static void aBiner(int n) {
        if (n <= 1) {
            System.out.print(n);
            return;
        }
        aBiner(n / 2);
        System.out.print(n % 2);
    }
}
