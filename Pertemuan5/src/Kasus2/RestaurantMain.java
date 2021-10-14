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

public class RestaurantMain {
    public static void main(String[] args) { 
        Restaurant menu = new Restaurant(); 
        
        menu.tambahMenuMakanan("Bala-Bala", 1_000, 20); 
        menu.tambahMenuMakanan("Gehu", 1_000, 20); 
        menu.tambahMenuMakanan("Tahu", 1_000, 0); 
        menu.tambahMenuMakanan("Molen", 1_000, 20); 
        menu.tampilMenuMakanan(); 
        
        System.out.println("PESANAN: ");
        menu.PesanMenuMakanan(3, 10);
        menu.PesanMenuMakanan(1, 15);
        menu.PesanMenuMakanan(2, 5);
        System.out.println();
        menu.tampilMenuMakanan();
    }
}
