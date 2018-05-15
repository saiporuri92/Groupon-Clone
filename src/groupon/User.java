/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package groupon;

/**
 *
 * @author Sairam
 */
public class User {
    private String id;
    private String password;
    private String name;
    private boolean isSeller;

    public User(String id, String password,String name,boolean isSeller) {
        this.id = id;
        this.password = password;
        this.name= name;
        this.isSeller=isSeller;
    }
    public User(){
        
    }
    
   

    public boolean isIsSeller() {
        return isSeller;
    }

    public void setIsSeller(boolean isSeller) {
        this.isSeller = isSeller;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
    
}
