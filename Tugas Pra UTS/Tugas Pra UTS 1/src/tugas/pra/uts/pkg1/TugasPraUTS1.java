/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas.pra.uts.pkg1;
import java.util.Scanner;

public class TugasPraUTS1 {

    public static void main (String [] args){
       
        System.out.println("                Saeful Husna                ");
        System.out.println("                   1842809                  ");
        System.out.println("                   IF - Z                   ");
        System.out.println("");
        
        System.out.println("Dadan       : Hai, Apakah Kamu Bisa Membuatkan Aku Sebuah Program? ");
        System.out.println("Saeful      : Tentu Saja Bisa, Program Apa, Dan? ");
        System.out.println("Andi        : Saya Membutuhkan Program Yang Bisa Menentukan Titik Koordinat Dari Sebuah Lingkaran Beserta Jari - Jarinya, Serta Bisa Menentukan Bahwa Lingkaran Pertama Dan Kedua Saling Bersinggungan, Saling Lepas, atau Saling Berada Di Dalam Lingkaran Tersebut ");
        System.out.println("Saeful      : Tentu Saja Bisa, Saya Akan Membuatkannya Khusus Untukmu, Tunggu Beberapa Saat Yaa............ \n");
        
        
        String c2;
        String c1;
                
        Scanner input = new Scanner(System.in);
        
        System.out.println("Masukkan Titik atau Posisi Lingkaran C1: ");
       
        System.out.print("Masukkan Posisi X1 : ");
        int x1 = input.nextInt();
        System.out.print("Masukkan Posisi y1 : ");
        int y1 = input.nextInt();
        System.out.print("\n");
        
 
       
        if(x1 > 0 && y1 > 0){
            System.out.println("Lingkaran C1 berada pada kuadran I");
            c1 = "Kuadran I";
        } 
        
        else if(x1 < 0 && y1 > 0){
            System.out.println("Lingkaran C1 berada di Kuadran II");
            c1 = "Kuadran II";
        } 
        
        else if(x1 < 0 && y1 < 0){
            System.out.println("Lingkaran C1 berada di Kuadran III");
            c1 = "Kuadran III";
        } 
        
        else {
            System.out.println("Lingkaran C1 berada di Kuadran IV");
            c1 = "Kuadran IV";
        }
        
        
        int r1 = (x1 + y1) / 2;
        
        System.out.print("\n");
        System.out.println("======================================================================");
        System.out.print("\n");
        
        System.out.println("Masukkan Titik atau Posisi Lingkaran C2: ");
        
        System.out.print("Masukkan Posisi X2 : ");
        int x2 = input.nextInt();
        System.out.print("Masukkan Posisi y2 : ");
        int y2 = input.nextInt();
        
        System.out.print("\n");
       
        if(x2 > 0 && y2 > 0){
            System.out.println("Lingkaran C2 berada di Kuadran I");
            c2 = "Kuadran I";
        }
        
        else if( x2 < 0 && y2 > 0){
            System.out.println("Lingkaran C2 berada di Kuadran II");
            c2 = "Kuadran II";
        }
        
        else if(x2 < 0 && y2 < 0){
            System.out.println("Lingkaran C2 berada di Kuadran III");
            c2 = "Kuadran III";
        }
        
        else {
            System.out.println("Lingkaran C2 berada di Kuadran IV");
            c2 = "Kuadran IV";
        }
        
        int r2 = (x2 + y2) / 2;
        
        System.out.println("");
        System.out.println("======================================================================");
        System.out.println("");
        
        System.out.println("Nilai Titik pada Lingkaran c1 adalah x1 dan y1: (" + x1 + " , " + y1 + ") Berjari - jari: " + r1);
        System.out.println("Nilai Titik pada Lingkaran c2 adalah x2 dan y2: (" + x2 + " , " + y2 + ") Berjari - jari: " + r2);
        
        System.out.println(""); 
        System.out.println("======================================================================");
        System.out.println("");
        
        // C1 Di dalam C2
        
        if (x1 <= x2 && y1 <= y2 && "Kuadran I".equals(c1) && "Kuadran I".equals(c2)) {
            System.out.println("C1 ada di dalam C2 pada Kuadran I");
        }
        
        else if (x1 <= x2 && y1 <= y2 && "Kuadran II".equals(c1) && "Kuadran II".equals(c2)) {
            System.out.println("C1 ada di dalam C2 pada Kuadran II");
        }
        
        else if (x1 <= x2 && y1 <= y2 && "Kuadran III".equals(c1) && "Kuadran III".equals(c2)) {
            System.out.println("C1 ada di dalam C2 pada Kuadran III");
        }
        
        else if (x1 <= x2 && y1 <= y2 && "Kuadran IV".equals(c1) && "Kuadran IV".equals(c2)) {
            System.out.println("C1 ada di dalam C2 pada Kuadran IV");
        }
        
        // C2 Di dalam C1
        
        else if (x2 <= x1 && y2 <= y1 && "Kuadran I".equals(c1) && "Kuadran I".equals(c2)){
            System.out.println("C2 ada di dalam C1 pada Kuadran I");
        }
        
        else if (x2 <= x1 && y2 <= y1 && "Kuadran II".equals(c1) && "Kuadran II".equals(c2)){
            System.out.println("C2 ada di dalam C1 pada Kuadran II");
        }
        
        else if (x2 <= x1 && y2 <= y1 && "Kuadran III".equals(c1) && "Kuadran III".equals(c2)){
            System.out.println("C2 ada di dalam C1 pada Kuadran III");
        }
         
        else if (x2 <= x1 && y2 <= y1 && "Kuadran IV".equals(c1) && "Kuadran IV".equals(c2)){
            System.out.println("C2 ada di dalam C1 pada Kuadran IV");
        }
        
        // Beririsan c1 dan c2
        
        else if (x1 > x2 && y1 < y2 && "Kuadran I".equals(c1) && "Kuadran II".equals(c2)) {
            System.out.println("C1 dan C2 Beririsan pada Kuadran I dan II");
        }
        
        else if (x1 > x2 && y1 < y2 && "Kuadran I".equals(c1) && "Kuadran IV".equals(c2)) {
            System.out.println("C1 dan C2 Beririsan pada Kuadran I dan IV");
        }
         
        else if (x1 > x2 && y1 < y2 && "Kuadran II".equals(c1) && "Kuadran III".equals(c2)) {
            System.out.println("C1 dan C2 Beririsan pada Kuadran II dan II");
        }
                
        else if (x1 > x2 && y1 < y2 && "Kuadran III".equals(c1) && "Kuadran IV".equals(c2)) {
            System.out.println("C1 dan C2 Beririsan pada Kuadran III dan IV");
        }
   
        else if (x1 > x2 && y1 < y2 && "Kuadran IV".equals(c1) && "Kuadran I".equals(c2)) {
            System.out.println("C1 dan C2 Beririsan pada Kuadran IV dan I");
        }
        
        // Beririsan c1 dan c2
        
        else if (x2 > x1 && y2 < y1 && "Kuadran I".equals(c2) && "Kuadran II".equals(c1)) {
            System.out.println("C1 dan C2 Beririsan pada Kuadran I dan II");
        }
        
        else if (x2 > x1 && y2 < y1 && "Kuadran II".equals(c2) && "Kuadran IV".equals(c1)) {
            System.out.println("C1 dan C2 Beririsan pada Kuadran II dan IV");
        }
        
        else if (x2 > x1 && y2 < y1 && "Kuadran II".equals(c2) && "Kuadran III".equals(c1)) {
            System.out.println("C1 dan C2 Beririsan pada Kuadran II dan III");
        }
         
        else if (x2 > x1 && y2 < y1 && "Kuadran III".equals(c2) && "Kuadran IV".equals(c1)) {
            System.out.println("C1 dan C2 Beririsan pada Kuadran III dan IV");
        }
        
        else if (x2 > x1 && y2 < y1 && "Kuadran IV".equals(c2) && "Kuadran I".equals(c1)) {
            System.out.println("C1 dan C2 Beririsan pada Kuadran IV dan I");
        }
        
        // c2 dan c1 Beririsan
        
        else if (x1 > x2 && y1 < y2 && "Kuadran I".equals(c1) && "Kuadran I".equals(c2)) {
            System.out.println("C1 dan C2 Beririsan pada Kuadran I");
        }
        
        else if (x1 > x2 && y1 < y2 && "Kuadran II".equals(c1) && "Kuadran II".equals(c2)) {
            System.out.println("C1 dan C2 Beririsan pada Kuadran II");
        }
        
        else if (x1 > x2 && y1 < y2 && "Kuadran III".equals(c1) && "Kuadran III".equals(c2)) {
            System.out.println("C1 dan C2 Beririsan pada Kuadran III");
        }
         
        else if (x1 > x2 && y1 < y2 && "Kuadran IV".equals(c1) && "Kuadran IV".equals(c2)) {
            System.out.println("C1 dan C2 Beririsan pada Kuadran IV");
        }
        
        // c2 dan c1 Beririsan
        
        else if (x2 > x1 && y2 < y1 && "Kuadran I".equals(c2) && "Kuadran I".equals(c1)) {
            System.out.println("C1 dan C2 Beririsan pada Kuadran I");
        }
        
        else if (x2 > x1 && y2 < y1 && "Kuadran II".equals(c2) && "Kuadran II".equals(c1)) {
            System.out.println("C1 dan C2 Beririsan pada Kuadran II");
        }
        
        else if (x2 > x1 && y2 < y1 && "Kuadran III".equals(c2) && "Kuadran III".equals(c1)) {
            System.out.println("C1 dan C2 Beririsan pada Kuadran III");
        }
         
        else if (x2 > x1 && y2 < y1 && "Kuadran IV".equals(c2) && "Kuadran IV".equals(c1)) {
            System.out.println("C1 dan C2 Beririsan pada Kuadran IV");
        }
        
        // C2 dan C1 Saling Lepas
        
        else {
            System.out.println("C2 dan C1 Saling Lepas");

        }
        
        System.out.println("\n\nDadan            : Terima Kasih, Kau Memang Teman Terbaikku pul.. ");
        System.out.println("Saeful           : Sama - Sama, itu Bukan Apa - Apa Kok... ");
                 
    }

}
           

