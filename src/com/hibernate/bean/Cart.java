/**
 * 
 */
package com.hibernate.bean;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * @author: Yijun Chen
 * @date: Mar 4, 2017
 * @time: 9:51:30 PM
 */
public class Cart implements Serializable {
	
	private ArrayList<CartItem> items;
    
    public Cart()
    {
        items = new ArrayList<CartItem>();
    }
    
    public ArrayList<CartItem> getItems()
    { 
        return items;
    }
    
    public int getCount()
    { 
        return items.size();
    }
    
    public void addItem(CartItem item)
    {
        int code = item.getProduct().getProductId();
        int quantity = item.getQuantity();
        for (int i = 0; i < items.size(); i++)
        {
            CartItem cartItem = items.get(i);
            if (cartItem.getProduct().getProductId() == code)
            {
                cartItem.setQuantity(quantity);
                return;
            }
        }
        items.add(item);
    }
    
    public void removeItem(CartItem item)
    {
        int code = item.getProduct().getProductId();
        for (int i = 0; i < items.size(); i++)
        {
            CartItem lineItem = items.get(i);
            if (lineItem.getProduct().getProductId() == code)
            {
                items.remove(i);
                return;
            }
        }
    }
    
    public String toString(){
    	return this.items.get(0)+" ";
    }
}
