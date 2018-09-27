import java.util.*;

public class AllOrders {

    HashMap<String, Double> data;

    public AllOrders() {
        initialize();
    }

    private void initialize() {
        data = new HashMap<String, Double>();
        String key1, key2, key3;
        Double a, b, c;

      

        //Vector dataLines = util.fileToVector("Candidates.txt");
        for (int i = 0; i < data.size(); i++) {
            /*String str = (String) data.elementAt(i);
            StringTokenizer st = new StringTokenizer(str, ",");
            data.add(
                    new ModelOrder(st.nextToken(), st.nextToken(),
                            st.nextToken()));*/
        }
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
