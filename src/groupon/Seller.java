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
public class Seller {
    private String sellerID;
    private String sellerName;

    public Seller(String sellerID, String sellerName) {
        this.sellerID = sellerID;
        this.sellerName = sellerName;
    }
    public Seller(){
        
    }

    public String getSellerID() {
        return sellerID;
    }

    public void setSellerID(String sellerID) {
        this.sellerID = sellerID;
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }
    
    
    
    public void sell(){
        
    }
    
    public void listOut(){
        
//            Item i= new Item();
//            List<Item> items = i.itemList(this);
//                List<Item> itemList = new ArrayList<Item>();
//                itemList.add(new Item(this,"product","textbook","isam 5338",40,4,2));
//                itemList.add(new Item(this,"product","pen","Camel pens",40,4,2));
//                itemList.add(new Item(this,"product","broom","awesome brooms",40,4,2));
//                itemList.add(new Item(this,"service","dorm clean","we clean great",40,4,2));
//                itemList.add(new Item(this,"service","lunch","lunch dellivery at your time",40,4,2));
//                itemList.add(new Item(this,"service","massage","thai massage",40,4,2));                
                
                System.out.println("these are our services");
                OnlineAccount o = new OnlineAccount();
                for(Item item:o.itemList){
                    System.out.println(item.getTitle()+" "+item.getPrice());
                }
            
    }
}
