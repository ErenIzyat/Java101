/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.powersof4and5;

import java.util.Scanner;

/**
 * Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana
 * yazdıran programı yazıyoruz.
 *
 * @author unfor
 */
public class PowersOf4and5 {

    public static void main(String[] args) {
        int num, fivePow = 1, fourPow = 1;
        System.out.println("Enter num: ");
        Scanner s = new Scanner(System.in);
        num = s.nextInt();
        for (int i = 1; i <= num; i++) {
            fivePow *= 5;
            fourPow *= 4;

        }
        System.out.println("Five Pow : " + fivePow);
        System.out.println("Four Pow : " + fourPow);
    }
}
