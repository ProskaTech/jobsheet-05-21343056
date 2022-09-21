package latihan;


// created by 21343056_Muhammad Asyrof

import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Masukkan Nama Lengkap : ");
            String nama = in.nextLine();

            System.out.println("Masukkan NIM : ");
            int NIM = in.nextInt();
   
            System.out.println("Masukkan Nilai : ");
            float nilai = in.nextFloat();

            System.out.println("\nNama  : "+nama+
                                "\nNIM   : "+NIM+
                                "\nNilai : "+nilai);
        }
    }
}