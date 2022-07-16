package spring.springtest.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import spring.springtest.service.ProductService;
import spring.springtest.service.SaleService;

@RestController
@RequestMapping(path = "api/v1")
public class AllApi {
    @Autowired
    ProductService productService;
    @Autowired
    SaleService saleService;

    @RequestMapping(method = RequestMethod.GET, path = "products")
    public ResponseEntity<?> findAllProduct() {
        return ResponseEntity.ok(productService.findAll());
    }

    @RequestMapping(method = RequestMethod.GET, path = "sales")
    public ResponseEntity<?> findAllSale() {
        return ResponseEntity.ok(saleService.findAll());
    }
}
