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

//Class untuk SavingsAccount untuk Menarik dan Menabung Uang
public class SavingsAccount {
    private float balance = 10000;

    /**
     * method untuk Withdraw (Mengambil Uang)
     * @param anAmount Jumlah Uang yang Ingin Diambil
     */
    public void withdraw(float anAmount) {
        System.out.println("Going to Withdraw...");
        if (anAmount<0.0) {
            throw new IllegalArgumentException("Withdraw Amount Negative");
        }
//		  synchronized(this) {
//		  	if (anAmount<=balance) {
//		  		balance = balance - anAmount;
//		  		System.out.println("withdraw completed...");
//		  		System.out.println("Balance Now : " + balance + "\n");
//		  	}
//		  }
        if (anAmount<=balance) {
            synchronized(this) {
                balance = balance - anAmount;
                System.out.println("Withdraw Completed...");
                System.out.println("Balance Now (After Withdraw) : " + balance + 
                        "\n");
            }
        }
        else {
        	throw new IllegalArgumentException("Less Balance");
        }
    }

    /**
     * method untuk Deposit (Menabung Uang)
     * @param anAmount Jumlah Uang yang Ingin Ditabung
     */
    public void deposit(float anAmount) {
        System.out.println("Going to Deposit...");
        if (anAmount<0.0) {
            throw new IllegalArgumentException("Deposit Amount Negative");
        }
        synchronized(this) {
            balance = balance + anAmount;
            System.out.println("Deposit Completed... ");
            System.out.println("Balance Now (After Deposit) : " + balance + "\n");
        }
    }
}
