/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btvn2lesson8;

/**
 *
 * @author admin
 */
public class TestPoint {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Point v1=new Point();
        Point v2=new Point();
        Point v3=new Point();
        Point v4=new Point();
        v1.input();
        int x=v2.hoanh;
        int y=v2.tung;
        int z=v2.cao;
        v2.input(x, y, z);
        v3.hienthi();
    }
    
}
class Point {
int hoanh ;
int tung ;
int cao;
void input(){
    hoanh =1;
    cao =2;
    tung =3;
    System.out.println("hoanh do la " +hoanh);
    System.out.println("tung do là  " +tung );
    System.out.println("cao độ là   "+cao);
}
void input(int x,int y,int z){
    x=hoanh;
    y=tung ;
    z=cao;
    System.out.println("hoanh do la " +hoanh);
    System.out.println("tung do là  " +tung );
    System.out.println("cao độ là   "+cao);
}
void hienthi(){
    System.out.println("tọa độ điẻm cần tìm là : " +"(" +hoanh+","+tung +","+cao+")");
}
}