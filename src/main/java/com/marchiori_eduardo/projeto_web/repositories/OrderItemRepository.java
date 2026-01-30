package com.marchiori_eduardo.projeto_web.repositories;

import com.marchiori_eduardo.projeto_web.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

//opcional adicionar anotation, ja esta herdando do jpaRepository o registro de componente do spring
public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
