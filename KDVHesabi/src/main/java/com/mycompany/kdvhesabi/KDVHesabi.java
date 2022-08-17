/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.kdvhesabi;

import java.util.Scanner;

/**
 *
 * @author unfor
 */
public class KDVHesabi {

    public static void main(String[] args) {
        double fiyat,kdvOran;
        Scanner s = new Scanner(System.in);
        System.out.println("Para miktarını giriniz: ");
        fiyat = s.nextDouble();
        kdvOran = ((fiyat > 100) ? 0.8 : 1.8);
        System.out.println("KDV'siz Fiyat: "+ fiyat);
        System.out.println("KDV'li Fiyat: "+ fiyat*kdvOran);
        System.out.println("KDV Orani: "+ kdvOran);
        
       
        
        
    }
}
