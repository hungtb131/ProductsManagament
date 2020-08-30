package service;

import model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductServiceImpl implements ProductService{
    static List<Product> products = new ArrayList<>();
    static {
        products.add(new Product(1, "Samsung", 300000, "Authentic"));
        products.add(new Product(2, "Sony", 400000, "Export"));
        products.add(new Product(3, "LG", 500000, "2th Genaration"));
        products.add(new Product(4, "Toshiba", 600000, "Bonus 1 Latop"));
        products.add(new Product(5 ,"Panasonic", 700000, "Big Sale"));
    }
    @Override
    public List<Product> findAllProduct() {
        return products;
    }

    @Override
    public Product findById(int id) {
        for (Product product: products){
            if (product.getId() == id){
                return product;
            }
        }
        return null;
    }

    @Override
    public void save(Product product) {
        products.add(product);
    }

    @Override
    public void delete(int id) {
        products.removeIf(product -> product.getId() == id);
    }

    @Override
    public void update(int id, Product product) {
        for (Product product1: products){
            if (product1.getId() == id){
                product1 = product;
            }
        }
    }
}
