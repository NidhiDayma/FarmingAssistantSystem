package com.Farming.Assistant.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Farming.Assistant.demo.dto.ProductRequestDto;
import com.Farming.Assistant.demo.dto.ProductResponseDto;
import com.Farming.Assistant.demo.entities.Product;
import com.Farming.Assistant.demo.service.ProductService;

@RestController
@RequestMapping("/Product")
	public class ProductController {

	    @Autowired
	    private ProductService productservice;

	 
	    @PostMapping("/addproduct")
	    public ResponseEntity<Object> addProduct(@RequestBody ProductRequestDto productrequestdtoObj) {
	        ProductResponseDto addedProduct = productservice.addProduct(productrequestdtoObj);
	        ResponseEntity<Object> responseentityObj = new ResponseEntity<Object>(addedProduct, HttpStatus.CREATED);
	        return responseentityObj;
	    }

	 
	    @GetMapping("/getproduct")
	    public List<ProductResponseDto> getAllProducts() {
	        return productservice.getAllProducts();

	    }

	 

	    @GetMapping("/getproduct/{productId}")
	    public ResponseEntity<Object> getProductById(@PathVariable(value = "productId") int productId) {
	        ProductResponseDto singleProductObj = productservice.getproductbyId(productId);
	        ResponseEntity<Object> responseentityObj = new ResponseEntity<Object>(singleProductObj, HttpStatus.OK);
	        return responseentityObj;
	    }

	 

	    @PutMapping("/updateproduct/{productId}")
	    public ResponseEntity<Object> updateProduct(@RequestBody ProductRequestDto productrequestdtoObj) {
	        Product updatedProduct = productservice.updateProduct(productrequestdtoObj);
	        ResponseEntity<Object> responseentityObj = new ResponseEntity<Object>(updatedProduct, HttpStatus.CREATED);
	        return responseentityObj;
	    }

	 

	    @DeleteMapping(path = "/deleteproduct/{productId}")
	    public ResponseEntity<Object> deleteProduct(@PathVariable(value = "productId") int productId){
	        productservice.deleteProduct(productId);
	        ResponseEntity<Object> responseentityObj = new ResponseEntity<Object>("ID "+productId+" deleted Successfully", HttpStatus.ACCEPTED);
	        return responseentityObj;
	    }
	}
