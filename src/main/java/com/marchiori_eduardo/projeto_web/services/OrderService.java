package com.marchiori_eduardo.projeto_web.services;

import com.marchiori_eduardo.projeto_web.entities.Order;
import com.marchiori_eduardo.projeto_web.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service //identificacao como um componente do spring, para poder ser injetado automaticamente
public class OrderService {

    @Autowired
    private OrderRepository Repository;

    public List<Order> findALl() {
        return Repository.findAll();
    }

    public Order findById(Long id) {
        Optional<Order> obj = Repository.findById(id);
        return obj.get();
    }
}
