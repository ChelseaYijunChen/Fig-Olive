/**
 * 
 */
package com.hibernate.dao;

import java.util.List;

import com.hibernate.pojo.Product;
import com.hibernate.util.HibernateTemplate;

/**
 * @author: Yijun Chen
 * @date: Mar 4, 2017
 * @time: 6:53:06 PM
 */
public class ProductDaoImpl implements ProductDao{

	@Override
	public int addProduct(Product Product) {
		Integer i = (Integer)HibernateTemplate.save(Product);
		return i;
	}

	@Override
	public void updateProduct(Product Product) {
		HibernateTemplate.update(Product);	
	}

	@Override
	public List<Product> viewAllProducts() {
		List<Product> cList = (List<Product>)HibernateTemplate.find("From Product");	
		return cList;
	}

	@Override
	public Product viewProductById(int id) {
		List<Product> pList = (List<Product>)HibernateTemplate.find("From Product where productId= '"+id+"' ");	
		if(pList == null || pList.size() == 0){
			return null;
		} else{
			return pList.get(0);
		}
		
	}

//	@Override
//	public List<Product> viewProductByCategory(String category) {
//		List<Product> pList = (List<Product>)HibernateTemplate.find("From Product where category= '"+category+"' ");	
//		return pList;
//	}
	
	@Override
	public List<Product> viewProductByCategoryId(int categoryId) {
		List<Product> pList = (List<Product>)HibernateTemplate.find("From Product where categoryId= '"+categoryId+"' ");	
		return pList;
	}

	@Override
	public void deleteProduct(Class Route, int id) {
		HibernateTemplate.delete(Route, id);
	}

	@Override
	public List<Product> viewAvailableProduct(int categoryId) {
		List<Product> pList = (List<Product>)HibernateTemplate.find("From Product where isAvailable= '"+true+"' and categoryId= '"+categoryId +"' ");	
		return pList;
	}
}
