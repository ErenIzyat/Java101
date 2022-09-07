/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.combination;

import java.util.Scanner;

/**
 *
 * @author unfor
 */
public class Combination {

    public static void main(String[] args) {
      int n, r, result, totalN = 1, totalR = 1, difference = 1;
        boolean isFalse = false;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the cluster size  : ");
        n = input.nextInt();

        System.out.print("Enter the combination value : ");
        r = input.nextInt();

        if (n >= r && n >= 0 && r >= 0) {

            for (int i = 1; i <= n; i++) {
                totalN = totalN * i;
            }
            for (int j = 1; j <= r; j++) {
                totalR = totalR * j;
            }

            for (int k = 1; k <= (n - r); k++) {
                difference = difference * k;
            }

        } else {
            isFalse = true;
        }

        result = totalN / (totalR * difference);

        if (isFalse) {
            System.out.println("You entered incorrect information !");
        } else {
           
            System.out.println("Result of the combination : " + result);
        }
    }
}
