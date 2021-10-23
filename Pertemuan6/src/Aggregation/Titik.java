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

//class penyusun
public class Titik {
    private float X, Y;

    public Titik(float x, float y) {
        X = x;
        Y = y;
    }
    
    public void posisiTitik(){
        System.out.println("[" + X + "," + Y + "]");
    }
}
