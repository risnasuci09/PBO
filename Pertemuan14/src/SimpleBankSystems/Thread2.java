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

//Class untuk Thread2 sebagai Thread Kedua dengan meng-extend Thread
public class Thread2 extends Thread {
    SavingsAccount savingsAccountObject;

    /**
     * Constructor untuk Thread2
     * @param savingsAccountObject Object SavingsAccount
     */
    Thread2(SavingsAccount savingsAccountObject) {
        this.savingsAccountObject = savingsAccountObject;
    }

    //method untuk Run Thread2
    public void run() {
        savingsAccountObject.withdraw(2000);
        savingsAccountObject.withdraw(2000);
        savingsAccountObject.withdraw(2000);
        savingsAccountObject.withdraw(2000);
        savingsAccountObject.withdraw(2000);
    }
}
