public class ModelOrder {
  private String name;
  private String OrderSeletedType;
  private String location;

  public ModelOrder(String inp_name, String inp_certType, String loc) {
    name = inp_name;
    OrderSeletedType = inp_certType;
    location = loc;
  }
  public String getOrderSeletedType() {
    return OrderSeletedType;
  }
  public String getName() {
    return name;
  }
  public String getLocation() {
    return location;
  }
}
