/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.passwordcontrol;

import java.util.Scanner;

/**
 *
 * @author unfor
 */
/*
Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp
sıfırlamayacağını sorun, eğer kullanıcı sıfırlamak isterse 
yeni girdiği şifrenin hatalı girdiği ve unuttuğu şifre ile aynı 
olmaması gerektiğini kontrol edip , şifreler aynı ise ekrana 
"Şifre oluşturulamadı, lütfen başka şifre giriniz
" sorun yoksa "Şifre oluşturuldu" yazan programı yazınız.*/
public class PasswordControl {

    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       String password = new String();
       String passwordTry = new String();
       
       System.out.println("Sifrenizi olusturunuz: ");
       password = s.nextLine();
       
       System.out.println("Sifreniz olusturuldu.");
       System.out.println("Sifrenizi giriniz: ");
       passwordTry = s.nextLine();
       if(passwordTry.equals(password)){
            System.out.println("Sifreniz dogru!");  
       }
       else
            System.out.println("Sifreniz yanlis");
        
       
      
        
        
       
    }
}
