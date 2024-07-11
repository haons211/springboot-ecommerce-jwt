package service;

import model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import repository.productRepository;

import java.util.List;
import java.util.Optional;

public class productServiceimpl implements productService {
    @Autowired
    private productRepository productRepository;

    @Override
    public List<Product> getAllProducts() {
        return List.of();
    }

    @Override
    public Optional<Product> getProductById(Long id) {
        return Optional.empty();
    }

    @Override
    public Product SaveProduct(Product product) {
        return null;
    }

    @Override
    public void DeleteProduct(Long id) {

    }
}
