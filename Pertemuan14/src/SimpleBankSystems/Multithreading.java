/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SimpleBankSystems;

/**
 * Nama     : Risna Suci Muryanti
 * NIM      : 201511026
 * Kelas    : 2AD3-TI
 * Matkul   : PBO (P)
*/

//Class untuk Multithreading (Main Class)
public class Multithreading {
    /**
     * method untuk entry point (main method)
     * @param args Input Argumen
     */
    public static void main(String args[]) {
        SavingsAccount savingsAccountObject = new SavingsAccount();
        
        Thread1 t1 = new Thread1(savingsAccountObject);
        Thread2 t2 = new Thread2(savingsAccountObject);
        
        t1.start();
        t2.start();
    }
}
