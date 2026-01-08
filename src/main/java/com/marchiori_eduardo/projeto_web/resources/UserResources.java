package com.marchiori_eduardo.projeto_web.resources;

import com.marchiori_eduardo.projeto_web.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController//declaração de que esta classe é um recurso web
@RequestMapping(value = "/users")//nome do recurso + o caminho do recurso
public class UserResources {

    @GetMapping //indicação de que o metodo responde a requisição http
    public ResponseEntity<User> findAll() {
        User u =  new User(1L, "Maria", "maria@gmail.com", "999999999", "12345");
        return ResponseEntity.ok().body(u); // retorno do corpo da resposta
    }
}
