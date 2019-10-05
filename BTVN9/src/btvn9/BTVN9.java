/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btvn9;

/**
 *
 * @author admin
 */
public class BTVN9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 2, 1};
        boolean check = checkHamDx(a);
        System.out.println(check);
        int b = 11;
        boolean check2 = checkSoNguyenTo(b);
        char[] c = {'h', 'g', 'j', 'u', 'r'};
        char sapxep = mangKiTu(c);
        System.out.println(sapxep);
        int d[] = {2, 4, 5, 7, 8, 9};
        int check3 = mangTuNhien(d);
        System.out.println(check3);
        String[] x={"xuan"};
        String[] y={"phong"};
        System.out.println(mangSoSanh(x,y));
    }

    public static boolean checkHamDx(int[] a) {
        for (int i = 0; i < (a.length / 2); i++) {
            if (a[i] == a[a.length - i]) {
                return true;
            }
        }
        return false;
    }

    public static boolean checkSoNguyenTo(int b) {
        int count = 0;
        for (int i = 1; i <= b; i++) {
            if (b % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            return true;
        } else {
            return false;
        }
    }

    public static char mangKiTu(char c[]) {
        for (int i = 0; i < c.length - 1; i++) {
            for (int j = 1; j < c.length; j = i + 1) {
                char mid;
                if (c[i] - (c[j]) > 0) {
                    mid = c[i];
                    c[i] = c[j];
                    c[j] = mid;
                }
            }
        }
        for (int i = 0; i < c.length; i++) {
            System.out.println(c[i]);
        }
        return mangKiTu(c);
    }

    public static int mangTuNhien(int[] d) {
        for (int i = 0; i < d.length; i++) {
            if (d[i] >= d[i + 1]) {
                return 1;
            } else if (d[i] <= d[i + 1]) {
                return -1;
            } else {
                return 0;
            }

        }
        return mangTuNhien(d);
    }
    // Bonus

    public static String[] mangSoSanh(String[] x, String[] y) {
        String[] p = mangSoSanh(x, y);
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < y.length; j++) {
                if (x[i] == y[j] && x.length == y.length) {
                    return p;
                }
            }

        }
        String[] q = mangSoSanh(x, y);
        if (x[0].compareTo(y[0]) > 0) {
            return q;

        }
        String[] r = mangSoSanh(x, y);
        if (x[0].compareTo(y[0]) < 0) {
            return r;
        }

        return mangSoSanh(x, y);
    }
}
