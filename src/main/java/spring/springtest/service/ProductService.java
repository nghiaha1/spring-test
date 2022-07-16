package spring.springtest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.springtest.entity.Product;
import spring.springtest.repository.ProductRepository;

@Service
public class ProductService {
    @Autowired
    ProductRepository productRepository;

    public Iterable<Product> findAll() {
        return productRepository.findAll();
    }
}
