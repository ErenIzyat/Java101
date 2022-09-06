/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.findeven;

import java.util.Scanner;

/**
 *
 * @author unfor
 */
public class FindEven {

    public static void main(String[] args) {
        int number; 
        System.out.println("Enter the number: ");
        Scanner s = new Scanner(System.in);
        number = s.nextInt();
        
        for(int i = 0; i <= number ; i++){
            if(i%2 == 0) 
                System.out.println(i);
        }
        
    }
}
