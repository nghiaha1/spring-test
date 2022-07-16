package spring.springtest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.springtest.entity.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {
}
