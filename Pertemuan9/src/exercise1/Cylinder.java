/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise1;

/**
 * Nama     : Risna Suci Muryanti
 * NIM      : 201511026
 * Kelas    : 2AD3-TI
 * Matkul   : PBO (P)
*/

public class Cylinder extends Shape {
    private double radius;
    private double height;
    
    public Cylinder(double radius, double height) {
        super("Cylinder");
        this.radius = radius;
        this.height = height;
    }
    
    public double area() {
        return Math.PI * radius * radius * height;
    }
    
    //@Override 
    public String toString() {
        return super.toString() + " of radius is " + radius + " and height is " + height; 
    }
}
