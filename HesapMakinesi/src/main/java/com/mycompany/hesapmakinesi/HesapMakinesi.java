/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.hesapmakinesi;

import java.util.Scanner;

/**
 *
 * @author unfor
 */
public class HesapMakinesi {

    public static void main(String[] args) {
        int sayi1,sayi2,islem;
        Scanner s = new Scanner(System.in);
        System.out.println("Sayi1 giriniz: ");
        sayi1 = s.nextInt();
        System.out.println("Sayi2 giriniz: ");
        sayi2 = s.nextInt();
        
        System.out.println("Yapmak istediginiz islemi seciniz 1-) Toplama 2-) Cıkarma 3-)Carpma 4-)Bölme: ");
        islem = s.nextInt();
        switch (islem) {
            case 1:
                int toplam = sayi1+sayi2;
                System.out.println("Toplam: "+toplam);
                break;
            case 2:
                int cikar = sayi1-sayi2;
                System.out.println("Cikarma: "+cikar);
                break;
            case 3:
                int carp = sayi1*sayi2;
                System.out.println("Carp: "+carp);
                break;
            case 4:
                double bol = sayi1/sayi2;
                System.out.println("Bol: "+bol);
            default:
                System.out.println("Gecerli islem giriniz.");
        }
        
    }
}
