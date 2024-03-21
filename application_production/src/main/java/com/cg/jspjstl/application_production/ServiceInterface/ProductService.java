package com.cg.jspjstl.application_production.ServiceInterface;
import com.cg.jspjstl.application_production.model.Product;
import java.util.List;

public interface ProductService {
    List<Product> getAllProducts();
    Product getProductById(int id);
    void addProduct(Product product);
    void updateProduct(int id, Product product);
    void deleteProduct(int id);
    List<Product> searchProductByName(String name);
}
