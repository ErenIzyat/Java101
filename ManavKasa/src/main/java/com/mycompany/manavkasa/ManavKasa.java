/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.manavkasa;

import java.util.Scanner;

/**
 *
 * @author unfor
 */
public class ManavKasa {

    public static void main(String[] args) {
        double armut = 1.4; 
        double elma = 3.67;
        double domates = 1.11;
        double muz = 0.95;
        double patlican = 5.0;
        
        int armutKg,elmaKg,domatesKg,muzKg,patlicanKg;
        
        Scanner s = new Scanner(System.in);
        System.out.println("Armut kaç kg?: ");
        armutKg = s.nextInt();
        System.out.println("Elma kaç kg?: ");
        elmaKg = s.nextInt();
        System.out.println("Domates kaç kg?: ");
        domatesKg = s.nextInt();
        System.out.println("Muz kaç kg?: ");
        muzKg = s.nextInt();
        System.out.println("patlican kaç kg?: ");
        patlicanKg = s.nextInt();
        
        System.out.println("Toplam tutar: "+((armut*armutKg)+(elma*elmaKg)+(domates*domatesKg)+(muz*muzKg)+(patlican*patlicanKg)));
        
        
        
    }
}
