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

abstract class Shape {
    private String shapeName;
    
    public Shape(String name) {
        shapeName = name;
    }

    // computes the area of the shapes
    abstract double area();
    
    public String toString() {
        return shapeName;
    }
}
