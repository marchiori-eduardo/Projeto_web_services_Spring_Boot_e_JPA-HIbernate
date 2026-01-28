package com.marchiori_eduardo.projeto_web.resources;

import com.marchiori_eduardo.projeto_web.entities.Product;
import com.marchiori_eduardo.projeto_web.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController//declaração de que esta classe é um recurso web
@RequestMapping(value = "/products")//nome do recurso + o caminho do recurso
public class ProductResources {

    @Autowired
    private ProductService service;

    @GetMapping //indicação de que o metodo responde a requisição http
    public ResponseEntity<List<Product>> findAll() {
        List<Product> list = service.findALl();

        return ResponseEntity.ok().body(list); // retorno do corpo da resposta
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Product> findById(@PathVariable Long id) {
        Product obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }

}
