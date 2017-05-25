/**
 * 
 */
package com.hibernate.dao;

import java.util.List;

import com.hibernate.pojo.Category;
import com.hibernate.util.HibernateTemplate;

/**
 * @author: Yijun Chen
 * @date: Mar 12, 2017
 * @time: 9:45:12 PM
 */
public class CategoryDaoImpl implements CategoryDao{
	@Override
	public int addCategory(Category c) {
		Integer i = (Integer)HibernateTemplate.save(c);
		return i;
	}

	@Override
	public void deleteCategory( Class cus, int id) {
		HibernateTemplate.delete(Category.class, id);	
	}

	@Override
	public void updateCategory(Category c) {
		HibernateTemplate.update(c);
	}

	@Override
	public Category viewCategoryById(int id) {
		List<Category> c = (List<Category>)HibernateTemplate.find("From Category where categoryId= '"+id+"' ");	
		if(c==null || c.size()==0){
			return null;
		} else {
			return c.get(0);
		}
	}

	@Override
	public List<Category> viewAllCategorys() {
		List<Category> cList = (List<Category>)HibernateTemplate.find("From Category");	
		return cList;
	}

	@Override
	public Category viewCategoryByCategoryName(String name) {
		List<Category> c = (List<Category>)HibernateTemplate.find("From Category where categoryName= '"+name+"' ");	
		if(c == null || c.size()==0){
			return null;
		}else {
			return c.get(0);
		}
	}
}
