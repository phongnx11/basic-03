/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt4;
import java.util.Scanner;



/**
 *
 * @author admin
 */
public class Bt4 {

   
    
    /**
     * @param args the command line arguments
     */
   
    public static void main(String[] args) {
int a , t , n=100 ;
Scanner sc = new Scanner(System.in);
int A[]= new int[n];
do { System.out.println(" Nhap so cac so tu nhien " );
a = sc.nextInt();
}
while (a<= 2||a > n -1);
        System.out.println("nhap cac phan tu cua day");
        
        for (int i=0; i < a; i++){
            System.out.println("A["+i+"]");
            A[i]=sc.nextInt();}
        System.out.println("day ban dau la");
        for (int i = 0; i < a; i++) {
            System.out.println(A[i]+"\t");}
        for (int i =0 ;i < a-1; i ++){
            for(int j=i+1;j<=a-1;j++) {
            if(A[j]<A[i]){
                t = A[i];
                A[i]=A[j];
                A[j]=t;
            }}}
        System.out.println("day so sau khi sap xep la");
        for (int i = 0; i < a; i++) {
            System.out.print(A[i]+ "\t");}
            
        }
                
            
                
            }
            
            
            
            
        
        
            

    
    
    
    
        


        
     
    
        
        
        
     
        
    }
    
}
