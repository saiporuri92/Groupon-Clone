/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package groupon;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Sairam
 */
    public class Item {
        private Seller seller;
        private String category;
        private String title;
        private String Description;
        private int price;
        private int nAvailable;
        private int keepAliveCount;

    public Item(Seller seller,String category, String title, String Description, int price, int nAvailable, int keepAliveCount) {
        this.seller=seller;
        this.category = category;
        this.title = title;
        this.Description = Description;
        this.price = price;
        this.nAvailable = nAvailable;
        this.keepAliveCount = keepAliveCount;
    }

    public Item() {
    }

//    public List<Item> itemList(Seller seller){
//        ArrayList<Item> items= new ArrayList<Item>();
//        items.add(new Item(seller,"","","",40,4,4));
//        return items;
//        
//    }
    public Seller getSeller() {
        return seller;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }    

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getnAvailable() {
        return nAvailable;
    }

    public void setnAvailable(int nAvailable) {
        this.nAvailable = nAvailable;
    }

    public int getKeepAliveCount() {
        return keepAliveCount;
    }

    public void setKeepAliveCount(int keepAliveCount) {
        this.keepAliveCount = keepAliveCount;
    }
        
        
       
}
