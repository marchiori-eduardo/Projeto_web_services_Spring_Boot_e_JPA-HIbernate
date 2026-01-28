package com.marchiori_eduardo.projeto_web.repositories;

import com.marchiori_eduardo.projeto_web.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

//opcional adicionar anotation, ja esta herdando do jpaRepository o registro de componente do spring
public interface UserRepository extends JpaRepository<User, Long> {

}
