package spring.springtest;

import com.github.javafaker.Faker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import spring.springtest.entity.Product;
import spring.springtest.repository.ProductRepository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Component
public class ProductSeeder {
    @Autowired
    ProductRepository productRepository;
    Faker faker = new Faker();

    public void productSeeder() {
        List<Product> productList = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            productList.add(Product.builder()
                    .prodName(faker.name().fullName())
                    .dateOfManf(LocalDateTime.now())
                    .description(faker.lorem().sentence())
                    .price(NumberUtil.getRandomNumber(100, 1000)*1000)
                    .build());
            productRepository.saveAll(productList);
        }
    }
}
