/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan.input.output.pkg02;

import java.io.FileInputStream;
import java.io.IOException;

/**
 *
 * @author fujitsu
 */
public class LatihanInputOutput02 {

    /**
     * @param args the command line arguments
     */
 public static void main(String[] args){
        // Source codemu ada dibawah sini
        
        System.out.println("###############################################################################");
        System.out.println("                                  Program Java 2                               ");
        System.out.println("                               Nama: Saeful Husna                              ");
        System.out.println("                                  Membaca Lirik                                ");
        System.out.println("###############################################################################");
        System.out.println("");
        
        try {
            try (FileInputStream Saeful = new FileInputStream("Lirik.txt")) {
                int e;
                while ((e = Saeful.read()) != -1){
                    if (e == 32){
                        System.out.print("_");
                    }else{
                        System.out.print((char) e);
                    }
                }
            }
        
        } catch (IOException e) {
        }
        
        System.out.println("");
        System.out.println("");
        System.out.println("##############################################################################");
        System.out.println("                               Pemrograman Java 2                             ");
        System.out.println("                              Nama: Saeful Husna                              ");
        System.out.println("                                 NPM : 1842809                                ");
        System.out.println("                             Jurusan : Informatika                            ");
        System.out.println("##############################################################################");


        }
            
    }