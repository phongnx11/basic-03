/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt8;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class BT8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        int a[] = new int[100];
        int n;
        n = sc2.nextInt();
        System.out.println("kich thuoc cua ma tran la   " + n);
        System.out.println("nhap cac phan tu cua day");
        for (int i = 0; i < 10; i++) {
            System.out.println("a[" + i + "]");
            a[i] = sc.nextInt();

        }
        for (int i = 0; i < 3; i++) {
            System.out.print("  " + a[i]);
            System.out.print("  " + a[i]);
            System.out.println("  " + a[i]);
        }
        for (int i = 3; i < 7; i++) {
             System.out.print("  " + a[i]);
            System.out.print("  " + a[i]);
            System.out.println("  " + a[i]);
        }

        for (int i = 7; i < 10; i++) {
             System.out.print("  " + a[i]);
            System.out.print("  " + a[i]);
            System.out.println("  " + a[i]);
        }

    }

}
