
import java.util.*;
import java.io.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import com.sun.java.swing.plaf.windows.*;


class ButtonHandler implements ActionListener {

    OrderManager objOrderManager;
    
    
    public void actionPerformed(ActionEvent e) {
        String totalResult = null;

        if (e.getActionCommand().equals(OrderManager.EXIT)) {
            System.exit(1);
        }
        if (e.getActionCommand().equals(OrderManager.MODIFY)) {
            System.out.println(objOrderManager.getOrderAmount());
            
        }
        if (e.getActionCommand().equals(OrderManager.SEARCH)) {
            // Get the damn order!
            
//            System.out.println(objOrderManager.getOrderAmount());
            // accept the visitor instance
            //order.accept(visitor);

        }

        if (e.getActionCommand().equals(OrderManager.CREATE_ORDER)) {
            //get input values
            String orderType = objOrderManager.getOrderType();
            String strOrderAmount
                    = objOrderManager.getOrderAmount();
            String strTax = objOrderManager.getTax();
            String strSH = objOrderManager.getSH();

            double dblOrderAmount = 0.0;
            double dblTax = 0.0;
            double dblSH = 0.0;

            if (strOrderAmount.trim().length() == 0) {
                strOrderAmount = "0.0";
            }
            if (strTax.trim().length() == 0) {
                strTax = "0.0";
            }
            if (strSH.trim().length() == 0) {
                strSH = "0.0";
            }

            dblOrderAmount
                    = new Double(strOrderAmount).doubleValue();
            dblTax = new Double(strTax).doubleValue();
            dblSH = new Double(strSH).doubleValue();

            //Create the order
            Order order = createOrder(orderType, dblOrderAmount,
                    dblTax, dblSH);

            
        }

        if (e.getActionCommand().equals(OrderManager.GET_TOTAL)) {
            
            //Get the Visitor
            OrderVisitor visitor
                    = objOrderManager.getOrderVisitor();
            
            objOrderManager.setTotalValue(
                    " Order Created Successfully");
            
            //Get the Visitor
            //OrderVisitor visitor
              //      = objOrderManager.getOrderVisitor();
            totalResult = new Double(
                    visitor.getOrderTotal()).toString();
            totalResult = " Orders Total = " + totalResult;
            objOrderManager.setTotalValue(totalResult);
        }
    }

    public Order createOrder(String orderType,
            double orderAmount, double tax, double SH) {
        if (orderType.equalsIgnoreCase(OrderManager.CA_ORDER)) {
            return new CaliforniaOrder(orderAmount, tax);
        }
        if (orderType.equalsIgnoreCase(
                OrderManager.NON_CA_ORDER)) {
            return new NonCaliforniaOrder(orderAmount);
        }
        if (orderType.equalsIgnoreCase(
                OrderManager.OVERSEAS_ORDER)) {
            return new OverseasOrder(orderAmount, SH);
        }
        return null;
    }
    
    public Order modifyOrder(){
        return null;
    }
    
    public Order liquidateOrder(){
        return null;
    }
    
    public Order searchOrder(){
        return null;
    }

    public ButtonHandler() {
    }

    public ButtonHandler(OrderManager inObjOrderManager) {
        objOrderManager = inObjOrderManager;
    }

} // End of class ButtonHandler

