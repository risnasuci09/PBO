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

public class Main {
    public static void main (String[] args) {
        //Testing Class Shape
        Shape s1 = new Shape();
        System.out.println(s1.toString());
        
        Shape s2 = new Shape("Blue", false);
        System.out.println(s2.toString());
       
        System.out.println();
	
        //Testing Class Circle
	Circle c1 = new Circle();
	System.out.println("Luas = " + c1.getArea());
	
        Circle c2 = new Circle(9.0);
	System.out.println("Luas = " + c2.getArea());
	
        Circle c3 = new Circle(12.0, "Yellow", false);
	System.out.println("Luas = " + c3.toString());
	
	System.out.println();
	
        //Testing Class Rectangle
	Rectangle r1 = new Rectangle();
        System.out.println(r1.toString());
	System.out.println("Luas = " + r1.getArea() + " Keliling = " 
                + r1.getPerimeter());
	
        Rectangle r2 = new Rectangle(8.0, 4.0);
	System.out.println(r2.toString());
        System.out.println("Luas = " + r2.getArea() + " Keliling = " 
                + r2.getPerimeter());
	
        Rectangle r3 = new Rectangle(10.0, 5.0, "Green", true);
	System.out.println(r3.toString());
        System.out.println("Luas = " + r3.getArea() + " Keliling = " 
                + r3.getPerimeter());
	
	System.out.println();
	
        //Testing Class Square
	Square square = new Square();
	System.out.println(square.toString());
	System.out.println("Luas = " + square.getArea() + " Keliling = " 
                + square.getPerimeter());
    }
}
