/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Soal3;

/**
 * Nama     : Risna Suci Muryanti
 * NIM      : 201511026
 * Kelas    : 2AD3-TI
 * Matkul   : PBO (P)
*/

import java.io.FileInputStream;
import java.util.*;

public class File {
    public static void main(String[] args) {
        FileInputStream file = null;
        try {
            file = new FileInputStream("test.txt");
            Scanner fileReader = new Scanner(file);
        }catch(Exception ex) {
            System.out.println(ex);
        }
    }
}
