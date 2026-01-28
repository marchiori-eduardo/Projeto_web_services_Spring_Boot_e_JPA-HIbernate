package com.marchiori_eduardo.projeto_web.repositories;

import com.marchiori_eduardo.projeto_web.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

//opcional adicionar anotation, ja esta herdando do jpaRepository o registro de componente do spring
public interface ProductRepository extends JpaRepository<Product, Long> {

}
