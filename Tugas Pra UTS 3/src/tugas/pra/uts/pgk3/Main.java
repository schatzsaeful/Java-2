/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas.pra.uts.pkg3;

/**
 *
 * @author fujitsu
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        
        Manager boss = new Manager("Dadan", "Saluyu Indah", 8000);
        boss.setBonus(2000);
        System.out.println("Nama Manager: " + boss.getName());
        System.out.println("Alamat Manager: " + boss.getAddres());
        System.out.println("Salary Pegawai adalah : Rp. " + boss.getSalary());
        
        Staff staff = new Staff("Miracle", "Pangandaran", 4000);
        System.out.println("\nNama Manager: " + staff.getName());
        System.out.println("Alamat Manager: " + staff.getAddres());
        System.out.println("Salary Pegawai adalah: Rp. " + staff.getSalary());
        
        Staff staff2 = new Staff("Dendi", "Ujung Berung", 2000);
        System.out.println("\nNama Manager: " + staff2.getName());
        System.out.println("Alamat Manager: " + staff2.getAddres());
        System.out.println("Salary Pegawai adalah: Rp. " + staff2.getSalary());
        
 
    }
    
}
