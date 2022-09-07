/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.sumeven;

import java.util.Scanner;

/**
 *
 * @author unfor Java döngüler ile tek bir sayı girilene kadar kullanıcıdan
 * girişleri kabul eden ve girilen değerlerden çift ve 4'ün katları olan
 * sayıları toplayıp ekrana basan programı yazıyoruz.
 */
public class SumEven {

    public static void main(String[] args) {
        int num, sum = 0;
        boolean isEven = true;
        System.out.println("Enter number: ");
        Scanner s = new Scanner(System.in);
        num = s.nextInt();
        if (num % 4 == 0) {
            sum += num;
            System.out.println("Sum is: " + sum);
        } 
       
        while (isEven) {

            num = s.nextInt();
            if (num % 4 != 0) {
                isEven = false;
            } 
            else {
                sum += num;
                System.out.println("Sum is: " + sum);
            }

        }

    }
}
