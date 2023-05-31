package com.Farming.Assistant.demo.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Farming.Assistant.demo.dto.ProductRequestDto;
import com.Farming.Assistant.demo.dto.ProductResponseDto;
import com.Farming.Assistant.demo.entities.Product;
import com.Farming.Assistant.demo.repository.ProductRepository;
import com.Farming.Assistant.demo.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {
	
    @Autowired
    private ProductRepository productRepo;
    
    @Override
    public ProductResponseDto addProduct(ProductRequestDto productrequestdtoObj) {
        Product productentityObj = new Product();
        productentityObj.setProductId(productrequestdtoObj.getProductId());
        productentityObj.setProductName(productrequestdtoObj.getProductName());
        productentityObj.setProductPrice(productrequestdtoObj.getProductPrice());
        productentityObj.setProductQuantity(productrequestdtoObj.getProductQuantity());
        productRepo.save(productentityObj);

 

        ProductResponseDto productresponsedtoObj = new ProductResponseDto();
        productresponsedtoObj.setProductId(productentityObj.getProductId());
        productresponsedtoObj.setProductName(productentityObj.getProductName());
        productresponsedtoObj.setProductPrice(productentityObj.getProductPrice());
        productresponsedtoObj.setProductQuantity(productentityObj.getProductQuantity());
        return productresponsedtoObj;

 

    }


    @Override
    public List<ProductResponseDto> getAllProducts() {


        List<ProductResponseDto> responsedlisttoObj = new ArrayList<>();


        ProductResponseDto responseObj = null;


        List<Product> allproductlist = productRepo.findAll();


        for (Product productentityObj : allproductlist) {
            responseObj = new ProductResponseDto();
            responseObj.setProductId(productentityObj.getProductId());
            responseObj.setProductName(productentityObj.getProductName());
            responseObj.setProductPrice(productentityObj.getProductPrice());
            responseObj.setProductQuantity(productentityObj.getProductQuantity());

 

            responsedlisttoObj.add(responseObj);
        }
        return responsedlisttoObj;
    }

 

    @Override
    public ProductResponseDto getproductbyId(int productId) {
        ProductResponseDto responseObj = null;
        Product productentityObj = productRepo.findById(productId).get();
        responseObj = new ProductResponseDto();
        responseObj.setProductId(productentityObj.getProductId());
        responseObj.setProductName(productentityObj.getProductName());
        responseObj.setProductPrice(productentityObj.getProductPrice());
        responseObj.setProductQuantity(productentityObj.getProductQuantity());
        return responseObj;
    }


    @Override
    public Product updateProduct(ProductRequestDto productrequestdtoObj) {
        Product productentityObj = productRepo.findByproductId(productrequestdtoObj.getProductId());
        productentityObj.setProductId(productrequestdtoObj.getProductId());
        productentityObj.setProductName(productrequestdtoObj.getProductName());
        productentityObj.setProductPrice(productrequestdtoObj.getProductPrice());
        productentityObj.setProductQuantity(productrequestdtoObj.getProductQuantity());
        return productRepo.save(productentityObj);
    }


    @Override
    public String deleteProduct(int productId) {
        productRepo.deleteById(productId);
        return "deleted Successfully";
    }
}