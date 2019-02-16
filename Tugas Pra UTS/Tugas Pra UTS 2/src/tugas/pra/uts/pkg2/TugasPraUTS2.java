/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas.pra.uts.pkg2;
import java.util.Scanner;
public class TugasPraUTS2 {
    public static void main(String[] args) {
        System.out.println("*************************************************");
        System.out.println("                   Saeful Husna                  ");
        System.out.println("                     1842809                     ");
        System.out.println("                     IF - Z                      ");
        System.out.println("*************************************************");
        
        System.out.println("Andi        : Hai, Apakah Kamu Bisa Membuatkan Aku Sebuah Program? ");
        System.out.println("Saeful      : Tentu Saja Bisa, Program Apa, ndi? ");
        System.out.println("Andi        : Saya Membutuhkan Program Yang Bisa Mengurutkan Penawaran Untuk Suatu Produk Di Perusahaan Pelelangan Yang Saya Miliki ");
        System.out.println("Saeful      : Tentu Saja Bisa, Saya Akan Membuatkannya Khusus Untukmu, Tunggu Beberapa Saat Yaa............ ");
        
        int jumlah = 8;
        Scanner input = new Scanner(System.in);

        int data[] = new int[jumlah];

        System.out.println("");
        for (int i = 0; i < jumlah; i++) {
            System.out.printf("Masukkan Jumlah Penawaran Yang Anda Tawarkan %d: Rp. ", (i + 1));
            data[i] = input.nextInt();
        }

        for (int x = 0; x < jumlah - 1; x++) {
            for (int i = 0; i < jumlah - 1; i++) {
                if (data[i] < data[i + 1]) {
                    int j = data[i];
                    data[i] = data[i + 1];
                    data[i + 1] = j;
                }
            }
        }
        System.out.println("");
        System.out.println("Hasil Pengurutan Penawaran Pelelangan Di Perusahaan Andi: ");
        for (int a = 0; a < jumlah; a++) {
            System.out.print("Rp. " + data[a] + "  ");
        }
        
        System.out.println("\n\nAndi        : Terima Kasih, Kau Memang Teman Terbaikku pul.. ");
        System.out.println("Saeful      : Sama - Sama, itu Bukan Apa - Apa Kok... ");
        
        System.out.println("");

        System.out.println("");
        System.out.println("*************************************************");
  
    }
}
