package com.niles.projetosistemadepagamento.entitities;

public class Order {

    private Integer orderId;
    private Double basic;
    private Double discount;

    public Order(Double orderId, Double basic, Double discount) {
    }

    public Order(Integer orderId, Double basic, Double discount) {
        this.orderId = orderId;
        this.basic = basic;
        this.discount = discount;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Double getBasic() {
        return basic;
    }

    public void setBasic(Double basic) {
        this.basic = basic;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", basic=" + basic +
                ", discount=" + discount +
                '}';
    }
}
