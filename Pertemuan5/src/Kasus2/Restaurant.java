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

public class Restaurant {
    private static byte id = 0;
    private Makanan menuMakanan;
    
    public Restaurant() { 
        menuMakanan = new Makanan();
    } 
    
    public void tambahMenuMakanan(String nama, double harga, int stok) { 

        menuMakanan.setNama_makanan(nama, id);
        menuMakanan.setHarga_makanan(harga, id);
        menuMakanan.setStok(stok,id);
       id++;
    } 

    public void tampilMenuMakanan(){ 
        System.out.println("--------- MENU MAKANAN --------");
        for(byte i =0; i<=id;i++){ 
            if(!isOutOfStock(i)){ 
                System.out.println(menuMakanan.getNama_makanan(i) +"["+menuMakanan.getStok(i)+"]"+"\tRp. "+menuMakanan.getHarga_makanan(i)); 
            } 
        } 
        System.out.println("-------------------------------");
    } 

    public boolean isOutOfStock(byte id){ 
        if(menuMakanan.getStok(id) == 0){ 
            return true; 
        }else{ 
            return false; 
        } 
    } 
    
    public void PesanMenuMakanan(int idMenu, int jml) {
        byte id = (byte) idMenu;
        if(jml < 0){
            System.out.println("Input Jumlah Makanan Salah");
        }
        if((menuMakanan.getStok(id) - jml) < 0 ){
            System.out.println(menuMakanan.getNama_makanan(id) + " habis");
        }
        else {
            System.out.println(menuMakanan.getNama_makanan(id) + "(" + jml + ")\tRp. " + menuMakanan.getHarga_makanan(id)*jml);
            menuMakanan.kurangStok(id, jml);
        }
    }

}
