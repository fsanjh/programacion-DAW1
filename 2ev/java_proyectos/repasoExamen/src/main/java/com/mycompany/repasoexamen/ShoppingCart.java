package com.mycompany.repasoexamen;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author fsanj
 */
public class ShoppingCart{
    private ArrayList<Product> items;

    public ShoppingCart(){
        items = new ArrayList<Product>();
    }
    
    public double getBalance(){
        Iterator<Product> i = items.iterator();
        double balance = 0;
        while(i.hasNext()){
            Product p = ((Product)i.next());
            balance = balance + p.getPrecio();
        }
        return balance;
    }
    
    public void addItem(Product p){
        items.add(p);
    }
    
    public void removeItem(Product p) throws ProductNotFoundException{
        if(!items.remove(p)){
            throw new ProductNotFoundException();
        }
    
    }
    
    public int getItemCount(){
        return items.size();
    }
    
    public void empty(){
        items = new ArrayList<Product>();
    }
    
    public boolean isEmpty(){
        return (items.size() == 0);
    }
    
    public class ProductNotFoundException extends Exception{
        public ProductNotFoundException() {
            super();
        }
    }
    
    
}
