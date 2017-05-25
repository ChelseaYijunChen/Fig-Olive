/**
 * 
 */
package com.hibernate.dao;

import java.util.List;

import com.hibernate.pojo.Product;

/**
 * @author: Yijun Chen
 * @date: Mar 4, 2017
 * @time: 6:52:54 PM
 */
public interface ProductDao {
	public int addProduct(Product product);
	public void updateProduct(Product product);
	public void deleteProduct(Class Product,int id);
	public List<Product> viewAllProducts();
	public Product viewProductById(int id);
//	public List<Product> viewProductByCategory(String category);
	public List<Product> viewProductByCategoryId(int categoryId);
	public List<Product> viewAvailableProduct(int categoryId);
}
