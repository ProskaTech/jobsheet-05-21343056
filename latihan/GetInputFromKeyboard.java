package latihan;


// created by 21343056_Muhammad Asyrof

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class GetInputFromKeyboard {
    public static void main(String args[], String string) {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        
        String name = "", hoby = "";

        try{
            System.out.println("Nama Anda : ");
            name = dataIn.readLine();

            System.out.println("Hobi Anda : ");
            hoby = dataIn.readLine();
        }
        
        catch (IOException e){
            System.out.println("Gagal Membaca Keyboard");
        } 

        System.out.println("Jadi Hobi Anda"+hoby+". Hobi yang bagus "+name);
    }
}