package web;

import domain.Product;
import dto.ProductDto;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.ProductService;

import java.net.URI;
import java.util.List;

import static org.slf4j.LoggerFactory.getLogger;

@RestController
@RequestMapping("/api/products")
public class ApiProductController {
    private static final Logger log = getLogger(ApiProductController.class);

    @Autowired
    private ProductService productService;

    @GetMapping("")
    public ResponseEntity<List<Product>> showList() {
        List<Product> products = productService.findAll();

        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(URI.create("/"));
        return new ResponseEntity<>(products, headers, HttpStatus.OK);
    }

    @GetMapping("/{displayInfoId}")
    public ProductDto showInfo(@PathVariable long displayInfoId) {
        Product product = productService.findById(displayInfoId);
        return product._toProductDto();
    }
}
