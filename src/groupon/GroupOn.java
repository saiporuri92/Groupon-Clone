/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package groupon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Sairam
 */
public class GroupOn {

    /**
     * @param args the command line arguments
     */
    
    public static ArrayList<User> allUsers;
       
    public static void main(String[] args) {
        // TODO code application logic here
                
        
        Scanner input = new Scanner(System.in);        
        System.out.println("select an option");
        System.out.println("enter 1 to register");
        System.out.println("enter 2 to login");
        
        switch(input.next()){
            case "1":
                OnlineAccount.register();
            case "2":
                OnlineAccount.login();
        }
        
    }
    
}
