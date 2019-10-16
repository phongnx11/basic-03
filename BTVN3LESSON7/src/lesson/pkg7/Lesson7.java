/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson.pkg7;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Lesson7 {

    public static int n;
    public static int x, y;

    public static Scanner sc = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        n = inputN();
        intialize();
        while(true){
        show();
        String direction =getDirection();
        dcct(direction);
    }
    }

    public static int inputN() {
        System.out.println("Nhap hang cua ma tran: ");
        n = sc.nextInt();
        while (true) {
            if (0 >= n || n > 20) {
                System.out.println("N vuot qua gioi han ");
                n = sc.nextInt();
            } else {
                return n;
            }
        }

    }

    private static void intialize() {
        System.out.println("toa do x ban dau la ");
        x = sc.nextInt();
        while (true) {
            if (x <0 || x > n) {
                System.out.println("x qua gioi han . Nhap lai");
                x = sc.nextInt();
            } else {
                break;
            }

        }
        System.out.println("toa do y ban dau la ");
        y = sc.nextInt();
        while (true) {
            if (y < 0 || y > n) {
                System.out.println("x qua gioi han . Nhap lai");
                y = sc.nextInt();
            } else {
                break;
            }
        }

    }

    public static void show() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == y && j == x) {
                    System.out.print("*");
                } else {
                    System.out.print("-");
                }
            }
            System.out.println(" ");

        }
    }

    private static String getDirection() {
        String s = sc.next();
        while (true) {
            if (s.equalsIgnoreCase("UP")
                    || s.equalsIgnoreCase("DOWN")
                    || s.equalsIgnoreCase("LEFT")
                    || s.equalsIgnoreCase("RIGHT")
                    || s.equalsIgnoreCase("EXIT")) {
                return s;
            } else {
                System.out.println("Nhap sai huong di ");
                s = sc.next();
            }
        }
    }

    static String dcct(String move) {

        if (move.equalsIgnoreCase("up")) {
if(y==0){y=n-1;}else{y--;};
       
            
        }
        

        if (move.equalsIgnoreCase("down") ) {
          if(y==n-1){y=0;}else{y++;};
        }
              
        if (move.equalsIgnoreCase("left")) {
         if(x==0){x=n-1;}else{x--;};
        }
       
        if (move.equalsIgnoreCase("right")) {
         if(x==n-1){x=0;}else{x++;};
        }
       
        return move;
    }

}    

