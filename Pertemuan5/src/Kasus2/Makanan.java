/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kasus2;

/**
 * Nama     : Risna Suci Muryanti
 * NIM      : 201511026
 * Kelas    : 2AD3-TI
 * Matkul   : PBO (P)
*/

public class Makanan {
    private String[] nama_makanan; 
    private double[] harga_makanan; 
    private int[] stok;
    
    public Makanan() { 
        this.nama_makanan = new String[10]; 
        this.harga_makanan = new double[10]; 
        this.stok = new int[10]; 
    }
    
    public String getNama_makanan(byte id) {
        return nama_makanan[id];
    }

    public void setNama_makanan(String nama_makanan, byte id) {
        this.nama_makanan[id] = nama_makanan;
    }

    public double getHarga_makanan(byte id) {
        return harga_makanan[id];
    }

    public void setHarga_makanan(double harga_makanan, byte id) {
        this.harga_makanan[id] = harga_makanan;
    }

    public int getStok(byte id) {
        return stok[id];
    }

    public void setStok(int stok,byte id) {
        this.stok[id] += stok;
    }

    public void kurangStok(byte id, int jml) {
        this.stok[id] -= jml;
    }
}
