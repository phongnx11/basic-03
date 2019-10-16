/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uguiyg;
import java.util.Scanner;
/**
 *
 * @author admin
 */
public class Uguiyg {
  public static int x, y;
    public static int n;
    public static Scanner sc = new Scanner(System.in);

  

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
           n = inputN();
        intialize();

        while (true) {
            show();
            String direction = getDirection();
            move(direction);
        }
    }

    public static int inputN() {

        System.out.println("Nhap vao N: ");
        int bien = sc.nextInt();
        while (true) { // kiem tra N
            if (bien < 1 || bien > 20) {
                System.out.println("N qua gioi han! Nhap lai: ");
                bien = sc.nextInt();
            } else {
                return bien;
            }
        }
    }

    public static void intialize() {

        System.out.println("Toa do x ban dau: ");
        x = sc.nextInt();
        while (true) { // kiem tra x
            if (x < 0 || x > n) {
                System.out.println("X qua gioi han! Nhap lai: ");
                x = sc.nextInt();
            } else {
                break;
            }
        }
        System.out.println("Nhap toa do Y ban dau: ");

        y = sc.nextInt();
        while (true) { // kiem tra x
            if (y < 0 || y > n) {
                System.out.println("Y qua gioi han! Nhap lai: ");
                y = sc.nextInt();
            } else {
                break;
            }
        }

    }

    private static void show() {
        for (int i = 0; i < n; i++) {       // tuong duong voi Oy
            for (int j = 0; j < n; j++) {   // tuong duong voi Ox
                if (i == y && j == x) {
                    // a[i][j]
                    System.out.print("* ");
                } else {
                    System.out.print("- ");
                }
            }
            System.out.println("");
        }
    }

    private static String getDirection() {
        String s = sc.next();// 
        while (true) {
            if (s.equalsIgnoreCase("UP")
                    || s.equalsIgnoreCase("DOWN")
                    || s.equalsIgnoreCase("LEFT")
                    || s.equalsIgnoreCase("RIGHT")
                    || s.equalsIgnoreCase("EXIT")) {
                return s;
            } else {
                System.out.println("Nhap sai huong di");
                s = sc.next();
            }
        }
    }

    public static void move(String direction) {
        switch (direction.toUpperCase()) {
            case "UP":
                y = (y - 1 );
                break;
            case "DOWN":
                y = (y + 1) % n;
                break;
            case "LEFT":
                x = (x - 1 + n) % n;
                break;
            case "RIGHT":
                x = (x + 1) % n;
                break;
            case "EXIT":
                System.out.println("DUNG CHUONG TRINH");
                System.exit(0);
        }
    }

}
    
    

