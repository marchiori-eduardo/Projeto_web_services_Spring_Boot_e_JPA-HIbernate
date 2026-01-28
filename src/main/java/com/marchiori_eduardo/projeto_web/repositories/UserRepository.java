package com.marchiori_eduardo.projeto_web.repositories;

import com.marchiori_eduardo.projeto_web.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
