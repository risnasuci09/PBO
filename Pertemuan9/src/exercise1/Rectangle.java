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

public class Rectangle extends Shape {
    private double length;
    private double width;
    
    public Rectangle (double length, double width) {
        super("Rectangle");
        this.length = length;
        this.width = width;
    }
    
    public double area() {
        return length * width;
    }
    
    //@Override 
    public String toString() {
        return super.toString() + " of length is " + length + " and width is " + width; 
    }
}
