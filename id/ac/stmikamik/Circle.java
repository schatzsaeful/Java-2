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
public class Circle extends Shape {
    private final float jari2;
    private final String name;

    public Circle(float jari2, String nama) {
        this.jari2 = jari2;
        this.name = nama;
    }

    public float getJari2() {
        return jari2;
    }

    
    @Override
    public String getNama() {
        return name;
    }

    @Override
    public double getLuas() {
        return Math.PI * Math.pow(jari2, 2);
    }
}
