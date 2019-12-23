package com.ustglobal.stockmanagement.dao;

import java.util.List;

import com.ustglobal.stockmanagement.dto.ProductResponse;
import com.ustglobal.stockmanagement.dto.Products;

public interface StockDAO {

	public boolean addProduct(Products product);

	public boolean modifyProduct(Products product);
	
	public Products searchProductById(int id);
	
	public Products searchProductByName(String name);
	
	public List<Products> searchProductByCategory(String category);
    
	public List<Products> getAllProducts();
}
