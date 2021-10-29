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

public class Shape {
    private String color;
    private boolean filled;
    
    public Shape(){
        color = "green";
        filled = true;
    }
    
    public Shape(String col, boolean fill){
        color = col;
        filled = fill;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public boolean isFilled() {
        return filled;
    }
    
    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    
    public String toString() {
        if(isFilled()) {
            return "A Shape with color of " + color + "is Filled"	;
        }else {
            return "A Shape with color of " + color + "isn't Filled";
        }
    }
}