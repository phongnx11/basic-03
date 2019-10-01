/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt7;

import java.util.Scanner;

/**
 *
 * @author admin
 */

public class BT7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a[] = new int[100];
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap cac phan tu cua day");
        for (int i = 0; i < 10; i++) {
            System.out.println("a[" + i + "]");
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            if (a[i] % 2 == 0) {
                System.out.println("cac so chan la   " + a[i]);
                sum += a[i];

            } else {
                System.out.println("cac so le la     " + a[i]);
            }
            if (a[i] % 5 == 1) {
                System.out.println("cac so chia het cho 5 la \t " + a[i]);

            }

        }
        System.out.println("tong cac so chan la \t" + sum);
                
      
    }

}
