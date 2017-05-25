/**
 * 
 */
package com.hibernate.service;

import java.util.List;

import com.hibernate.pojo.Category;

/**
 * @author: Yijun Chen
 * @date: Mar 12, 2017
 * @time: 9:46:56 PM
 */
public interface CategoryService {
	public int addCategory(Category c);
	public void deleteCategory(Class Category, int id);
	public void updateCategory(Category c);
	public Category viewCategoryById(int id);
	public Category viewCategoryByCategoryName(String name);
	public List<Category> viewAllCategorys();
}
