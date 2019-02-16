/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.ac.stmikamik;

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
        
        System.out.println("=================================================");
        System.out.println("                    Saeful Husna                 ");
        System.out.println("                      1842809                    ");
        System.out.println("                      IF - Z                     ");
        System.out.println("=================================================\n");
        
        Circle circle = new Circle(10, "\nBola Dunia");
        System.out.println("Nama benda adalah: " + circle.getNama());
        System.out.println("Radius benda adalah: " + circle.getRadius());
        System.out.println("Luasnya adalah: " + circle.getLuas());
        
        System.out.println("=================================================\n");
        
        Rectangle rectangle =  new Rectangle("\nbalok meja", 25, 30);
        System.out.println("Nama benda adalah: " + rectangle.getNama());
        System.out.println("Panjang benda adalah: " + rectangle.getLength());
        System.out.println("Lebar benda adalah: " + rectangle.getWidth());
        System.out.println("Luasnya adalah: " + rectangle.getLuas());
        
        System.out.println("=================================================");
    }
    
}
