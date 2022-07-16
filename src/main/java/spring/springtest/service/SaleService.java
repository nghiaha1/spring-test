package spring.springtest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.springtest.entity.Sale;
import spring.springtest.repository.SaleRepository;

@Service
public class SaleService {
    @Autowired
    SaleRepository saleRepository;

    public Iterable<Sale> findAll() {
        return saleRepository.findAll();
    }
}
