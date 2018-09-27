import java.util.*;

public class SelectedOrders implements Iterator {
  //AllCandidates ac;
  String selectedType;
  ModelOrder nextOrder;
  Enumeration ec;
  AllOrders ao;
  
  


  public SelectedOrders( AllOrders inp_ac, String type) {
    ao = inp_ac;
    selectedType = type;
    ec = inp_ac.getAllOrders();
  }
  
  public boolean hasNext() {
    boolean matchFound = false;
    while (ec.hasMoreElements()) {
      ModelOrder tempObj = (ModelOrder) ec.nextElement();
      if (tempObj.getOrderSeletedType().equals(
            selectedType)) {
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

  public void remove() {};

}
