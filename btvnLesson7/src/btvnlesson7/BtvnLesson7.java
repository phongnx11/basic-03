/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btvnlesson7;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class BtvnLesson7 {

    public static Scanner sc = new Scanner(System.in);
    public static int h, m, s;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Wtime();
        System.out.println("Now :" + h + "h" + m + "m" + s + "s");
        Rtime();
        A1000();
    }

    public static void Wtime() {
        System.out.println("Nhap so gio ");
        h = sc.nextInt();
        while (true) {
            if (0 > h || h >= 24) {
                System.out.println("Nhap sai . Xin nhap lai ");
                h = sc.nextInt();
            } else {
                break;
            }
        }
        System.out.println("Nhap so phut ");
        m = sc.nextInt();
        while (true) {
            if (0 > m || m >= 60) {
                System.out.println("Nhap sai . Xin nhap lai ");
                m = sc.nextInt();
            } else {
                break;
            }
        }
        System.out.println("Nhap so giay ");
        s = sc.nextInt();
        while (true) {
            if (0 > s || s >= 60) {
                System.out.println("Nhap sai . Xin nhap lai ");
                s = sc.nextInt();
            } else {
                break;
            }

        }
    }

    public static void Rtime() {
        int s1 =s+40;
        int m1=m+16;
        if (s != 59) {
            s = s + 1;
            System.out.println("thoi gian 1 giay sau la  " + h + "h" + m + "m" + s + "s");
        }
        if (s == 59 && m != 59) {
            s = 0;
            m = m + 1;
            System.out.println("thoi gian 1 giay sau la  " + h + "h" + m + "m" + s + "s");
        }
        if (s == 59 && m == 59 && h != 23) {
            s = 0;
            m = 0;
            h = h + 1;
            System.out.println("thoi gian 1 giay sau la  " + h + "h" + m + "m" + s + "s");
        }
         if(s==59&&m==59&&h==23){  
            System.out.println("thoi gian 1 giay sau la  " + h + "h" + m + "m" + s + "s" + "   tomorrow");
        }
    }

    private static void A1000() {
        int sb = 60-s;
        int st =40-sb;
        int mb =60-m;
        int mt =16-mb;
if ( st<0 && mt<0 ){
    s=s+40;
    m=m+16;
     System.out.println("thoi gian 1000 giay sau la  " + h + "h" + m + "m" + s + "s");
}
if(st>=0 && mt<0){
    s=st;
    m=m+17;
     System.out.println("thoi gian 1000 giay sau la  " + h + "h" + m + "m" + s + "s");
}
if(st<0 && mt>=0&&h!=23){
    s=s+40;
    m=mt;
    h=h+1;
     System.out.println("thoi gian 1000 giay sau la  " + h + "h" + m + "m" + s + "s");
}
if( st>=0 && mt >=0 && h!=23 ){
    s=st;
    m=mt+1;
    h=h+1;
     System.out.println("thoi gian 1000 giay sau la  " + h + "h" + m + "m" + s + "s");
}
if(st<0 && mt>=0&&h==23){
    s=s+39;
    m=mt;
    h=0;
     System.out.println("thoi gian 1000 giay sau la  " + h + "h" + m + "m" + s + "s");
}
if( st>=0 && mt >=0 && h==23 ){
    s=st;
    m=mt+1;
    h=0;
     System.out.println("thoi gian 1000 giay sau la  " + h + "h" + m + "m" + s + "s");
}
    }
}
