/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lat7_1;

/**
 * Nama     : Risna Suci Muryanti
 * NIM      : 201511026
 * Kelas    : 2AD3-TI
 * Matkul   : PBO (P)
*/

public class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("Meow");
    }
    
    public static void main(String[] args) {
        Animal obj = new Cat();
        obj.sound();
    }
}
