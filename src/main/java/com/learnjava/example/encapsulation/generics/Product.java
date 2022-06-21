package com.learnjava.example.encapsulation.generics;

import java.math.BigDecimal;

public class Product implements Comparable<Product> {
    private long productId;
    private String productName;
    private String code;
    private BigDecimal price;

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

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public int compareTo(Product o) {
        return this.price.compareTo(o.getPrice());
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", code='" + code + '\'' +
                ", price=" + price +
                '}';
    }
}
