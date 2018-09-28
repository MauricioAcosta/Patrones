
import java.util.*;

public class SelectedOrders implements Iterator {

    String selectedType;
    IOrder nextOrder;
    Enumeration ec;
    AllOrders ao;

    public SelectedOrders(AllOrders inp_ac,String type) {
        ao = inp_ac;
        selectedType = type;
        //ec = inp_ac.getAllOrders();
    }

    public boolean hasNext() {
        boolean matchFound = false;
        while (ec.hasMoreElements()) {
            IOrder tempObj = (IOrder) ec.nextElement();
            if (tempObj.getOrderType().equals(selectedType)) {
                matchFound = true;
                nextOrder = tempObj;
                break;
            }
        }
        if (matchFound == true) {
        } else {
            nextOrder = null;
        }
        return matchFound;
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
}
