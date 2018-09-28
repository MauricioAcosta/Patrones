
import java.util.HashMap;
import java.util.Scanner;
import java.util.Vector;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author kirito
 */
public class prueba {

    public static void main(String[] args) {
        String key1, key2, key3;
        Double a, b, c;
        HashMap<String, Double> perrito = new HashMap<String, Double>();
        Scanner leer = new Scanner(System.in);

        key1 = "1";
        key2 = "2";
        key3 = "3";

        a = leer.nextDouble();
        b = leer.nextDouble();
        c = leer.nextDouble();

        perrito.put(key1, a);
        perrito.put(key2, b);
        perrito.put(key3, c);

        System.out.println("Perrito[0]: " + perrito.get(key1));
        System.out.println("Perrito[1]: " + perrito.get(key2));
        System.out.println("Perrito[2]: " + perrito.get(key3));

    }

}
