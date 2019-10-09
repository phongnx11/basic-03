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
        int n;
        System.out.println("nhap cac kich thuoc cua mang ");
n = sc.nextInt();
        
        int a[][] = new int[n][n];

        
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
                System.out.println("a[" + (i + 1) + "]" + "[" + (j + 1) + "}");
            }

        }
        System.out.println("ma tran a : ");
         for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j]+"     ");
                
            }
             System.out.print("\n");
            
        }
    }
}
