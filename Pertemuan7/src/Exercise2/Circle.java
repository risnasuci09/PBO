/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise2;

/**
 * Nama     : Risna Suci Muryanti
 * NIM      : 201511026
 * Kelas    : 2AD3-TI
 * Matkul   : PBO (P)
*/

public class Circle extends Shape {
    private double radius;
    
    public Circle() {
        radius = 1.0;
    }
    
    public Circle(double radius) {
        this.radius = radius;
    }
    
    
    public Circle(double r, String c, boolean fill) {
        this.radius = r;
        super.setColor(c);
        super.setFilled(fill);
    }
    
    public double getRadius() {
        return radius;
    }
    
    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    public double getArea() {
        return Math.PI*radius*radius;
    }
    
    public double getPerimeter() {
        return 2*Math.PI*radius;
    }
    
    @Override
    public String toString() {
        return "A Circle with radius = " + radius + ", which is a subclass of " 
                + super.toString();
    }
}
