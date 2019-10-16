/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btvn2lesson7;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class BTVN2Lesson7 {

    public static int N, x, y,tg;
    public static Scanner sc = new Scanner(System.in);
    public static int[] array;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        inputN();
        Chuyendoi1(array);
        int[] a = Chuyendoi1(array);
        Chuyendoi2(array);
        int[] b = Chuyendoi2(array);
        System.out.println("Mang sau khi chuyen doi la ");
        for (int i = 0; i < N; i++) {
            if (x > y) {
                System.out.print(b[i]);
                System.out.print(" ");
            } else {
                System.out.print(a[i]);
                System.out.print(" ");
            }

        }
    }

    private static void inputN() {
        System.out.println("nhap so ki tu mang N la ");
        N = sc.nextInt();
        while (true) {
            if (N < 6) {
                System.out.println("Nhap sai gia tri . Moi nhap lai ");
                N = sc.nextInt();
            } else {
                break;
            }
        }
        array = new int[N];
        System.out.println("nhap cac phan tu cua mang N la ");
        for (int i = 0; i < N; i++) {
            System.out.print("a[ " + i + " ] " + "=");
            array[i] = sc.nextInt();
        }
        System.out.println("Mang N la ");
        for (int i = 0; i < N; i++) {
            System.out.print(array[i]);
            System.out.print(" ");
        }
        System.out.println("");
        System.out.println("Nhap vi tri ban dau ");
        x = sc.nextInt();
        while (true) {
            if (x >= N) {
                System.out.println("Nhap sai .Xin nhap lai");
                x = sc.nextInt();
            } else {
                break;
            }
        }
        System.out.println("Nhap vi tri muon chuyen doi ");
        y = sc.nextInt();
        while (true) {
            if (y >= N) {
                System.out.println("Nhap sai .Xin nhap lai");
                y = sc.nextInt();
            } else {
                break;
            }
        }
    }

    private static int[] Chuyendoi1(int[] array1) {
        
        for (int i = x+1; i <= y; i++){
               array1[i-1]=array1[i];
        } array1[y]=array1[x];
        return array1;
    }

    private static int[] Chuyendoi2(int[] array2) {
    
        for (int i = y; i < x; i++) {
         array2[i+1]=array2[i];
            } array2[y]=array2[x];
        
        return array2;
    }
}
////////// Em không tìm được thuật toán cho bài này