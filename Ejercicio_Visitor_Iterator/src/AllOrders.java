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
        data.put(idOrder,orderType+","+orderAmount+","+tax+","+SH);

    }
    
    public Enumeration getAllOrders(int idOrder) {

        return (Enumeration) data.get(idOrder);
    }

    public Iterator getOrderSeletedType(String type) {
        return new SelectedOrders(this,type);
    }

}

