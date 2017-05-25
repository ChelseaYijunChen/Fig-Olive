/**
 * 
 */
package com.hibernate.service;

import java.util.List;

import com.hibernate.dao.CategoryDao;
import com.hibernate.dao.CategoryDaoImpl;
import com.hibernate.pojo.Category;

/**
 * @author: Yijun Chen
 * @date: Mar 12, 2017
 * @time: 9:47:12 PM
 */
public class CategoryServiceImpl implements CategoryService {
	@Override
	public int addCategory(Category c) {
		
		CategoryDao cDao = new CategoryDaoImpl();
		int i = cDao.addCategory(c);
		return i;
	}

	@Override
	public void deleteCategory(Class Category, int id) {
		CategoryDao cDao = new CategoryDaoImpl();
		cDao.deleteCategory(Category.class, id);
	}

	@Override
	public void updateCategory(Category c) {
		CategoryDao cDao = new CategoryDaoImpl();
		cDao.updateCategory(c);		
	}

	@Override
	public Category viewCategoryById(int id) {
		CategoryDao cDao = new CategoryDaoImpl();
		Category s = cDao.viewCategoryById(id);
		return s;
	}

	@Override
	public List<Category> viewAllCategorys() {
		CategoryDao cDao = new CategoryDaoImpl();
		List<Category> cList = cDao.viewAllCategorys();
		return cList;
	}

	@Override
	public Category viewCategoryByCategoryName(String name) {
		CategoryDao cDao = new CategoryDaoImpl();
		Category s = cDao.viewCategoryByCategoryName(name);
		return s;
	}



}
