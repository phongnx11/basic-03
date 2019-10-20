/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btvnlesson8;

/**
 *
 * @author admin
 */
public class TestComplex {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Complex p1 =new Complex();
      Complex p2 = new Complex();
      Complex p3 = new Complex();
      Complex p4 = new Complex();
      Complex p5 = new Complex();
      Complex p6 = new Complex();
      p1.inputC();
      p1.im=1;
      p1.re=1;
      p2.inputC(2);
      p2.im=6;
      p3.inputC(4, 7);
      p4.cong(1, 2, 3, 4);
      p5.chia(5, 6, 7, 8);
      p6.hienthiC();
      p6.im=5;
      p6.re=5;
    }

}

class Complex {

  int re;
     int im;

    void inputC() {
        re = 1;
        im = 2;
    }

    void inputC(int phanthuc) {
        re = phanthuc;
        im = 3;
    }

    void inputC(int phanthuc, int phanao) {
        re = phanthuc;
        im = phanao;
    }
    void cong(int re1,int im1,int re2,int im2){
       re=re1+re2;
       im=im1+im2;
        System.out.println("tong la");
         System.out.println(re+"+"+(im+"i"));
    }
    void tru(int re1,int im1,int re2,int im2 ){
        re=re1-re2;
        im=im1-im2;
        System.out.println("hieu la");
          System.out.println(re+"+"+(im+"i"));
    }
    void nhan(int re1,int im1,int re2,int im2){
        re=re1*re2-im1*im2;
        im=re1*im2+re2*im1;
        System.out.println("Tich la");
          System.out.println(re+"+"+(im+"i"));
    }
    void chia(int re1,int im1,int re2,int im2){
        re=(re1*re2+im1*im2)/(re2^2+im2^2);
         im=(im1*re2-im2*re1)/(re2^2+im2^2);
         System.out.println("Thuong la ");
           System.out.println(re+"+"+(im+"i"));
    }
    void hienthiC(){
        System.out.println("So phuc z la : ");
        System.out.println(re+"+"+(im+"i"));
    }
}
