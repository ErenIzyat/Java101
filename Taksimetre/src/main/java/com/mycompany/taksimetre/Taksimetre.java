/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.taksimetre;

import java.util.Scanner;

/**
 *
 * @author unfor
 */
public class Taksimetre {

    public static void main(String[] args) {
        int perKm;
        double ucret,ucretSon;
       
        Scanner s = new Scanner(System.in);
        System.out.println("Kilometre giriniz: ");
        perKm = s.nextInt();
        
        ucret = 10 + perKm*2.20;
        ucretSon = (ucret < 20 ? 20:ucret);
        System.out.println("Taksimetre tutari: "+ ucretSon);
        
        
    }
}
