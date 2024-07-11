package service;

import model.Product;

import java.util.List;
import java.util.Optional;

public interface productService {
    List<Product> getAllProducts();

    Optional<Product> getProductById(Long id);

    Product SaveProduct(Product product);

    void DeleteProduct(Long id);
}

