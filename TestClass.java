package lesson3;

public class TestClass {
    public static void main(String[] args) {
        Product prod1 = new Product(12345, "apple", 236.77, "Lenta");
        Product prod2 = new Product(123456, "pear", 236.77, "Lenta");
        Product prod3 = new Product(1234567, "apple", 236.77, "Ashan");
        Product prod4 = new Product(12345, "", 3456, "Ashan");
        Product prod5 = new Product(123, "potato", 3456, "Ashan");
        Product prod6 = new Product(123456, "banana", 236.77, "Lenta");
        ProductCatalog lst = new ProductCatalog();
        System.out.println(lst.getAllProducts());
        try {
            lst.createProduct(prod1);
            lst.createProduct(prod2);
            lst.createProduct(prod3);
        }
        catch (ProductAlreadyExistException e) {
            e.printStackTrace("ProductAlreadyException");
        }
        lst.printInf();
        try {
            lst.updateProduct(prod6);
            lst.updateProduct(prod4);
        }
        catch (ProductNotValidException e) {
            e.printStackTrace("ProductNotValidException");
        }
        lst.printInf();
        System.out.println(lst.getAllProducts());

        try {
            lst.deleteProduct(12345);
            lst.printInf();
            //lst.deleteProduct(987654);
            lst.updateProduct(prod5);
        }
        catch (ProductNotValidException e) {
            e.printStackTrace("ProductNotValidException");
        }
    }
}
