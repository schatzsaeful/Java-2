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
public class Manager extends Employee {
    
    private double bonus;

    public Manager(String name, String addres, double salary) {
        super(name, addres, salary);
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public double getSalary() {
        return salary + bonus;
    }
    
}
