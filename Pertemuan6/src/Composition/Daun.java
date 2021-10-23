/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Composition;

/**
 * Nama     : Risna Suci Muryanti
 * NIM      : 201511026
 * Kelas    : 2AD3-TI
 * Matkul   : PBO (P)
*/

//class penyusun
public class Daun {
    private int jmlRuas;

    public Daun(int jmlRuas) {
        this.jmlRuas = jmlRuas;
    }
    
    public int getJmlRuasDaun() {
        return jmlRuas;
    }
    
    public static void main(String[] args) {
        Pohon alpukat = new Pohon("Alpukat", 25);
        alpukat.tampilPohon();
    }
}

//class komposit
class Pohon {
    String nama;
    Daun daun;

    public Pohon(String n, int jmlRuas) {
        nama = n;
        daun = new Daun(jmlRuas);                                               //Penciptaan objek di dalam konstruktor
    }
    
    public void tampilPohon(){
        System.out.println("Pohon = " + nama);
        System.out.println("Jumlah Ruas Daun = " + daun.getJmlRuasDaun());      //Method class penyusun bisa dipanggil di class komposit
    }
}