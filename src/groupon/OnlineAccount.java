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
public class OnlineAccount {
    public List<Item> itemList; 
    public static void login(){
        Scanner input = new Scanner(System.in);
        System.out.println("please enter your login id");
        String id = input.next();
        int count=0;
        for(User user:GroupOn.allUsers){
            if(user.getId().equals(id)){
                count++;
            }
        }
        if(count==1){
        System.out.println("now the password");
        String pass = input.next();
            for(User user:GroupOn.allUsers){
                if(user.getId().equals(id)&&user.getPassword().equals(pass)){
                    System.out.println("yayyyy!!!you are logged in.");    
                    
                    if(user.isIsSeller()==true){
                        List<Item> itemList = new ArrayList<Item>();
                        itemList.add(new Item(new Seller(user.getId(),user.getName()),"product","textbook","isam 5338",40,4,2));
                        itemList.add(new Item(new Seller(user.getId(),user.getName()),"product","pen","Camel pens",40,4,2));
                        itemList.add(new Item(new Seller(user.getId(),user.getName()),"product","broom","awesome brooms",40,4,2));
                        itemList.add(new Item(new Seller(user.getId(),user.getName()),"service","dorm clean","we clean great",40,4,2));
                        itemList.add(new Item(new Seller(user.getId(),user.getName()),"service","lunch","lunch dellivery at your time",40,4,2));
                        itemList.add(new Item(new Seller(user.getId(),user.getName()),"service","massage","thai massage",40,4,2));
                        
                        System.out.print("here are your options");
                        System.out.print("1:enter 1 for listing your objects");
                        System.out.println("2:enter 2 for adding an item");
                        System.out.println("3:select 3 for deleting an object");
                        System.out.print("4:enter 4 to check the status of any object");
                        String opt = input.next();
                        
                        Seller s = new Seller(user.getId(),user.getName());
                        Item item = new Item();
                        switch(opt){
                            case "1":
                                s.listOut();
//                              item.itemList(s);
                            case "2":
                                //add an item
                            case "3":
                                //deleting an bject
                            case "4":
                                //check the status                               
                        }
                    }
                    else{
                        //all the customer functions
                         System.out.print("here are your options");
                        System.out.print("1:select a category");
                        System.out.println("2:search an item");
                        System.out.println("3:view your orders");
                        System.out.print("4:purchase an item");
                        
                        Customer c = new Customer(user.getId(),user.getName());
                        String o = input.next();
                         switch(o){
                            case "1":
                                
//                              item.itemList(s);
                            case "2":
                                //add an item
                            case "3":
                                c.checkOrders();
                            case "4":
                                c.buy();
                        }
                    }
                    break;
                }
            }
        }
        else{
            System.out.println("you are not registered.please go and register");
        }

        
    }
    
    public static void register(){
        User newUser = new User();
        
        Scanner input = new Scanner(System.in);
        System.out.print("thanks for choosing us");
        
        System.out.print("please enter your name");
        String name= input.next();
        newUser.setName(name);
        
        System.out.println("please enter 0 if you are a customer or enter 1 if you are a seller;");
        int isSeller = input.nextInt();
        if(isSeller==1){
            newUser.setIsSeller(true);
        }
        else{
            newUser.setIsSeller(false);
        }
        
        
        System.out.println("please enter an id for yourselves");
        String id = input.next();
        while(GroupOn.allUsers.contains(id)){
            System.out.print("already exists.please try an other one");
            id=input.next();
        }
        newUser.setId(id);
        
        
        
        System.out.print("now,enter a password");
        String pass = input.next();
        newUser.setPassword(pass);
        
        GroupOn.allUsers.add(newUser); 
        System.out.println("Do you want to login??select 1 for yes.0 fo no");
        if(input.next()=="1"){
            login();
        }
        else{
            ;
        }
    }
    
}
