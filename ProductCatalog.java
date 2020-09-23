package lesson3;

import java.util.ArrayList;

public class ProductCatalog {

    protected ArrayList<Product> lst;

    public ProductCatalog(ProductCatalog ob) {
        lst = ob.lst;
    }

    public ProductCatalog() {
        lst = new ArrayList<>();
    }

    public ArrayList<Product> getAllProducts() {
        return lst;
    }

    public void createProduct(Product product) throws ProductAlreadyExistException {
        if (!lst.isEmpty()) {
            for (Product x : lst) {
                if (x.getName().equals(product.getName())) {
                    throw new ProductAlreadyExistException();
                }
            }
        }
        lst.add(product);
    }

    public void updateProduct(Product product) throws ProductNotFoundException, ProductNotValidException {
        if (product.getName().equals("")) {
            throw new ProductNotValidException();
        }
        int ind = 0;
        for (Product x : lst) {
            if (x.getId() == product.getId()) {
                ind = 1;
                lst.remove(x);
                lst.add(product);
            }
        }
        if (ind == 0) {
            throw new ProductNotFoundException();
        }
    }

    public void deleteProduct(int id) throws ProductNotFoundException{
        int ind = 0;
        for (Product x : lst) {
            if (x.getId() == id) {
                ind = 1;
                lst.remove(x);
            }
        }
        if (ind == 0) {
            throw new ProductNotFoundException();
        }
    }

    public void printInf() {
        if (!lst.isEmpty()) {
            for (Product x : lst) {
                x.printInfo();
            }
        }
    }
}
