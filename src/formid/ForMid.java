/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formid;

import java.util.Scanner;

public class ForMid {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int response;
       
        System.out.println("Hey ma, no hands!");
        System.out.println("Will billy fall? Enter 1 for yes, 2 for no");
        response = sc.nextInt();
        
        if(response == 1 )
        {
            System.out.println("Billy fell down and broke his hand");
        }
        else if(response == 2)
        {
            System.out.println("Billy manage to sussecfully perform his trick");
        }
        else
        {
            System.out.println("Incorrect input, Don't you know your 1's and 2s?");
        }
        
    }
    
}
