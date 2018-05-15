/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package groupon;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Sairam
 */
public class Customer {

    private String id;
    private String name;
    private ArrayList<String> itemsBought;
    public static int aliveCount;
    
     public Customer(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public void buy() {
        Scanner input = new Scanner(System.in);
        OnlineAccount o = new OnlineAccount();
        System.out.print("what are you looking for??enter 0 for products and enter 1 for any services");
        if (input.next().equals("0")) {
            for (Item i : o.itemList) {
                if (i.getCategory().equals("product")) {
                    System.out.println("item name:" + i.getTitle() + "  description:" + i.getDescription() + "  availability:" + i.getnAvailable() + "  minimum customers:" + i.getKeepAliveCount());
                }
            }
            System.out.print("select an item from the above list giving the item name");

            String title = input.next();
            for (Item i : o.itemList) {
                if (i.getTitle().equals(title)) {
                    i.setKeepAliveCount(i.getKeepAliveCount() - 1);
                    if (i.getnAvailable() > 0) {

                        if (!itemsBought.contains(i.getTitle())) {

                            if (i.getKeepAliveCount() == 0) {
                                itemsBought.add(i.getTitle());
                                i.setnAvailable(i.getnAvailable() - 1);
                                
                                Order order = new Order(i.getSeller(),new Customer(id,name),i);
                                System.out.printf("your order number is %d:",order.getOrder());                                                                                  
                            } else {
                                //order pending

                            }
                        } else {
                            System.out.println("no more than one prodiuct for one");
                        }
                    } else {
                        System.out.println("sorry.no more left.");
                    }
                }
            }
        } else {

            for (Item i : o.itemList) {
                if (i.getCategory().equals("service")) {
                    System.out.println("service name:" + i.getTitle() + "  description:" + i.getDescription() + "  availability:" + i.getnAvailable() + "  minimum customers:" + i.getKeepAliveCount());
                }
            }
            System.out.print("select a service from the above list giving the item name");

            String title = input.next();
            for (Item i : o.itemList) {
                if (i.getTitle().equals(title)) {
                    i.setKeepAliveCount(i.getKeepAliveCount() - 1);
                    if (i.getnAvailable() > 0) {

                        if (!itemsBought.contains(i.getTitle())) {

                            if (i.getKeepAliveCount() == 0) {
                                //order success
                                itemsBought.add(i.getTitle());
                                i.setnAvailable(i.getnAvailable() - 1);
                                Order order = new Order(i.getSeller(),new Customer(id,name),i);
                                System.out.printf("your order number is %d:",order.getOrder());
                                //order delivered
                            } else {
                                //order pending

                            }
                        } else {
                            System.out.println("no more than one service for one");
                        }
                    } else {
                        System.out.println("sorry.no more left.");
                    }
                }
            }

        }
    }

    public void Search() {

    }

    public void checkOrders() {
        Order o = new Order();
        for(Order or:o.getO()){
            System.out.println(or.getItem()+" "+or.getSeller());
        }

    }

   

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
