
import java.util.*;

class OrderVisitor implements VisitorInterface {
    
    private double orderTotal;
    
//    HashMap obj=new HashMap();

    public OrderVisitor() {
        
    }

    public NonCaliforniaOrder visit(NonCaliforniaOrder inp_order) {        
        //orderTotal = orderTotal + inp_order.getOrderAmount();
        System.out.println("Valor order "+inp_order.getOrderAmount());
        return inp_order;
    }

    public CaliforniaOrder visit(CaliforniaOrder inp_order) {
        
        //orderTotal = orderTotal + inp_order.getOrderAmount()
          //      + inp_order.getAdditionalTax();
        System.out.println("Valor order "+inp_order.getOrderAmount() +" Valor impuesto: "+ inp_order.getAdditionalTax());
        return inp_order;
    }

    public OverseasOrder visit(OverseasOrder inp_order) {
        //orderTotal = orderTotal + inp_order.getOrderAmount()
          //      + inp_order.getAdditionalSH();
        System.out.println("Valor order "+inp_order.getOrderAmount() +" Valor impuesto: "+ inp_order.getAdditionalSH());
        return inp_order;
    }

    public double getOrderTotal() {
        return orderTotal;
    }
}
