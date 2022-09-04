/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.sorting;

import java.util.Scanner;

/**
 *
 * @author unfor
 */
public class Sorting {

    public static void main(String[] args) {
        int num1,num2,num3;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the value of number1: ");
        num1 = s.nextInt();
        System.out.println("Enter the value of number2: ");
        num2 = s.nextInt();
        System.out.println("Enter the value of number3: ");
        num3 = s.nextInt();
        
        if(num1 > num2 && num1 > num3 && num1 != num2 && num1 !=num3) {
            if(num2 > num3 && num2!= num3) 
                System.out.println("Num1 > num2 > num3");
            else if(num3 > num2 && num3!=num2)
                System.out.println("Num1 > num3 > num2");
        }
        else if(num2 > num1 && num2 > num3 && num2 != num1 && num2 !=num3) {
            if(num1 > num3 && num1!= num3) 
                System.out.println("Num2 > num1 > num3");
            else if(num3 > num1 && num3!=num1)
                System.out.println("Num2 > num3 > num1");
        }
        else if(num3 > num2 && num3 > num1 && num3 != num2 && num3 !=num1) {
            if(num2 > num1 && num2!= num1) 
                System.out.println("Num3 > num2 > num1");
            else if(num1 > num2 && num1!=num2)
                System.out.println("Num3 > num1 > num2");
        }
        else
            System.out.println("Num1 = num2 = num3");
           
    }
}
