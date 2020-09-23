package lesson3;

import lesson1.Product;
import lesson1.ProductAlreadyExistException;

import java.util.ArrayList;

public class ProductCatalog {

    protected ArrayList<lesson1.Product> lst;

    public ProductCatalog(ProductCatalog ob) {
        lst = ob.lst;
    }

    public ProductCatalog() {
        lst = new ArrayList<>();
    }

    public ArrayList<lesson1.Product> getAllProducts() {
        return lst;
    }

    public void createProduct(lesson1.Product product) throws ProductAlreadyExistException {
        if (!lst.isEmpty()) {
            for (Product x : lst) {
                if (x.getName().equals(product.getName())) {
                    throw new ProductAlreadyExistException();
                }
            }
        }
        lst.add(product);
    }
}
