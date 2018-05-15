/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package groupon;

import java.util.ArrayList;

/**
 *
 * @author Sairam
 */
public class Order {
    private static int orderNum=10000;
    private int order;
    private Seller seller;    
    private Customer customer;
    private Item item;
    
    private ArrayList<Order> o = new ArrayList<Order>();

    public Order(Seller seller, Customer customer, Item item) {
        this.order= orderNum +1;
        orderNum++;
        
        this.seller = seller;
        this.customer = customer;
        this.item = item;
        
        o.add(this);
    }

    public Order() {
    }

    public ArrayList<Order> getO() {
        return o;
    }

    public void setO(ArrayList<Order> o) {
        this.o = o;
    }

   
    
    public int createOrder(){
        return 1;
    }

    public static int getOrderNum() {
        return orderNum;
    }

    public static void setOrderNum(int orderNum) {
        Order.orderNum = orderNum;
    }

    public Seller getSeller() {
        return seller;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }
    
    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }
    
}
