/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package check.pass;
import java.util.Scanner;
/**
 *
 * @author admin
 */
public class CheckPass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean valid;
        Scanner sc = new Scanner(System.in);
          System.out.print("Nhap mat khau  ");
          String  password = sc.nextLine(); 

             
            if (password.length()<8) 
                {
                    valid = false;
                    System.out.println("Chua du ky tu ");
                }

            
            for (int i = 0; i < password.length(); i++){
                        char c = password.charAt(i);

                        if (       ('a' <= c && c <= 'z') 
                                && ('A' <= c && c <= 'Z') 
                                && ('0' <= c && c <= '9') 
                        ) 
                        {
                            System.out.println("mat khau du manh");
                            valid = true;
                        } 

                        else 
                        {
                            System.out.println("matkhau chua du manh");
                           
                            valid = false;
                            
                        }

            }

            
            
            }


    }

    
    

