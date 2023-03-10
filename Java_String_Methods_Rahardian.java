/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package java_string_methods_rahardian;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author hp
 */
public class Java_String_Methods_Rahardian {
    static BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
    static Scanner sc = new Scanner(System.in);
    
    public static void tampil_menu() {
        int pil = 0;
        System.out.println("\n=============================================");
        System.out.println("Aplikasi Contoh Operasi dengan String Methods");
        System.out.println("=============================================\n");
        System.out.println("1. Demo charAt()");
        System.out.println("2. Demo concat()");
        System.out.println("3. Demo substring()");
        System.out.println("4. Demo toUpperCase()");
        System.out.println("5. Demo toLowerCase()");
        System.out.println("6. Demo trim()");
        System.out.println("7. Demo index()");
        System.out.println("8. Demo isEmpty()");
        System.out.println("9. Keluar Aplikasi");
        System.out.print("Pilih Menu (1-9): ");
        try {
            pil = Integer.valueOf(rd.readLine());
        } catch (Exception e) {
            System.out.println("Kesalahan input !");
        }             
        switch (pil) {
            case 1: demo_charAt(); break;
            case 2: demo_concat(); break;
            case 3: demo_substring(); break;
            case 4: demo_toUpperCase(); break;
            case 5: demo_toLowerCase(); break;
            case 6: demo_trim (); break;
            case 7: demo_index (); break;
            case 8: demo_isEmpty(); break;
            case 9: System.exit(0);
            default: System.err.println("Pilihan tidak tersedia !");
        }
    }
    
    public static void main(String[] args) {
        while (true) {
            tampil_menu();
        }
    }
 
    private static void demo_charAt() {
        String str;
        int index;
        try {
            System.out.print("Masukkan teks: ");
            str = sc.nextLine();
            System.out.print("Ketikkan index yang diinginkan: ");
            index = sc.nextInt();
            System.out.println("Index ke-"+index+" adalah "+str.charAt(index));
        } catch (Exception e) {
            System.out.println("Terjadi Exception: "+ e.getMessage());
        }
    }
 
    private static void demo_concat() {
        String str1,str2;
        try {
            System.out.print("Masukkan teks 1: ");
            str1 = sc.nextLine();
            System.out.print("Masukkan teks 2: ");
            str2 = sc.nextLine();
            System.out.println("Hasil concat teks 1 dan teks 2: "+str1.concat(str2));
        } catch (Exception e) {
            System.out.println("Terjadi Exception: "+ e.getMessage());
        }
    }
    
    private static void demo_toUpperCase() {
        String text;
        try {
            System.out.print("Masukkan teks dengan huruf non kapital : ");
            text = sc.nextLine();
            System.out.println( "Hasil dari toUpperCase :" + text.toUpperCase()); 
        } catch (Exception e) {
            System.out.println("Terjadi Exception: "+ e.getMessage());
        }
    }
 
    private static void demo_substring() {
        String txt;
        int txt1;
        try {
            System.out.print("Masukkan teks : ");
            txt = sc.nextLine();
            System.out.print("Masukan index : ");
            txt1 = sc.nextInt();
            System.out.print("hasil dari Substring : " + txt.substring(txt1));  
        } catch (Exception e) {

            System.out.println("Terjadi Exception: "+ e.getMessage());
        }
        
    }

    private static void demo_toLowerCase() {
        String tlc ;
        try {
            System.out.print("Masukan teks dengan huruf kapital semua : ");
            tlc = sc.nextLine();
            System.out.println("Hasil toLowerCase() : " + tlc.toLowerCase());
   
        } catch (Exception e) {
            System.out.println("Terjadi Exception: "+ e.getMessage());
        }
    }

    private static void demo_trim() {
        String trm;
        try {
            System.out.print("Masukan teks dengan menggunakan spasi di ahir kata : ");
            trm = sc.nextLine();
           System.out.print("Sebelum dipangkas : [" + trm + "]");
             System.out.print("Setelah dipangkas: [" + trm.trim() + "]");
   
        } catch (Exception e) {
            System.out.println("Terjadi Exception: "+ e.getMessage());
        }
    }

    private static void demo_index() {
        String inx, inx1;
        try {
            System.out.print("Masukan teks index : ");
            inx = sc.nextLine();
             System.out.print("Masukan substring   : ");
             inx1 = sc.nextLine();
            System.out.println("Posisi substring " + inx1 + ": " + inx.indexOf(inx1));
   
        } catch (Exception e) {
            System.out.println("Terjadi Exception: "+ e.getMessage());
        }
    }

    private static void demo_isEmpty() {
        String iey, iey1;
        try {
            System.out.print("Masukan teks : ");
            iey = sc.nextLine();
            System.out.print("tekan enter saja : ");
            iey1 = sc.nextLine();
            System.out.println("Hasil jika anda memasukan teks : " + iey.isEmpty());
            System.out.println("Hasil jika anda tidak memasukan teks : " + iey1.isEmpty());
            System.out.println("ciee yang coppy :) ");
        } catch (Exception e) {
            System.out.println("Terjadi Exception: "+ e.getMessage());
            
        }
    }
}
                                  
