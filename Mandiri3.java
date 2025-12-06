import java.util.Scanner;

class Mandiri3{
	public static void main(String[] args) {
		Mandiri3 r = new Mandiri3();
		r.runThis();
	}
	public void runThis(){
		Scanner sc = new Scanner(System.in);

		System.out.print("Masukan bilangan biner : ");
		String angka = sc.nextLine();

		int hasil = KonversiBinerKeDesimal(angka, 0);	
		System.out.print("Hasil desimal ke biner : "+ hasil);
	}
	public static int KonversiBinerKeDesimal(String biner, int index) {
		if (index == biner.length()) 
			return 0;
		int bit = biner.charAt(index) - '0';
        int power = biner.length() - index - 1;
        
        return (bit * (int)Math.pow(2, power)) + KonversiBinerKeDesimal(biner, index + 1);
	}
}