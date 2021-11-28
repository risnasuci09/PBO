/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Soal2;

/**
 * Nama     : Risna Suci Muryanti
 * NIM      : 201511026
 * Kelas    : 2AD3-TI
 * Matkul   : PBO (P)
*/

import java.util.*;

public class CustomExcHex {
    public static int HexToDec(String s) throws exceptionHexadesimal{
        if (s.matches("-?[0-9a-fA-F]+")) {
            return Integer.parseInt(s, 16);
        } else {
            throw new exceptionHexadesimal("Input isn't Hexadecimal, Try Again!");
        }
    }
    
    public static void main(String[] args) {
        try {
            Scanner scan = new Scanner(System.in);
            System.out.print("Input Hexadecimal: ");
            String input = scan.next();
            int hex = HexToDec(input);
            System.out.println("Decimal number of " + input + " = " + hex);
        } catch (exceptionHexadesimal ex){
            System.out.println(ex.getMessage());
        }
    }
}
