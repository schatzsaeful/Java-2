/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas.pra.uts3;

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
        
        
        
        Employee boss = new Manager("Dadan", "Saluyu Indah", 800000, 200000);
        System.out.println("Nama Manager: " + boss.getName());
        System.out.println("Alamat Manager: " + boss.getAddres());
        System.out.println("Salary Manager adalah : Rp. " + boss.getSalary());
        
        Employee staff = new Staff("Miracle", "Pangandaran", 400000);
        System.out.println("\nNama Staff: " + staff.getName());
        System.out.println("Alamat Staff: " + staff.getAddres());
        System.out.println("Salary Staff adalah : Rp. " + staff.getSalary());
        
        Employee staff2 = new Staff("Dendi", "Ujung Berung", 200000);
        System.out.println("\nNama Staff: " + staff2.getName());
        System.out.println("Alamat Staffr: " + staff2.getAddres());
        System.out.println("Salary Staff adalah : Rp. " + staff2.getSalary());
        
 
    }
    
}
