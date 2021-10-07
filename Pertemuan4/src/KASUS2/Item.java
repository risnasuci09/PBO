/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KASUS2;

/**
 * Nama     : Risna Suci Muryanti
 * NIM      : 201511026
 * Kelas    : 2AD3-TI
 * Matkul   : PBO (P)
 */

public class Item {
    private String name;
    
    private Item() {
        name = "Ipin";
    }
    
    public Item(String name) {
        this.name = "ipin"; //inisialisasi variabel name
        System.out.println(this.name);
    }
}