/**
 * 
 */
package com.hibernate.service;

import java.util.List;

import com.hibernate.pojo.Product;

/**
 * @author: Yijun Chen
 * @date: Mar 4, 2017
 * @time: 7:03:36 PM
 */
public interface ProductService {
	public int addProduct(Product Product);
	public void deleteProduct(Class Product,int id);
	public void updateProduct(Product Product);
	public List<Product> viewAllProducts();
	public Product viewProductById(int id);
//	public List<Product> viewProductByCategory(String category);
	public List<Product> viewProductByCategoryId(int categoryId);
	public List<Product> viewAvailableProduct(int categoryId);
}
