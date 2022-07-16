package spring.springtest;

import com.github.javafaker.Faker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import spring.springtest.entity.Sale;
import spring.springtest.repository.SaleRepository;

import java.util.ArrayList;
import java.util.List;

@Component
public class ApplicationSeeder implements CommandLineRunner {
    @Autowired
    ProductSeeder productSeeder;

    public void run(String... args) throws Exception {
        productSeeder.productSeeder();
    }

}
