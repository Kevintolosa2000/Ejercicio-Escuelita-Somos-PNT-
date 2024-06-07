import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        List<Product> products = addProducts();
        printProducts(products);
        findMostExpensiveAndCheapest(products);
    }

    private static List<Product> addProducts() {
        List<Product> products = new ArrayList<>();
        products.add(new Drinks("Coca-Cola Zero", 20.0, 1.5, "litros"));
        products.add(new Drinks("Coca-Cola", 18.0, 1.5, "litros"));
        products.add(new ShowerProducts("Shampoo Sedal", 19.0, 500, "ml"));
        products.add(new Fruits("Frutillas", 64.0, 1, "kilo"));
        return products;
    }

    private static void printProducts(List<Product> products) {
        for (Product product : products) {
            System.out.println(product);
        }
        System.out.println("=============================");
    }
    private static void findMostExpensiveAndCheapest(List<Product> products) {
        Product mostExpensive = Collections.max(products);
        Product cheapest = Collections.min(products);
        System.out.println("Producto más caro: " + mostExpensive.getName());
        System.out.println("Producto más barato: " + cheapest.getName());
    }

}