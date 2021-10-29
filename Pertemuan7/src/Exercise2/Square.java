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

public class Square extends Rectangle {
    public Square() {
        super();
    }
    
    public Square(double side) {
        super(side, side);
    }
    
    public Square(double side, String col, boolean fill) {
        super(side, side, col, fill);
    }
    
    public double getSide() {
        return super.getWidth();
    }
    
    public void setSide(double side) {
        super.setWidth(side);
        super.setLength(side);
    }
    
    @Override
    public void setWidth(double side) {
        super.setWidth(side);
    }
    
    @Override
    public void setLength(double side) {
        super.setLength(side);
    }
    
    @Override
    public String toString() {
        return "A Square with side = " + getSide() + ", which is a subclass of " 
                + super.toString();
    }
}
