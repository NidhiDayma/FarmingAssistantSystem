package com.Farming.Assistant.demo.dto;


public class ProductResponseDto{

 

    private long productId;
    private String productName;
    private long productPrice;
    private long productQuantity;

 

    public long getProductId() {
        return productId;
    }

 

    public void setProductId(long productId) {
        this.productId = productId;
    }

 

    public String getProductName() {
        return productName;
    }

 

    public void setProductName(String productName) {
        this.productName = productName;
    }

 

    public long getProductPrice() {
        return productPrice;
    }

 

    public void setProductPrice(long productPrice) {
        this.productPrice = productPrice;
    }

 

    public long getProductQuantity() {
        return productQuantity;
    }

 

    public void setProductQuantity(long productQuantity) {
        this.productQuantity = productQuantity;
    }

 

    public ProductResponseDto(int productId, String productName, long productPrice, long productQuantity) {
        super();
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productQuantity = productQuantity;
    }

 

    public ProductResponseDto() {
        super();
        // TODO Auto-generated constructor stub
    }

 

    @Override
    public String toString() {
        return "ProductRequestDto [productId=" + productId + ", productName=" + productName + ", productPrice="
                + productPrice + ", productQuantity=" + productQuantity + "]";
    }
}
