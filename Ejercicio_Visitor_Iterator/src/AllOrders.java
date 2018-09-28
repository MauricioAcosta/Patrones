import java.util.*;

public class AllOrders {

    HashMap data;

    public AllOrders() {
        initialize();
    }

    private void initialize() {
        data = new HashMap();        
    }
    public void saveOrder(int idOrder, String orderType,double orderAmount, double tax, double SH){
        data.put(idOrder+1,orderType+" , "+orderAmount+" , "+tax+" , "+SH);
        //System.out.println("AllOrders.saveOrder() "+ data);

    }
    
    public Enumeration getAllOrders(int idOrder) {

        return (Enumeration) data.get(idOrder);
    }

    public Iterator getOrderSeletedType(String type) {
        return new SelectedOrders(this,type);
    }
   

}

