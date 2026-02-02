package com.marchiori_eduardo.projeto_web.services;

import com.marchiori_eduardo.projeto_web.entities.User;
import com.marchiori_eduardo.projeto_web.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service //identificacao como um componente do spring, para poder ser injetado automaticamente
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<User> findALl() {
        return repository.findAll();
    }

    public User findById(Long id) {
        Optional<User> obj = repository.findById(id);
        return obj.get();
    }

    public User insert(User obj) {
        return repository.save(obj);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
