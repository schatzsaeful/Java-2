/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaspemrograman2;

/**
 *
 * @author fujitsu
 */
public class Mobil {

    private boolean mesin;
    private boolean rem;
    private boolean gas;
    private float kecepatanMax;
    private float kecepatan;
    private float percepatan;
    private float bengsin;

    public void start(boolean mesin) {
        if (mesin == true) {
            System.out.println("Mobil Siap Untuk Dijalankan...!\n");
        } else {
            System.out.println("Mobil Belum Siap Untuk Dijalankan!, Silahkan Nyalakan Terlebih Dahulu...!\n");
        }
    }

    public void gas() {
        kecepatanMax = 240;

        if (kecepatan >= kecepatanMax) {
            System.out.println("Turuni Kecepatan, Anda Melebihi Kecepatan Yang Standar....! \nAnda Berada Di Kecepatan: " + kecepatan + "km/jam\n");
             kecepatan++;
        percepatan++;
        } else if (kecepatan <= kecepatanMax ){
            System.out.println("Patuhi Rambu Lalu Lintas,dan Jangan Melebihi Kecepatan Maximal...! \nAnda Berada Di Kecepatan: " + kecepatan + "km/jam\n");
             kecepatan++;
        percepatan++;
        } else {
            System.out.println("Nyalakan Mobilnya Terlebih Dahulu...!\n");
        }
    }

    public void gantiGigi(float percepatan) {
        kecepatan++;

        if (percepatan == 1) {
            System.out.println("Mobil Anda Dalam Percepatan 1...!\n");
            kecepatan = 20;
            kecepatanMax = 40;
            kecepatan++;
        } else if (percepatan == 2) {
            System.out.println("Mobil Anda Dalam Percepatan 2...!\n");
            kecepatan = 40;
            kecepatan++;
            kecepatanMax = 80;
        } else if (percepatan == 3) {
            System.out.println("Mobil Anda Dalam Percepatan 3...!\n");
            kecepatan = 80;
            kecepatanMax = 120;
            kecepatan++;
        } else if (percepatan == 4) {
            System.out.println("Mobil Anda Dalam Percepatan 4...!\n");
            kecepatan = 120;
            kecepatanMax = 180;
            kecepatan++;
        } else if (percepatan == 5) {
            System.out.println("Mobil Anda Dalam Percepatan 5...!\n");
            kecepatan = 180;
            kecepatanMax = 240;
            kecepatan++;
        } else if (percepatan == 0) {
            System.out.println("Anda Berada Di gigi netral, Pindahkan gigi!\n");
        } else {
            System.out.println("Mesin Anda Dalam Keadaan Mati!\n");
        }

    }

    public void rem(boolean rem) {
        percepatan--;
        kecepatan--;

        if (rem == true) {
            System.out.println("Jangan Rem Mendadak Yaaa...!\n");
            kecepatan = kecepatan / 2;
        } else {
            System.out.println("Kurangi Kecepatan Anda Yaa...!\n");
        }
    }

    public void stop(boolean stop) {
      
        System.out.println("Mobil Telah Berhenti, Mohon Berhenti Pada Tempatnya...!\n");
        kecepatan = 0;
        percepatan = 0;
        mesin = false;
        
       
    }

}
