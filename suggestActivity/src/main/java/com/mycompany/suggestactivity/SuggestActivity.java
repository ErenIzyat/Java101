/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.suggestactivity;

import java.util.Scanner;

/**
 *
 * @author unfor
 */
public class SuggestActivity {

    public static void main(String[] args) {
        double temp;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter temperature");
        temp = s.nextDouble();
        
         if (temp < 5) 
             System.out.println("you should go skiing ");
         else if (temp >= 5 && temp < 15)
             System.out.println("you should go cinema");
         else if (temp>= 15 && temp < 25)
             System.out.println("you should go picnic");
         else if (temp > 25)
             System.out.println("you should go swimming");
       
        
    }
}
