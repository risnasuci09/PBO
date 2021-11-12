/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lat7_3;

/**
 * Nama     : Risna Suci Muryanti
 * NIM      : 201511026
 * Kelas    : 2AD3-TI
 * Matkul   : PBO (P)
*/

//Represents a staff member that work as a volunteer
public class Volunteer extends StaffMember {
    //Sets up this volunteer using the specified information.
    public Volunteer (String eName, String eAddress, String ePhone) {
        super (eName, eAddress, ePhone);
    }
    
    //Returns a zero pay value for this volunteer
    public double pay() {
        return 0.0;
    }
}