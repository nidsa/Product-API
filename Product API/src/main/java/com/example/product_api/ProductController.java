package com.example.product_api;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private ProductRepository repository;

    @PostMapping
    public Product addProduct(@RequestBody Product product) {
        return repository.save(product);
    }

    @GetMapping("/{id}")
    public Product findProductById(@PathVariable Long id) {
        return repository.findById(id).orElse(null);
    }

    @GetMapping
    public List<Product> getAllProducts() {
        return repository.findAll();
    }

    @PutMapping("/{id}")
    public Product updateProduct(@PathVariable Long id, @RequestBody Product productDetails) {
        Product product = repository.findById(id).orElse(null);
        if (product != null) {
            product.setName(productDetails.getName());
            product.setPricePerUnit(productDetails.getPricePerUnit());
            product.setActiveForSell(productDetails.getActiveForSell());
            repository.save(product);
        }
        return product;
    }
}
