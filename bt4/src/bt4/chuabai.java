/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt4;

/**
 *
 * @author admin
 */
public class chuabai {
    public static void main(String[] args) {
        long  x=11181511;
        long y = 1234588567;
        long ketqua = x*y;
        long d=0;
        while (y>0){
            
            long r = y%10;
            y=y/10;
            // systeem out printl
            long  multi=r*x;
            String space="";
            for (int i = 0; i < d; i++) {
                space = space + "-";
            }
            d++;
            System.out.printf("%30s/n",multi+space);
            System.out.println("--------------------------------");
            System.out.printf("%30s/n",ketqua);
                
            }
        }
    }

