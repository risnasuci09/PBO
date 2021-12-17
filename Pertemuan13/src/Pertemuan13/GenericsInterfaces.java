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

import java.util.Arrays;
class Person implements Comparable<Person> {
    private String firstName;
    private String surname;
    
    public Person(String firstName, String Surname){
        this.firstName = firstName;
        this.surname = Surname;
    }
    
    @Override
    public String toString(){
        return firstName + " " + surname;
    }
    
    @Override
    public int compareTo(Person person){
        int result = surname.compareTo(person.surname);
        return result == 0 ? firstName.compareTo(((Person)person).firstName):result;
    }
}

public class GenericsInterfaces {
    public static void main(String[] args){
        Person[] authors = {
            new Person("D", "S"),
            new Person("J", "G"),
            new Person("T", "C"),
            new Person("C", "S"),
            new Person("P", "C"),
            new Person("B", "B")
        };
        Arrays.sort(authors);
      
        System.out.println("\nOrder after sorting into ascending sequence: ");
        for (Person author : authors){
            System.out.println(author);
        }

        Person[] people ={
            new Person("C", "S"),
            new Person("N", "K"),
            new Person("T", "C"),
            new Person("C", "D")
        };
        int index = 0;
        System.out.println("\nIn Search of authors");

        for(Person person : people){
            index = Arrays.binarySearch(authors, person);
            if(index>=0){
                System.out.println(person + " Was found at index position "+ index);
            } else{
                System.out.println(person + " Was not found. Return value is "+ index);
            }
        }
       
    }
}
