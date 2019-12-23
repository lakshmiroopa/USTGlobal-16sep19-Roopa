package com.ustglobal.stockmanagement.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ustglobal.stockmanagement.dto.ProductResponse;
import com.ustglobal.stockmanagement.dto.Products;
import com.ustglobal.stockmanagement.service.StockService;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class StockController {

	@Autowired
	private StockService service;

	@PostMapping(path = "/add", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ProductResponse addProduct(@RequestBody Products product) {
		ProductResponse response = new ProductResponse();
		if (service.addProduct(product)) {
			response.setStatusCode(201);
			response.setMessage("success");
			response.setDescription("Data added to the DB");
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Data not added to the DB");

		}
		return response;
	}

	@PutMapping(path = "/modify", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ProductResponse modifyProduct(@RequestBody Products product) {
		ProductResponse response = new ProductResponse();
		if (service.modifyProduct(product)) {
			response.setStatusCode(201);
			response.setMessage("success");
			response.setDescription("Data modified in the DB");
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Data not modified in the DB");

		}

		return response;
	}

	@GetMapping(path = "/get", produces = MediaType.APPLICATION_JSON_VALUE)
	public ProductResponse searchProductById(@RequestParam("id") int id) {
		ProductResponse response = new ProductResponse();
		Products product = service.searchProductById(id);
		if (product != null) {
			response.setStatusCode(201);
			response.setMessage("success");
			response.setDescription("Data found in the DB");
			response.setProducts(Arrays.asList());
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Data not found in the DB");

		}
		return response;
	}
	@GetMapping(path="/get-all",produces=MediaType.APPLICATION_JSON_VALUE)
	public ProductResponse getAllProducts(){
		ProductResponse response = new ProductResponse();
		List<Products> products = service.getAllProducts();
		if(!products.isEmpty()) {
			response.setStatusCode(201);
			response.setMessage("success");
			response.setDescription("Data found in the DB");
			response.setProducts(products);
		}else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Data not found in the DB");

		}
		return response;
	}


}
