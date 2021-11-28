/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Soal1;

/**
 * Nama     : Risna Suci Muryanti
 * NIM      : 201511026
 * Kelas    : 2AD3-TI
 * Matkul   : PBO (P)
*/

public class AsyncRun implements Runnable {
    @Override
    public void run() {
        // TODO Auto-generated method stub
        try{
            System.out.println("AsyncRun.run on thread " + 
                Thread.currentThread().getId());
            throw new ArithmeticException();
        } catch(Exception ex) {
            System.out.println(ex + " handled");
        }
    }
    
    public static void main( String[] args ) {
        try {
            Thread t = new Thread(new AsyncRun());
            t.start();
            System.out.println( "main on thread " + 
                    Thread.currentThread().getId());
            throw new NullPointerException();
        }
        catch(Exception ex)
        {
            System.out.println(ex + " handled");
        }
    }
}


