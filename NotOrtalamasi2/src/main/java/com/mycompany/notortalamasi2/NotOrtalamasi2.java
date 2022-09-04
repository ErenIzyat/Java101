/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.notortalamasi2;

import java.util.Scanner;

/**
 *
 * @author unfor
 */
public class NotOrtalamasi2 {

    public static void main(String[] args) {
        int matematik,fizik,turkce,kimya,muzik;
        double ort;
        Scanner s = new Scanner(System.in);
        System.out.println("Matematik notunuz: ");
        matematik = s.nextInt();
        System.out.println("Fizik notunuz: ");
        fizik = s.nextInt();
        System.out.println("Turkce notunuz: ");
        turkce = s.nextInt();
        System.out.println("Kimya notunuz: ");
        kimya = s.nextInt();
        System.out.println("Muzik notunuz: ");
        muzik = s.nextInt();
        if(matematik <= 100 && fizik <= 100 && turkce <= 100 && kimya <= 100 && muzik <= 100 &&
           matematik >= 0 && fizik >= 0 && turkce >= 0 && kimya >= 0 && muzik >= 0               )
        {
            ort = (matematik+fizik+turkce+kimya+muzik)/5;
            if(ort >= 55)
                System.out.println("Gectiniz..!");
            else 
                System.out.println("Kaldiniz..!");
        }
        else
            System.out.println("Notlar 0 ve 100 arasında olmalı..!");
    }
}
