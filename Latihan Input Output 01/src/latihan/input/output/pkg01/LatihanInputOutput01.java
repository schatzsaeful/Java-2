/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan.input.output.pkg01;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author fujitsu
 */
public class LatihanInputOutput01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // Source codemu ada dibawah sini
        System.out.println("##############################################################################");
        System.out.println("                                 Program Java 2                               ");
        System.out.println("                              Nama: Saeful Husna                              ");
        System.out.println("###############################################################################");
        System.out.println("");
          
        
        Scanner Saeful = new Scanner (System.in);
        try {
            try (FileOutputStream Husna = new FileOutputStream("SaefulHusna.dat")) {
                System.out.print("Berikan komentarmu di dalam file ini yaa SaefulHusna.dat: ");
                Husna.write(Saeful.next().getBytes());
            }
            
        } catch (IOException e) {
        }
        
        System.out.println("");
        System.out.println("##############################################################################");
        System.out.println("                               Pemrograman Java 2                             ");
        System.out.println("                              Nama: Saeful Husna                              ");
        System.out.println("                                 NPM : 1842809                                ");
        System.out.println("                             Jurusan : Informatika                            ");
        System.out.println("##############################################################################");
                
    }
    
}