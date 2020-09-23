package lesson3;

public class Product {

    protected long id;
    protected String name;
    protected double weight;
    protected String supplier;

    public Product(Product ob) {
        id = ob.id;
        name = ob.name;
        weight = ob.weight;
        supplier = ob.supplier;
    }

    public Product(long prodid, String prodname, double prodweight, String prodsupplier) {
        id = prodid;
        name = prodname;
        weight = prodweight;
        supplier = prodsupplier;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public String getSupplier() {
        return supplier;
    }

    public void printInfo() {
        System.out.println("ID: " + id + " Название: " + name + " Вес: " + weight + "Производитель: " + supplier);
    }
}
