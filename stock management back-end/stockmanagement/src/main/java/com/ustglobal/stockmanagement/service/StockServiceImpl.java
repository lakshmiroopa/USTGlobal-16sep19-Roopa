package com.ustglobal.stockmanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ustglobal.stockmanagement.dao.StockDAO;
import com.ustglobal.stockmanagement.dto.Products;

@Service
public class StockServiceImpl implements StockService {

	@Autowired
	private StockDAO dao;

	@Override
	public boolean addProduct(Products product) {
		if (product.getName() == null || product.getCategory() == null || product.getCompany() == null) {
			return false;
		}
		return dao.addProduct(product);
	}

	@Override
	public boolean modifyProduct(Products product) {
		if (product.getName() == null || product.getCategory() == null || product.getCompany() == null) {
			return false;
		}
		return dao.modifyProduct(product);

	}

	@Override
	public Products searchProductById(int id) {
        return dao.searchProductById(id);
	}

	@Override
	public Products searchProductByName(String name) {
		return dao.searchProductByName(name);
	}

	@Override
	public List<Products> searchProductByCategory(String category) {
		return dao.searchProductByCategory(category);
	}

	@Override
	public List<Products> getAllProducts() {
		return dao.getAllProducts();
	}

}
