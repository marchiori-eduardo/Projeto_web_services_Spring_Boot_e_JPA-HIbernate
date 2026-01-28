package com.marchiori_eduardo.projeto_web.resources;

import com.marchiori_eduardo.projeto_web.entities.Order;
import com.marchiori_eduardo.projeto_web.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController//declaração de que esta classe é um recurso web
@RequestMapping(value = "/orders")//nome do recurso + o caminho do recurso
public class OrderResources {

    @Autowired
    private OrderService service;

    @GetMapping //indicação de que o metodo responde a requisição http
    public ResponseEntity<List<Order>> findAll() {
        List<Order> list = service.findALl();

        return ResponseEntity.ok().body(list); // retorno do corpo da resposta
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Order> findById(@PathVariable Long id) {
        Order obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }

}
