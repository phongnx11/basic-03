/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson3;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Lesson3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a[] = {1, 3, 5, 7, 9};
        for (int i = a.length - 1; i >= 0; i--) {
            System.out.print("Index:" + i);
            System.out.println("  Value" + a[i]);
        }
        int k = 4;
        System.out.println("index(k):" + a[k]);                                                                        

        String s = "Xuan Phong";
        for (int i = 0; i < s.length(); i++) {
            System.out.print("Index:" + i);
            System.out.print("\tValue:" + s.charAt(i));
            System.out.println("");
        }
        char u = 'y';
        boolean timthay = false;
        for (int j = 0; j < s.length(); j++) {
            if (s.charAt(j) == u) {
                System.out.println("tim thay tai  " + j);
                timthay = true;
            }
        }
        if (timthay == false) {
            System.out.println("khong tim thay");

        }

        int[] b = {1, 23, 34, 45, 56, 6, 7, 78, 89};
        int h = 657;
        boolean tim = false;
        for (int i = 0; i < b.length; i++) {
            if (b[i] == h) {
                System.out.println("tim thay tai " + i);
                tim = true;
            }
            if (tim == false) {
                System.out.println("khong tim thay");
            break;
            }

        }
String key_word = "Phong";
if( s.contains(key_word)){
    System.out.println(key_word+"co trong s");
}
int[] E={1,22,36,42,22,7,9,30,46};
        for (int i = 0; i < E.length; i++) {
            int cout=0;
            System.out.print("index: "+i);
            System.out.println("\tValue: "+E[i]);
            int S=E[i]+E[i+1];
            System.out.println("Tong cac phan tu la "+S );
        
        System.out.println("chieu dai cua mang E la: " + s.length());
    if(E[i]%5==1){
        System.out.println("Cac so chia het cho 5 du 1 la  " +E[i]);}
    
    }
        
    
        
    }   
            
    }
    


