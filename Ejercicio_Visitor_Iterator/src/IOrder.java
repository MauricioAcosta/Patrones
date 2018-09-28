
public class IOrder {

    private String orderAmount;
    private String orderSH;
    private String orderTax;
    private String orderType;

    public IOrder(String orderAmount, String orderSH, String orderTax, String orderType) {
        orderAmount = orderAmount;
        orderSH = orderSH;
        orderTax = orderTax;
        orderType = orderType;
    }

    public String getOrderAmount() {
        return orderAmount;
    }

    public String getOrderSH() {
        return orderSH;
    }

    public String getOrderTax() {
        return orderTax;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderAmount(String orderAmount) {
        this.orderAmount = orderAmount;
    }

    public void setOrderSH(String orderSH) {
        this.orderSH = orderSH;
    }

    public void setOrderTax(String orderTax) {
        this.orderTax = orderTax;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }
    

}
