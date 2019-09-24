/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitapvenha2;

/**
 *
 * @author admin
 */
public class Baitapvenha2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float a=5;
        float b=6;
        float c=7;
        if(a==0)
        {
            if (b==0)
            {
                if(c==0){
                    System.out.println("phuongtrinhvosonghiem");}
                else System.out.println("ptvonghiem");}
            else System.out.println("ptco mot nghiem la"+(-c/b));}
        else { float d= (b*b)-4*a*c ;
        double x;
        double y;
        if(d<0){
            System.out.println("phuong trinh vo nghiem");}
            else if(d==0){
                    System.out.println("phuongtrinhco1nghiemla"+(-b/(2*a)));}
            else {
                x=(-b+Math.sqrt(d))/(2*a);
                y=(-b-Math.sqrt(d))/(2*a);
                System.out.println("phuongtrinhconghiemla"+x);
                System.out.println("phuongtrinhconghiemla"+y);}
                
                
                }
            }
        }          
        
    
    

