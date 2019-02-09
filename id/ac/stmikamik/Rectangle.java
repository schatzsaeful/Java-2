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
public class Rectangle extends Shape{
    private final String name;
    private final long panjang;
    private final long lebar;

    public Rectangle(String name, long panjang, long lebar) {
        this.name = name;
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public long getLength() {
        return panjang;
    }

    public long getWidth() {
        return lebar;
    }

    @Override
    public String getNama() {
        return name;
    }

    @Override
    public double getLuas() {
        return panjang * lebar;
        
    }
}