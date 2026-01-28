package com.marchiori_eduardo.projeto_web.services;

import com.marchiori_eduardo.projeto_web.entities.Product;
import com.marchiori_eduardo.projeto_web.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service //identificacao como um componente do spring, para poder ser injetado automaticamente
public class ProductService {

    @Autowired
    private ProductRepository Repository;

    public List<Product> findALl() {
        return Repository.findAll();
    }

    public Product findById(Long id) {
        Optional<Product> obj = Repository.findById(id);
        return obj.get();
    }
}
