package latihan;

// created by 21343056_Muhammad Asyrof

import java.util.Scanner;

public class Scanner2 {
    public static void main(String args[], String string) {
            float angka1, angka2, jumlah;
            try (Scanner dataMasuk = new Scanner(System.in)) {
                System.out.println("Masukkan Angka ke-1 : ");
                angka1 = dataMasuk.nextFloat();

                System.out.println("Masukkan Angka ke-2 : ");
                angka2 = dataMasuk.nextFloat();
            }

            jumlah = angka1+angka2;
            System.out.println("Angka ke-1 : "+angka1);
            System.out.println("Angka ke-2 : "+angka2);
            System.out.println(string+jumlah);
    }
}