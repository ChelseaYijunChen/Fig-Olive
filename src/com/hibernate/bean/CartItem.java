/**
 * 
 */
package com.hibernate.bean;

import java.io.Serializable;
import java.text.NumberFormat;

import com.hibernate.pojo.Product;

/**
 * @author: Yijun Chen
 * @date: Mar 4, 2017
 * @time: 9:54:38 PM
 */
public class CartItem implements Serializable{
    private Product product;
    private int quantity;
    
    public CartItem() {}
    
    public void setProduct(Product p)
    {
        product = p;
    }

    public Product getProduct()
    { 
        return product;
    }

    public void setQuantity(int quantity)
    {
        this.quantity = quantity;
    }
    
    public int getQuantity()
    { 
        return quantity; 
    }
    
    public double getTotal()
    { 
        double total = product.getProductPrice() * quantity;
        return total;
    }
    
    public String getTotalCurrencyFormat()
    {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        return currency.format(this.getTotal());
    }
    
    public String toString(){
    	return this.product.getProductId() +" " + this.quantity;
    }
}
