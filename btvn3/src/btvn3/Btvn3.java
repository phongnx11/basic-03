/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btvn3;
import java.util.Scaner;


/**
 * @author admin
 */
public class Btvn3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   
   int K ;
   K = sc.nextInt();
        System.out.println("so k vua nhap la "+ K);
   int cout = 0;
   for(int a = 1;a < K;a++){
       if(K%a==0){cout++;}
   if(cout==2){
       System.out.println("cac so nguyen to la " + a + ";");}
   }
   
   
    }
    
}
