/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pertemuan12;

/**
 * Nama     : Risna Suci Muryanti
 * NIM      : 201511026
 * Kelas    : 2AD3-TI
 * Matkul   : PBO (P)
*/

import java.io.*;
import java.util.ArrayList;
import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;

public class Main {
    public static void main(String[] args) {
        Gson gson = new Gson();
        try {
            ArrayList<Barang> produk = gson.fromJson(
              new FileReader("D:\\POLBAN\\SEMESTER 3\\PBO\\Praktikum\\Pertemuan12\\barang.json"), 
              new TypeToken<ArrayList<Barang>>() {}.getType()
            );
            for(int i=0;i<produk.size();i++){
                System.out.println("Barang ke-"+(i+1)+": "+produk.get(i).toString());
            }
        }catch (JsonIOException | JsonSyntaxException | FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
