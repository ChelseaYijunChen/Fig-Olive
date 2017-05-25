/**
 * 
 */
package com.hibernate.service;

import java.util.List;

import com.hibernate.dao.ProductDao;
import com.hibernate.dao.ProductDaoImpl;
import com.hibernate.pojo.Product;

/**
 * @author: Yijun Chen
 * @date: Mar 4, 2017
 * @time: 7:04:00 PM
 */
public class ProductServiceImpl implements ProductService{

	@Override
	public int addProduct(Product product) {
		ProductDao cDao = new ProductDaoImpl();
		int i = cDao.addProduct(product);
		return i;
	}

	@Override
	public void updateProduct(Product product) {
		ProductDao cDao = new ProductDaoImpl();
		cDao.updateProduct(product);		
	}

	@Override
	public List<Product> viewAllProducts() {
		ProductDao cDao = new ProductDaoImpl();
		List<Product> pList = cDao.viewAllProducts();
		return pList;
	}

	@Override
	public Product viewProductById(int id) {
		ProductDao cDao = new ProductDaoImpl();
		Product product = cDao.viewProductById(id);
		return product;
	}


//	@Override
//	public List<Product> viewProductByCategory(String category) {
//		ProductDao cDao = new ProductDaoImpl();
//		List<Product> pList = cDao.viewProductByCategory(category);
//		return pList;
//	}
	
	@Override
	public List<Product> viewProductByCategoryId(int categoryId) {
		ProductDao cDao = new ProductDaoImpl();
		List<Product> pList = cDao.viewProductByCategoryId(categoryId);
		return pList;
	}

	@Override
	public void deleteProduct(Class Product, int id) {
		ProductDao cDao = new ProductDaoImpl();
		cDao.deleteProduct(Product.class, id);		
	}


	@Override
	public List<Product> viewAvailableProduct(int categoryId) {
		ProductDao cDao = new ProductDaoImpl();
		List<Product> pList = cDao.viewAvailableProduct(categoryId);
		return pList;
	}

}
