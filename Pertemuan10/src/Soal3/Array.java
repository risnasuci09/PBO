/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Soal3;

/**
 * Nama     : Risna Suci Muryanti
 * NIM      : 201511026
 * Kelas    : 2AD3-TI
 * Matkul   : PBO (P)
*/

public class Array {
    public static void main(String[] args) {
        int nilai[] = {20,1,5,9,7};
        /*
        for(int i = 0; i<=5; i++) {
            System.out.println("Nilai dari index array ke-" + i + " = " 
                    + nilai[i]);
        }
        */      
        try {
            for(int i = 0; i<=5; i++) {
                System.out.println("Nilai dari index array ke-" + i + " = " 
                        + nilai[i]);
            }
        }catch(Exception ex) {
            System.out.println("Nilai melebihi batas index array, yaitu "
                    + nilai.length);
        }
    }
}
