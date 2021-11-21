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

//Represents a sphere
public class Sphere extends Shape {
    private double radius;

    //Constructor: sets up the sphere
    public Sphere(double r) {
        super("Sphere");
        radius = r;
    }

    //Return the surface area of the sphere
    public double area() {
        return 4*Math.PI*radius*radius;
    }
    
    //Returns the sphere as a String
    @Override 
    public String toString() {
        return super.toString() + " of radius is " + radius; 
    }
}
