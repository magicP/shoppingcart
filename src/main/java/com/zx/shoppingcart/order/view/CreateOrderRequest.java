package com.zx.shoppingcart.order.view;

public class CreateOrderRequest {
    private long userId;
    private long productId;

    private long quantity;
    private String status;
    private String address;

    public CreateOrderRequest(long userId, long productId, long quantity, String status, String address) {
        this.userId = userId;
        this.productId = productId;
        this.quantity = quantity;
        this.status = status;
        this.address = address;
    }

    public long getUserId() {
        return userId;
    }

    public long getProductId() {
        return productId;
    }

    public long getQuantity() {
        return quantity;
    }

    public String getStatus() {
        return status;
    }

    public String getAddress() {
        return address;
    }
}
