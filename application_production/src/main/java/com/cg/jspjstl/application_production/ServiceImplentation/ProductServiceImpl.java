package com.cg.jspjstl.application_production.ServiceImplentation;

import com.cg.jspjstl.application_production.model.Product;
import com.cg.jspjstl.application_production.ServiceInterface.ProductService;
import java.util.ArrayList;
import java.util.List;

public class ProductServiceImpl implements ProductService {
    public ProductServiceImpl(){
        products.add(new Product(1, "Iphone 11",1000,"New 99%","IOS Company"));
        products.add(new Product(2,"Dell",2300,"New 100% Sale","Dell ICP"));
    }
    private final List<Product> products = new ArrayList<>();

    @Override
    public List<Product> getAllProducts() {
        return products;
    }

    @Override
    public Product getProductById(int id) {
        for (Product product : products) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null;
    }

    @Override
    public void addProduct(Product product) {
        products.add(product);
    }

    @Override
    public void updateProduct(int id, Product product) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == id) {
                products.set(i, product);
                return;
            }
        }
    }

    @Override
    public void deleteProduct(int id) {
        products.removeIf(product -> product.getId() == id);
    }

    @Override
    public List<Product> searchProductByName(String name) {
        List<Product> result = new ArrayList<>();
        for (Product product : products) {
            if (product.getName().equalsIgnoreCase(name)) {
                result.add(product);
            }
        }
        return result;
    }
}

