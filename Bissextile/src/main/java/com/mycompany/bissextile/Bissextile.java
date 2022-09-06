/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.bissextile;

import java.util.Scanner;

/**
 *
 * @author unfor
 */
public class Bissextile {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter year: ");
        int year = scan.nextInt();

        if (year % 100 == 0) {
            if (year % 400 == 0) {
                System.out.println(year + " is bissextile");
            } else {
                System.out.println(year + " isn't bissextile");
            }
        } else if (year % 4 == 0) {
            System.out.println(year + " is bissextile");
        } else {
            System.out.println(year + " isn't bissextile");
        }
    }
}
