/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gfufhks;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Gfufhks {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so nguyen n: ");
        long n = sc.nextInt();
        long giaithua = 1;
        for (int i = 1; i <= n; i++) {
            giaithua *= i;
        }
        System.out.println(n + "!" + "=" + giaithua);

        char[] c;
        c = String.valueOf(giaithua).toCharArray();
        int count = 0;

        if (c[c.length - 1] != '0') {
            System.out.println("Giai thua khong co so 0 nao ");

        } else {
            for (int i = c.length - 1; i > 0; i--) {

                if (c[i] == c[i - 1]) {
                    count++;

                }
            }

            System.out.println("so cac so 0 lien tiep là  " + count);
        }
        ///////////Bai TAP 2
        long stn = sc.nextLong();
        int sum = 0;
        char[] tach;
        tach = String.valueOf(stn).toCharArray();
        for (int i = 0; i < tach.length; i++) {
            sum += tach[i];
            System.out.println(sum);

        }
        

    }
}
