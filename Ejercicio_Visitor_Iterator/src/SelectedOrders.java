
import java.util.*;

public class SelectedOrders implements Iterator {

    
    IOrder nextOrder;
    Enumeration ec;
    AllOrders ao;

    public SelectedOrders(AllOrders inp_ac) {
        ao = inp_ac;
        
    }

    public boolean hasNext() {
        return false;
    }

    public Object next() {
        if (nextOrder == null) {
            throw new NoSuchElementException();
        } else {
            return nextOrder;
        }
    }

    public void remove() {
    }
    

//    @Override
//    public boolean hasNext() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public Object next() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
}
