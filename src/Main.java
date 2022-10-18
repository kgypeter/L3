import java.util.ArrayList;
import Fabrik.Product;
import java.util.*;
public class Main {
    public static void main(String[] args) {

        ArrayList<Product> product = new ArrayList<Product>();

        Product p1 = new Product("oil", 500, 200, 300,
                200, 100, 300 ,0, 0, 0);
        product.add(p1);

        Product p2 = new Product("vinegar", 600, 700, 300,
                25, 10, 60 ,0, 0, 0);
        product.add(p2);

        System.out.println(p1.getNrSoldYear1());
    }
}