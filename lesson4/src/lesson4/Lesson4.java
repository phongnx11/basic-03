/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson4;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Lesson4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = 10;
        float[] array = new float[length];

        System.out.println("truoc khi sap xep : ");
        for (int i = 0; i < length; i++) {
            System.out.println(array);
        }
        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length; j++) {
                if (array[i] > array[j]) {
                    float temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }

            }
        }
        String[] DSHT = {
            "A",
            "B",
            "F",
            "D",
            "C",};
        int[] diem = {4, 5, 3, 9, 8};
        for (int i = 0; i < DSHT.length; i++) {
            for (int j = 0; j < diem.length; j++) {
                if (DSHT[i].compareTo(DSHT[j])<0 ){
                    int temp = diem[i];
                    diem[i] = diem[j];
                    diem[j] = temp;
                    String t = DSHT[i];
                    DSHT[i] = DSHT[j];
                    DSHT[j] = t;
                }
                

            }

        }
        System.out.println("DSHT theo diem la ");
        for (int i = 0; i < diem.length; i++) {
            System.out.println(  DSHT[i]+"\t" + diem[i]);
            
            
        }

    }
}
