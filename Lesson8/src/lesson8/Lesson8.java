/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson8;

/**
 *
 * @author admin
 */
public class Lesson8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Phanso p1 = new Phanso();
        Phanso p2 = new Phanso();
        p1.tuso = 1;
        p1.mauso = 2;
        p2.tuso = 3;
        p2.mauso = 4;
        Phanso kq = new Phanso();
        int mschung = p1.mauso * p2.mauso;
        int tschung = (p1.tuso * p2.mauso + p1.mauso * p2.tuso);
        kq.tuso=tschung;
        kq.mauso=mschung;
        System.out.println("ket qua la " + kq.tuso + "//" + kq.mauso);

    }
    

}

class Phanso {

    //construction
    int tuso;
    int mauso;

    Phanso() {
        tuso = 2;
        mauso = 3;
    }

    Phanso(int input1, int input2) {
        tuso = input1;
        mauso = input2;
    
}
}
