package com.Farming.Assistant.demo.service;

import java.util.List;

import com.Farming.Assistant.demo.dto.ProductRequestDto;
import com.Farming.Assistant.demo.dto.ProductResponseDto;
import com.Farming.Assistant.demo.entities.Product;

public interface ProductService {

	ProductResponseDto addProduct(ProductRequestDto productrequestdtoObj);

	List<ProductResponseDto> getAllProducts();

	Product updateProduct(ProductRequestDto productrequestdtoObj);

	ProductResponseDto getproductbyId(int productId);

	String deleteProduct(int productId);

}
