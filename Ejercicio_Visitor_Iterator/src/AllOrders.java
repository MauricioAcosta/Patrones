import java.util.*;

public class AllOrders {

    HashMap data;

    public AllOrders() {
        initialize();
    }

    private void initialize() {
        data = new HashMap();        
    }

    public void saveOrder(int idOrder, String orderType,
            double orderAmount, double tax, double SH){                
        
            data.put(idOrder,orderType+","+orderAmount+","+tax+","+SH);
        
    }
    
    public Enumeration getAllOrders() {

        return null;
    }

    public Iterator getOrderSeletedType(String type) {
        return new SelectedOrders(type);
    }

}

//Scanner leer = new Scanner(System.in);
/*     key1 = "1";
        key2= "2";
        key3 = "3";
        a = leer.nextDouble();
        b = leer.nextDouble();
        c = leer.nextDouble();
        perrito.put(key1, a);
        perrito.put(key2, b);
        perrito.put(key3, c);
        System.out.println("Perrito[0]: "+perrito.get(key1));
        System.out.println("Perrito[1]: "+perrito.get(key2));
        System.out.println("Perrito[2]: "+perrito.get(key3));*/
