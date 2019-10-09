/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson.pkg5;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Lesson5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pass = sc.nextLine();
        System.out.println("Mat Khau la " + pass);
        boolean check = validPass(pass);
        System.out.println(check);

        String ht = "Nguyen Xuan Phong";
        int mssv = 20193313;
        int indexOfSpace = ht.lastIndexOf(' ');
        String ten = ht.substring(indexOfSpace + 1);
        String viettatho = String.valueOf(ht.charAt(0));
        int two = ht.indexOf(' ');
        String viettatdem = String.valueOf(ht.charAt(two + 1));
        String mssvrg = String.valueOf(mssv % 1000000);
        String emailsv = ten + "." + viettatho + viettatdem + mssvrg + "@sis.hust.edu.vn";
        System.out.println(emailsv.toLowerCase());

    }

    public static boolean validPass(String pass) {
        char[] kt = pass.toCharArray();
        for (int i = 0; i < kt.length; i++) {
            char c = pass.charAt(i);

            if (('a' <= c && c <= 'z')
                    && ('A' <= c && c <= 'Z')
                    && ('0' <= c && c <= '9')) {
                System.out.println("Mat Khau Du Manh");
                return true;
            } else {
                System.out.println("mat khau chua du manh");
            }
            return false;

        }
        return true;
    }
}
