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

//Class untuk Thread1 sebagai Thread Pertama dengan meng-extend Thread
public class Thread1 extends Thread {
    SavingsAccount savingsAccountObject;

    /**
     * Constructor untuk Thread1
     * @param savingsAccountObject Object SavingsAccount
     */
    Thread1(SavingsAccount savingsAccountObject) {
        this.savingsAccountObject = savingsAccountObject;
    }

    //method untuk Run Thread1
    public void run() {
        savingsAccountObject.deposit(20000);
        savingsAccountObject.deposit(20000);
        savingsAccountObject.deposit(20000);
        savingsAccountObject.deposit(20000);
    }
}
