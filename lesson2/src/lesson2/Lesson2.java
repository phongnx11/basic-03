/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson2;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Lesson2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for (int i = 0; i < 10; i = i + 1) {
            System.out.println(i);

        }

        int a = 7;
        while (a / 7 < 3) {
            System.out.println("gia tri cua a la " + a);
            a = a + 1;

        }

        for (int i = 1; i < 3; i++) {
            System.out.println("ben ngoai :" + i);
            for (int b = 0; b < 4; b++) {
                System.out.println("ben trong:" + b);
                break;
            }

//Math.
            System.out.println("Nhap vao K :");
            Scanner sc = new Scanner(System.in);
            int k = sc.nextInt();
            int count = 0;

            for (int j = 1; j < k; j++) {
                if (k % j == 0);
                System.out.println(j);
                count = count + 1;
            }
            if (count == 2) {
                System.out.println("la SNT" );
                
            }

        }

//end point
    }
}
