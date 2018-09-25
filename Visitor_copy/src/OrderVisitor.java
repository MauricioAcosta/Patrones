
import java.util.*;

class OrderVisitor implements VisitorInterface {
    
    private double orderTotal;

    public OrderVisitor() {
        
    }

    public double visit(NonCaliforniaOrder inp_order) {
        System.out.println("Valor order "+inp_order.getOrderAmount());
        orderTotal = orderTotal + inp_order.getOrderAmount();
        return orderTotal;
    }

    public double visit(CaliforniaOrder inp_order) {
        System.out.println("Valor order "+inp_order.getOrderAmount() +" Valor impuesto: "+ inp_order.getAdditionalTax());
        orderTotal = orderTotal + inp_order.getOrderAmount()
                + inp_order.getAdditionalTax();
        return orderTotal;
    }

    public double visit(OverseasOrder inp_order) {
        System.out.println("Valor order "+inp_order.getOrderAmount() +" Valor impuesto: "+ inp_order.getAdditionalSH());
        orderTotal = orderTotal + inp_order.getOrderAmount()
                + inp_order.getAdditionalSH();
        return orderTotal;
    }

    public double getOrderTotal() {
        return orderTotal;
    }
}
