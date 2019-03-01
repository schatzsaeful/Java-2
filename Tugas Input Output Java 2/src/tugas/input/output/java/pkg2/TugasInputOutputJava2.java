/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas.input.output.java.pkg2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author fujitsu
 */
public class TugasInputOutputJava2 {

    /**
     * @param args the command line arguments
     */
 public static void BukuBaruSaeful() {
        try (FileOutputStream file = new FileOutputStream("addressbook.dat", true)) {
            Scanner DataSaeful = new Scanner(System.in);

            System.out.print("Masukan Nama Kamu Disini: ");
            String namaSaeful = DataSaeful.nextLine() + "\t";

            System.out.print("Masukan Alamat Kamu Disini: ");
            String alamatSaeful = DataSaeful.nextLine() + "\t";

            System.out.print("Masukan Telepon Kamu Disini: ");
            String hpSaeful = DataSaeful.nextLine() + "\t";

            System.out.print("Masukan Email Kamu Disni: ");
            String emailSaeful = DataSaeful.nextLine() + "\n";

            file.write(namaSaeful.getBytes());
            file.write(alamatSaeful.getBytes());
            file.write(hpSaeful.getBytes());
            file.write(emailSaeful.getBytes());

            file.close();
        } catch (IOException e) {
            e.printStackTrace();

        }
    }

    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        do {
            System.out.println("###############################################################################");
            System.out.println("                                  Program Java 2                               ");
            System.out.println("                               Nama: Saeful Husna                              ");
            System.out.println("                                  Membaca Lirik                                ");
            System.out.println("###############################################################################");
            System.out.println("");
            
            System.out.println("1. Buat Data Buku Kamu");
            System.out.println("2. Tampilkan Data Buku Kamu");
            System.out.println("3. Keluar Dari Program ini");
            System.out.println("");
            
            System.out.print("Masukan pilihan Kamu Disini : ");
            int opsi = s.nextInt();
            switch (opsi) {
                case 1:
                    System.out.println("##############################################################################");
                    System.out.println("                               Pemrograman Java 2                             ");
                    System.out.println("                              Nama: Saeful Husna                              ");
                    System.out.println("                                 NPM : 1842809                                ");
                    System.out.println("                             Jurusan : Informatika                            ");
                    System.out.println("##############################################################################");
                    BukuBaruSaeful();
                    break;
                    
                case 2:
                    System.out.println("##############################################################################");
                    System.out.println("                               Pemrograman Java 2                             ");
                    System.out.println("                              Nama: Saeful Husna                              ");
                    System.out.println("                                 NPM : 1842809                                ");
                    System.out.println("                             Jurusan : Informatika                            ");
                    System.out.println("##############################################################################");
                    BukaFileSaeful();
                    break;
                    
                case 3:

                    System.out.println("##############################################################################");
                    System.out.println("                               Pemrograman Java 2                             ");
                    System.out.println("                              Nama: Saeful Husna                              ");
                    System.out.println("                                 NPM : 1842809                                ");
                    System.out.println("                             Jurusan : Informatika                            ");
                    System.out.println("##############################################################################");
                    System.exit(0);
                    
                    break;
                default:
                    System.out.println(" Pilihan anda salah !!! ");
                    break;
            }
            System.out.println();
            System.out.println();
            
        } while (true);
    }

    public static void BukaFileSaeful() throws IOException {
        try (FileInputStream i = new FileInputStream("addressbook.dat")) {

            int data;

            while ((data = i.read()) != -1) {
                System.out.print((char) data);
            }

            i.close();
        } catch (FileNotFoundException e) {
            System.out.println("Data Kamu Belum ada sama sekali");
        }
       
       
    }

}