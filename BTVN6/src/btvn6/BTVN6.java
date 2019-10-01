/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btvn6;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class BTVN6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a[] = new int[8];
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap cac phan tu cua day");
        for (int i = 0; i < 8; i++) {
            System.out.println("a[" + i + "]");
            a[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < 8; i++) {
            System.out.println(a[i] + "\t");
        }
        for (int i = 0; i < 8; i++) {

            sum += a[i];}
            System.out.println("Tong cua cac so la " + sum);

        }

    }



