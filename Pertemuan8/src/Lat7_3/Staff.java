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

//Represents The Personnel Staff of a Particular Business
public class Staff {
    StaffMember[] staffList;
	
    // sets up the list of staff members.
    public Staff() {
	staffList = new StaffMember[8];
		
	staffList[0] = new Executive ("Sam", "123 Main Line", 
                "555-0469","123-45-6789",2423.07);
		
	staffList[1] = new Employee ("Carla", "456 Off Line", 
                "555-0101","987-65-4321",1246.15);
		
	staffList[2] = new Employee ("Woody", "789 Off Rocker", 
                "555-0000","010-20-3040",1169.23);
		
	staffList[3] = new Hourly ("Diane", "678 Fifth Ave.", 
                "555-0690","958-47-3625",10.55);
		
	staffList[4] = new Volunteer ("Norm", "987 Suds Blvd.", "555-8374");
		
	staffList[5] = new Volunteer ("Cliff", "321 Duds Lane", "555-7282");
        
        staffList[6] = new Commission("Risna", "009 Bandung Barat", "555-1234", 
                "009-11-2002", 9.75, 0.2);
        
        staffList[7] = new Commission("Suci", "109 Bandung Raya", "555-4321", 
                "009-2002-11", 7.00, 0.3);
		
        ((Executive)staffList[0]).awardBonus(500.00);
        
        ((Hourly)staffList[3]).addHours (40);
        
        ((Commission)staffList[6]).addHours(50);
        ((Commission)staffList[6]).addSales(500);
        
        ((Commission)staffList[7]).addHours(35);
        ((Commission)staffList[7]).addSales(800);
    }
    
    //Pays all staff members
    public void payday () {
        double amount;
        
        for (int count=0; count < staffList.length; count++)
        {
            System.out.println (staffList[count]);
            
            amount = staffList[count].pay();  // polymorphic
            
            if (amount == 0.0) {
                System.out.println ("Thanks!");
            }else {
                 System.out.println ("Paid: " + amount);
            }
            
            System.out.println ("-----------------------------------");
        }
    }
}
