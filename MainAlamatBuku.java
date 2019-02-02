/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alamat.buku;
import alamat.buku.AlamatBuku;
import java.util.Scanner;
/**
 *
 * @author fujitsu
 */
public class MainAlamatBuku {


/**
 *
 * @author user
 */
public class Main {
    
    AlamatBuku buku = new AlamatBuku();
    Scanner Scan = new Scanner(System.in);
    String[][] bukualamat = new String[100][4];
    
    private void input(String nama, String alamat, String telepon, String email){
        buku.setNama(nama);
        buku.setAlamat(alamat);
        buku.setTelepon(telepon);
        buku.setEmail(email);
    }
    
    private void insert(int ind1){
        bukualamat[ind1-1][0] = buku.getNama();
        bukualamat[ind1-1][1] = buku.getAlamat();
        bukualamat[ind1-1][2] = buku.getTelepon();
        bukualamat[ind1-1][3] = buku.getEmail();
    }
    
    private void update(int ind1, int ind2, String update){
        bukualamat[ind1-1][ind2-1] = update;
    }
    
    private void delete(int ind1){
        bukualamat[ind1-1][0] = null;
        bukualamat[ind1-1][1] = null;
        bukualamat[ind1-1][2] = null;
        bukualamat[ind1-1][3] = null;
    }
    
    private void show(){
        for(int i = 0; i < 100; i++){
            System.out.println((i+1)+" => "+bukualamat[i][0]+"\t"+bukualamat[i][1]+"\t"+bukualamat[i][2]+"\t"+bukualamat[i][3]);
        }
    }
}
    
    public static void main(String[] args) {
        
    
        
    }
}

