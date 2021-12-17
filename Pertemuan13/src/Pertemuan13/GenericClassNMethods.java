/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan13;

/**
 *
 * @author hp
 */

//Generic Class
class Test<T> { 
    T obj; 
    
    Test(T obj) { 
        this.obj = obj; 
    } 

    //Generic Method
    public T getObject() { 
        return this.obj; 
    } 
} 

// Driver class to test above
public class GenericClassNMethods {
    public static void main (String[] args) { 
	// instance of Integer type 
	Test <Integer> iObj = new Test<Integer>(20); 
	System.out.println(iObj.getObject()); 

	// instance of String type 
	Test <String> sObj = new Test<String>("Hallo Word..!!"); 
	System.out.println(sObj.getObject()); 
    }
}
