/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aggregation;

/**
 * Nama     : Risna Suci Muryanti
 * NIM      : 201511026
 * Kelas    : 2AD3-TI
 * Matkul   : PBO (P)
*/

public class Main {
     public static void main(String[] args){
        Titik T = new Titik (3,5);  //objek baru dari komponen penyusun dibuat di main
        Lingkaran L = new Lingkaran (5,T);
        L.buatLingkaran();
    }
}
