package com.marchiori_eduardo.projeto_web.resources;

import com.marchiori_eduardo.projeto_web.entities.User;
import com.marchiori_eduardo.projeto_web.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController//declaração de que esta classe é um recurso web
@RequestMapping(value = "/users")//nome do recurso + o caminho do recurso
public class UserResources {

    @Autowired
    private UserService service;

    @GetMapping //indicação de que o metodo responde a requisição http
    public ResponseEntity<List<User>> findAll() {
        List<User> list = service.findALl();

        return ResponseEntity.ok().body(list); // retorno do corpo da resposta
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<User> findById(@PathVariable Long id) {
        User obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }

}
