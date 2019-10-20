/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hinhchunhat;

/**
 *
 * @author admin
 */
public class Hinhchunhat {



    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        inputDC d = new  inputDC();
        inputDC r = new inputDC();
        d.hienThi();
        r.hienThi();
        inputDC C=new inputDC();
        C.tinhChuVi(); void hienThi(){
        System.out.println("chieu dai hinh chu nhat la " + dai );
        System.out.println("chieu rong hinh chu nhat la " + rong );
    }
    void tinhChuVi(){
        System.out.println("chu vi hinh chu nhat la " + chuvi);
    }
    void tinhDienTinh(){
        System.out.println("dien tich hinh chu nhat la " + dientich);
    }
    
    }
    


   
}
class inputDC {
    int dai;
    int rong;
    inputDC(){
        dai=7;
        rong=8;
    }
    inputDC(int inputd , int inputr){
        dai = inputd;
        rong = inputr;
    }
     void hienThi(){
        System.out.println("chieu dai hinh chu nhat la " + dai );
        System.out.println("chieu rong hinh chu nhat la " + rong );
    }
    void tinhChuVi(){
        int chuvi=(dai+rong)*2;
        System.out.println("chu vi hinh chu nhat la " + chuvi);
    }
    void tinhDienTinh(){
       int dientich=dai*rong;
        System.out.println("dien tich hinh chu nhat la " + dientich);
    }
    
}