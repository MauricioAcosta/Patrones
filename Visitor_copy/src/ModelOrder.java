public class ModelOrder {
  private String orderAmount;
  private String orderSH;
  private String orderTax;
  private String orderType;

  public ModelOrder(String orderAmount, String orderSH, String orderTax, String orderType) {
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
 
  
  
}
