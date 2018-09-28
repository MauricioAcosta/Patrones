
import java.util.*;

class OrderVisitor implements VisitorInterface {

    private double orderTotal;


    public OrderVisitor() {

    }

    public void visit(NonCaliforniaOrder inp_order) {
        orderTotal = orderTotal + inp_order.getOrderAmount();
        System.out.println("Valor order " + inp_order.getOrderAmount());     
    }

    public void visit(CaliforniaOrder inp_order) {

        orderTotal = orderTotal + inp_order.getOrderAmount()
             + inp_order.getAdditionalTax();
        System.out.println("Valor order " + inp_order.getOrderAmount() + " Valor impuesto: " + inp_order.getAdditionalTax());
     
    }

    public void visit(OverseasOrder inp_order) {
        orderTotal = orderTotal + inp_order.getOrderAmount()
           + inp_order.getAdditionalSH();
        System.out.println("Valor order " + inp_order.getOrderAmount() + " Valor impuesto: " + inp_order.getAdditionalSH());
     
    }

    public double getOrderTotal() {
        return orderTotal;
    }
}
