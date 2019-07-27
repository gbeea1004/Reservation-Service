package service;

import dao.ProductDao;
import domain.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductDao productDao;

    public Product findById(long id) {
        return null;
    }

    public List<Product> findAll() {
        return null;
    }
}
