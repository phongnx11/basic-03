/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btvn10;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class BTVN10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("nhap chuoi ky tu : ");

        Scanner sc = new Scanner(System.in);

        String pass = sc.nextLine();

        boolean check = KtDb(pass);
        System.out.println(check);
        System.out.println("Nhap so tien : ");
        Scanner sc2 = new Scanner(System.in);
        String sotien = sc2.nextLine();
        int c = sotien.length();

        if (c < 4) {
            System.out.println("so tien sau khi dinh dang la ");

            System.out.println(sotien + "vnd");
        }
        if (4 <= c && c <= 6) {
            String hn = sotien.substring(c - 3, c);
            String nh = sotien.substring(0, c - 3);
            System.out.println("so tien sau khi dinh dang la ");

            System.out.println(nh + "," + hn + "vnd");
        }
        if (7 <= c && c <= 9) {
            String hn = sotien.substring(c - 3, c);
            String nh = sotien.substring(c - 6, c - 3);
            String ht = sotien.substring(0, c - 6);
            System.out.println("so tien sau khi dinh dang la ");

            System.out.println(ht + "," + nh + "," + hn + "vnd");
        }
        if (10 <= c && c <= 12) {
            String hn = sotien.substring(c - 3, c);
            String nh = sotien.substring(c - 6, c - 3);
            String ht = sotien.substring(c - 9, c - 6);
            String th = sotien.substring(0, c - 9);
            System.out.println("so tien sau khi dinh dang la ");
            System.out.println(th + "," + ht + "," + nh + "," + hn + "vnd");
        }
        String pheptoan = "1111+2345";
        int d = pheptoan.length();
        int e = pheptoan.indexOf("+");
        String sh1 = pheptoan.substring(0, e);
        String sh2 = pheptoan.substring(e, d);
         int g = Integer.valueOf(sh1);
         int h = Integer.valueOf(sh2);
         System.out.println("Ket qua phep tinh la : ");
         System.out.println(g+h);
         //////////////////////////////
         ///////////////////////////////
         ////////////////////////////////
         Scanner sc3 = new Scanner(System.in);
         int A[][] = new int[3][3];
        
             for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                A[i][j] = sc3.nextInt();
                System.out.println("a[" + (i + 1) + "]" + "[" + (j + 1) + "}");
            }

        }
        System.out.println("ma tran a : ");
         for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(A[i][j]+"     ");
                
            }
             System.out.print("\n");
            
        }
          boolean check4 = ktMT(A);  
        System.out.println(check4);
    }
    public static boolean ktMT(int[][] A ){
         for (int i = 0; i <3 ; i++) {
             for (int j = 0; j < 3; j++) {
                 for (int k = 0; k <3; k++) {
                     for (int l = 0; l <3 ; l++) {
                         
                     
                 
                 if( j!=l||k!=i&&A[i][j]!=A[k][l] && A[i][j]!=0 && A[i][j]/10 == 0){
                         
                     return true ;
                 }
             }
    }
             }} return false;}

    public static boolean KtDb(String s) {
        String special = "!,@,#,$,%,^,&,*,(,)";
        char[] a = s.toCharArray();
        char[] b = special.toCharArray();
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    return true;

                }
            }

        }

        return false;

    }
}
