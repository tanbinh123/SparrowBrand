package org.csu.sparrowbrand.domain;

import java.io.Serializable;

public class Product_sold implements Serializable {

    private static final long serialVersionUID = -7492639752670189553L;
    private String soldId;
    private String productId;
    private String donateId;
    private String username;
    private String buy_time;
    private double price;

    public void setBuy_time(String buy_time) {
        this.buy_time = buy_time;
    }

    public String getBuy_time() {
        return buy_time;
    }

    public String getDonateId() {
        return donateId;
    }

    public void setDonateId(String donateId) {
        this.donateId = donateId;
    }

    public String getSoldId() {
        return soldId;
    }

    public void setSoldId(String soldId) {
        this.soldId = soldId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId.trim();
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}
