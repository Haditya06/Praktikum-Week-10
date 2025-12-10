# Praktikum Week 10  
## Rekursif — Algoritma dan Pemrograman

<p align="center">
  <img src="https://www.vectorlogo.zone/logos/java/java-horizontal.svg" alt="Java Logo" width="260"/>
</p>

<p align="center">
  <img src="https://img.shields.io/badge/Language-Java-orange">
  <img src="https://img.shields.io/badge/Topic-Recursion-blue"> 
  <img src="https://img.shields.io/badge/Status-Complete-green">
</p>

---

## Struktur dan Isi Program

- `FaktorialPerulangan.java` — Menghitung nilai faktorial menggunakan perulangan.
- `FaktorialRekursif.java` — Menghitung nilai faktorial menggunakan fungsi rekursif.
- `JumlahDigitRekursif.java` — Menjumlahkan semua digit pada bilangan menggunakan rekursi.
- `BilanganPrimaRekursif.java` — Mengecek apakah bilangan adalah bilangan prima menggunakan rekursi.
- `Sum1toNRekursif.java` — Menjumlahkan angka dari 1 hingga N menggunakan rekursi.
- `DecimalToBinaryRekursif.java` — Konversi desimal ke biner menggunakan pembagian rekursif.
- `BinaryToDecimalRekursif.java` — Konversi biner ke desimal menggunakan rekursi berdasarkan indeks.

---

## Tujuan Pembelajaran

- Memahami konsep dan mekanisme kerja rekursi.
- Mengimplementasikan fungsi rekursif dengan parameter.
- Menganalisis proses pemanggilan fungsi secara bertingkat.
- Mempelajari perbedaan pendekatan rekursif dan iteratif.

---

## Cara Kompilasi dan Menjalankan Program

Pastikan Java JDK (versi 8 atau lebih baru) telah terpasang.

### 1. Kompilasi program
bash
javac NamaFile.java
2. Menjalankan program
Contoh:

bash
Salin kode
java FaktorialRekursif 5
Output:

Salin kode
5! = 120
Beberapa program membutuhkan input argumen. Masukkan argumen langsung saat menjalankan program seperti contoh di atas.

Contoh Program :
FaktorialPerulangan.java
```
public class FaktorialPerulangan {
    public static void main(String[] args) {
        int angka = 5;
        int hasil = 1;

        for (int i = 1; i <= angka; i++) {
            hasil = hasil * i;
        }
        System.out.println(angka + "! = " + hasil);
    }
}
```

FaktorialRekursif.java

```
public class FaktorialRekursif {
    public static int hitungFaktorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * hitungFaktorial(n - 1);
    }

    public static void main(String[] args) {
        int angka = 5;
        int hasil = hitungFaktorial(angka);
        System.out.println(angka + "! = " + hasil);
    }
}
```
JumlahDigitRekursif.java

```
public class JumlahDigitRekursif {
    public static int jumlahDigit(int n) {
        if (n < 10) {
            return n;
        }
        return (n % 10) + jumlahDigit(n / 10);
    }

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Silakan masukkan angka sebagai argumen.");
            return;
        }

        int angka = Integer.parseInt(args[0]);
        int jumlah = jumlahDigit(angka);
        System.out.println("Total " + angka + " = " + jumlah);
    }
}
```
BilanganPrimaRekursif.java
```
public class BilanganPrimaRekursif {
    public static boolean cekPrima(int n, int pembagi) {
        if (pembagi <= 1) {
            return true;
        }
        if (n % pembagi == 0) {
            return false;
        }
        return cekPrima(n, pembagi - 1);
    }

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Gunakan: java BilanganPrimaRekursif <angka>");
            return;
        }

        int angka = Integer.parseInt(args[0]);

        if (angka <= 1) {
            System.out.println(angka + " bukan bilangan prima.");
            return;
        }

        boolean isPrima = cekPrima(angka, angka / 2);

        if (isPrima) {
            System.out.println(angka + " adalah bilangan prima.");
        } else {
            System.out.println(angka + " bukan bilangan prima.");
        }
    }
}
```
Sum1toNRekursif.java
```
public class Sum1toNRekursif {
    public static int sumToN(int n) {
        if (n <= 1) return n;
        return n + sumToN(n - 1);
    }

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Gunakan: java Sum1toNRekursif <N>");
            return;
        }

        int n = Integer.parseInt(args[0]);
        int hasil = sumToN(n);
        System.out.println("Jumlah 1.." + n + " = " + hasil);
    }
}
```
DecimalToBinaryRekursif.java
```
public class DecimalToBinaryRekursif {
    public static void printBinary(int n) {
        if (n > 1) {
            printBinary(n / 2);
        }
        System.out.print(n % 2);
    }

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Gunakan: java DecimalToBinaryRekursif <desimal>");
            return;
        }

        int n = Integer.parseInt(args[0]);
        System.out.print("Desimal : " + n + ", binernya adalah: ");
        if (n == 0) {
            System.out.print(0);
        } else {
            printBinary(n);
        }
        System.out.println();
    }
}
```
BinaryToDecimalRekursif.java
```
public class BinaryToDecimalRekursif {
    public static int binToDec(String s, int index) {
        int len = s.length();
        if (index >= len) return 0;

        int bit = s.charAt(index) - '0';
        int weight = 1 << (len - 1 - index);
        return bit * weight + binToDec(s, index + 1);
    }

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Gunakan: java BinaryToDecimalRekursif <biner>");
            return;
        }

        String s = args[0].trim();
        int desimal = binToDec(s, 0);
        System.out.println("Biner : " + s + ", desimalnya adalah " + desimal);
    }
}
```
