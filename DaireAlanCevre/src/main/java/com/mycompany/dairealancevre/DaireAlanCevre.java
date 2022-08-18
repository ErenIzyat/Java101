/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.dairealancevre;

import java.util.Scanner;

/**
 *
 * @author unfor
 */
public class DaireAlanCevre {

    public static void main(String[] args) {
        //Java ile yarı çapını kullanıcıdan aldığınız 
        //dairenin alanını ve çevresini hesaplayan programı yazın.
        int yariCap;
        double alan,cevre;
        Scanner s = new Scanner(System.in);
        System.out.println("yariCap giriniz: ");
        yariCap = s.nextInt();
        alan = yariCap * Math.PI * yariCap;
        cevre = 2 * Math.PI * yariCap;
        System.out.println("Alan : "+alan+" "+"Cevre: "+cevre );
        
    }
}
