import java.util.*;

public class AllOrders {

    HashMap data;
    private int size;

    public AllOrders() {
        initialize();
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    private void initialize() {
        data = new HashMap();
        size=data.size();
    }
    public void saveOrder(int idOrder, String orderType,double orderAmount, double tax, double SH){
        
        if (data.containsKey(idOrder)) {
            System.out.println("Replace, idOrder:"+idOrder);
            //data.remove(idOrder+1);
            System.out.println(data.get(idOrder));
            data.replace(idOrder,data.get(idOrder), (orderType+" , "+orderAmount+" , "+tax+" , "+SH));
            System.out.println(data.get(idOrder));
        }else{
            System.out.println("Save, idOrder:"+idOrder);
            data.put(idOrder,orderType+" , "+orderAmount+" , "+tax+" , "+SH);
        }
                
        
        //System.out.println("AllOrders.saveOrder() "+ data);

    }
    
    public Enumeration getAllOrders(int idOrder) {

        return (Enumeration) data.get(idOrder);
    }

    public Iterator getOrderSeletedType(String type) {
        return new SelectedOrders(this,type);
    }
   

}

