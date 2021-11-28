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

public class variableReference {
    public static void main(String[] args) {
        String nama;
        //System.out.println("Hello " +  nama + "..!");
        
        try {
            nama = new String();
            System.out.println("Hello " +  nama + "..!");
        }catch(Exception ex) {
            System.out.println(ex);
        }
    }
}
