package org.csu.sparrowbrand.domain;

import java.io.Serializable;
import java.util.Date;

public class Donate implements Serializable {

    private static final long serialVersionUID = -7492639752670189553L;
    private String donateId;
    private String productId;
    private String sender;
    private String buy_time;
    private double price;

    public String getDonateId() {
        return donateId;
    }
    public void setDonateId(String donateId) {
        this.donateId = donateId;
    }

    public String getProductId() {
        return productId;
    }
    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getSender() {
        return sender;
    }
    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getBuy_time() {
        return buy_time;
    }
    public void setBuy_time(String buy_time) {
        this.buy_time = buy_time;
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
}
