/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.hipotenushesabi;

import java.util.Scanner;

/**
 *
 * @author unfor
 */
public class HipotenusHesabi {

    public static void main(String[] args) {
        int kenar1,kenar2;
        double hipo;
        Scanner s = new Scanner(System.in);
        System.out.println("Kenar1'i giriniz : ");
        kenar1 = s.nextInt();
        
        System.out.println("Kenar2'yi giriniz : ");
        kenar2 = s.nextInt();
        
        hipo = Math.sqrt((kenar1*kenar1) +(kenar2*kenar2));
        System.out.println("Hipotenus: "+hipo);
        
    }
}
