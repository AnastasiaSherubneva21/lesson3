package lesson3;

import lesson1.Product;
import lesson1.ProductAlreadyExistException;
import lesson1.ProductCatalog;

public class TestClass {
    public static void main(String[] args) {
        lesson1.Product prod1 = new lesson1.Product(12345, "apple", 236.77, "Lenta");
        lesson1.Product prod2 = new lesson1.Product(12345, "pear", 236.77, "Lenta");
        lesson1.Product prod3 = new Product(12345, "apple", 236.77, "Ashan");
        lesson1.ProductCatalog lst = new ProductCatalog();
        System.out.println(lst.getAllProducts());
        try {
            lst.createProduct(prod1);
            lst.createProduct(prod2);
            lst.createProduct(prod3);
        }
        catch (ProductAlreadyExistException e) {
            e.printStackTrace("ProductAlreadyExistException: данный продукт уже существует");
        }
        System.out.println(lst.getAllProducts());
    }
}
