package com.marchiori_eduardo.projeto_web.services;

import com.marchiori_eduardo.projeto_web.entities.Category;
import com.marchiori_eduardo.projeto_web.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service //identificacao como um componente do spring, para poder ser injetado automaticamente
public class CategoryService {

    @Autowired
    private CategoryRepository Repository;

    public List<Category> findALl() {
        return Repository.findAll();
    }

    public Category findById(Long id) {
        Optional<Category> obj = Repository.findById(id);
        return obj.get();
    }
}
