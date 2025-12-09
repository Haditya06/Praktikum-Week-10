# Praktikum-Week-10

# 🚀 Rekursif — Algoritma & Pemrograman

<p align="center">
  <img src="https://img.shields.io/badge/Language-Java-orange">
  <img src="https://img.shields.io/badge/Topic-Recursion-blue"> 
  <img src="https://img.shields.io/badge/Status-Complete-green">
</p>

Repositori ini berisi kumpulan **program rekursif Java** yang dirancang untuk membantu memahami konsep dasar hingga lanjutan pada materi rekursif.

README ini dibuat dengan tampilan **lebih estetik, rapi, dan mudah dibaca**, cocok untuk tugas besar, laporan praktikum, atau upload GitHub. **latihan rekursif** dari materi yang kamu berikan, lengkap dengan kode Java yang rapi, mudah dipelajari, dan siap dipakai untuk laporan maupun pengumpulan tugas besar.

Repositori ini berisi solusi **praktik rekursif** (dari materi yang kamu kirim) beserta README dan contoh kode Java siap-compile.

## 📂 Struktur & Isi Project

Berikut daftar file latihan rekursif yang tersedia:

* `FaktorialPerulangan.java` — Faktorial menggunakan perulangan
* `FaktorialRekursif.java` — Faktorial menggunakan rekursi
* `JumlahDigitRekursif.java` — Menjumlahkan digit sebuah angka (rekursif)
* `BilanganPrimaRekursif.java` — Cek bilangan prima (rekursif)
* `Sum1toNRekursif.java` — Menjumlahkan 1..N (rekursif)
* `DecimalToBinaryRekursif.java` — Konversi desimal -> biner (rekursif, mencetak sisa bagi)
* `BinaryToDecimalRekursif.java` — Konversi biner -> desimal (rekursif dengan indeks)

---

## 📘 Tujuan Pembelajaran

* Memahami konsep dasar rekursif
* Menulis fungsi rekursif dengan parameter
* Menganalisis alur eksekusi pemanggilan fungsi berulang
* Membandingkan rekursi vs iterasi

---

## 🛠️ Cara Compile & Menjalankan Program

Ikuti langkah berikut untuk menjalankan program Java: & jalankan

1. Pastikan terpasang Java JDK (versi 8+).
2. Kompile:

```bash
javac NamaFile.java
```

3. Jalankan (contoh):

```bash
java FaktorialRekursif 5
# output: 5! = 120
```

Untuk program yang menerima argumen sebagai input, berikan argumen pada `java` seperti contoh di setiap file.

---

## 🧩 Contoh Kode Program

Setiap file sudah dipisahkan dan ditulis dengan format coding yang bersih. Berikut beberapa contoh:

### FaktorialPerulangan.java

```java
public class FaktorialPerulangan {
    public static void main(String[] args) {
        int angka = 5; // Menghitung 5!
        int hasil = 1;
        // Menghitung faktorial menggunakan perulangan
        for (int i = 1; i <= angka; i++) {
            hasil = hasil * i;
        }
        System.out.println(angka + "! = " + hasil);
    }
}
```

### FaktorialRekursif.java

```java
public class FaktorialRekursif {
    // Fungsi rekursif untuk menghitung faktorial
    public static int hitungFaktorial(int n) {
        // Program akan berhenti jika nilai n=0 atau n=1
        if (n == 0 || n == 1) {
            return 1;
        }
        // Pemanggilan method rekursif
        return n * hitungFaktorial(n - 1);
    }

    public static void main(String[] args) {
        int angka = 5; // Menghitung 5!
        int hasil = hitungFaktorial(angka);

        System.out.println(angka + "! = " + hasil);
    }
}
```

### JumlahDigitRekursif.java

```java
public class JumlahDigitRekursif {
    // Proses rekursif akan diawali dari digit paling belakang
    // hingga digit paling depan
    public static int jumlahDigit(int n) {
        if (n < 10) {
            return n;
        }
        return (n % 10) + jumlahDigit(n / 10);
    }

    public static void main(String[] args) {
        int angka = 0;
        try {
            if (args.length == 0) {
                System.out.println("Silakan masukkan angka sebagai argumen.");
                return;
            }
            angka = Integer.parseInt(args[0]);
            int jumlah = jumlahDigit(angka);
            System.out.println("Total " + angka + " = " + jumlah);
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}
```

### BilanganPrimaRekursif.java

```java
public class BilanganPrimaRekursif {
    // Fungsi rekursif untuk mengecek bilangan prima
    // Data yang dicek akan dimulai dari pembagi..1
    public static boolean cekPrima(int n, int pembagi) {
        // berhenti, dan dinyatakan prima jika pembaginya 1
        if (pembagi <= 1) {
            return true;
        }
        // Jika n habis dengan modulus pembagi, maka bukan prima
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

### Sum1toNRekursif.java

```java
public class Sum1toNRekursif {
    public static int sumToN(int n) {
        if (n <= 1) return n; // sumToN(1) = 1, sumToN(0) = 0
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

### DecimalToBinaryRekursif.java

```java
public class DecimalToBinaryRekursif {
    // Method rekursif yang mencetak sisa bagi (digit biner) mulai dari MSB
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

### BinaryToDecimalRekursif.java

```java
public class BinaryToDecimalRekursif {
    // Menggunakan rekursi dengan parameter string dan indeks
    public static int binToDec(String s, int index) {
        int len = s.length();
        if (index >= len) return 0;
        int bit = s.charAt(index) - '0';
        // tempat nilai bit (dari kiri): 2^(len-1-index)
        int weight = 1 << (len - 1 - index); // cocok jika len kecil
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

