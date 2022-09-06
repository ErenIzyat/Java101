/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.flightticket;

import java.util.Scanner;

/**
 *
 * @author unfor
 */
public class FlightTicket {

    public static void main(String[] args) {
        int distance,age,fType;
        double totalPrice;
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter the flight distance: ");
        distance = s.nextInt();
        System.out.println("Enter your age: ");
        age = s.nextInt();
        System.out.println("Enter flight Type 1-)One way ticket 2-)Round Trip ticket ");
        fType = s.nextInt();
        
        
        
        if(distance > 0 && age > 0 && fType <=2 && fType > 0) {
            totalPrice = (distance*0.1) ;
            if(age < 12)
                totalPrice*=0.5;
            if(age >= 12 && age < 24)
                totalPrice*=0.9;
            if(age > 65)
                totalPrice*=0.7;
            totalPrice = (fType == 2) ? totalPrice*0.8 : totalPrice;
            System.out.println("Total Price is: "+totalPrice);
            
        }
        else
            System.out.println("Wrong data!");
        
        
    }
}
