/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.kitleindeks;

import java.util.Scanner;

/**
 *
 * @author unfor
 */
public class KitleIndeks {

    public static void main(String[] args) {
        /*Java ile kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın.
        Aşağıdaki formüle göre kullanıcının 
        Kilo (kg) / Boy(m) * Boy(m)
        "Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın.*/
        double boy,kilo,indeks;
        Scanner s = new Scanner(System.in);
        System.out.println("Lütfen Boyunuzu Giriniz: ");
        boy = s.nextDouble();
        System.out.println("Lütfenn Kilonuzu Giriniz: ");
        kilo = s.nextDouble();
        indeks = kilo/(boy*boy);
        System.out.println("Vücut kitle endeksiniz: "+indeks);
        
        
    }
}
