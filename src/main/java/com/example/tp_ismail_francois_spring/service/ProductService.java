package service;

import modele.Product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.ProductRepository;


import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public List<Product> listsAll() {

        return productRepository.findAll();
    }

    public void save(Product product) {
        productRepository.save(product);
    }


    public Product get(Long id) {

        return productRepository.findById(id).get();
    }
}

