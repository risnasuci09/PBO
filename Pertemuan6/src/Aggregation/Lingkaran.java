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

//class agregat
public class Lingkaran {
    private float jarijari;
    private Titik titikPusat;

    public Lingkaran(float jarijari, Titik titikPusat) {
        this.jarijari = jarijari;
        this.titikPusat = titikPusat;
    }
    
    public void buatLingkaran() {
        System.out.printf("Posisi Titik : ");
        titikPusat.posisiTitik();
        System.out.println("Jari-jari : " + jarijari + "\n");
    }
}
