/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.pow;

import java.util.Scanner;

/**
 * Java ile kullanıcının girdiği değerler ile üslü sayı hesaplayan programı "For
 * Döngüsü" kullanarak yapınız.
 *
 * @author unfor
 */
public class Pow {

    public static void main(String[] args) {
        int num1, num2,result=1;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter base: ");
        num1 = s.nextInt();
        System.out.println("Enter pow: ");
        num2 = s.nextInt();
        for (int i = 1; i <=num2; i++) {
            result *=num1;
        }
        System.out.println(result);
    }
}
