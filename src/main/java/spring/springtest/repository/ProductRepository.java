package spring.springtest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.springtest.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
