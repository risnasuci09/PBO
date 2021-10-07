/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KASUS1;

/**
 * Nama     : Risna Suci Muryanti
 * NIM      : 201511026
 * Kelas    : 2AD3-TI
 * Matkul   : PBO (P)
 */

public class Inventori {
    Barang[] barangs;
    
    //method untuk inisialisasi barang + jumlah stok
    void initBarang() {
        barangs = new Barang[2];
        barangs[0] = new Barang("001", "Baju", 10);
        barangs[1] = new Barang("002", "Celana", 20);
    }
    
    //method untuk menampilkan
    void showBarang() {
        System.out.println(barangs[0].nama_barang + "(" + barangs[0].getStok() + ")");
        System.out.println(barangs[1].nama_barang + "(" + barangs[1].getStok() + ")");
    }
    
    //method untuk melakukan pengadaan barang dan penambahan stok
    void pengadaan() {
        initBarang();
        
        /*barangs[0].stok += 20;
        barangs[0].stok -= 30; //Bisa juga dikurangi dong?
        barangs[0].stok *= 30; //dikali juga bisa dong??*/
        
        barangs[0].setStok(20);
        showBarang();
    }
    
    public static void main(String[] args) {
        Inventori beli = new Inventori();
        beli.pengadaan();
    }
}
