package org.javanelio.joao.repositories;

import org.javanelio.joao.entities.Order;
import org.javanelio.joao.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface OrderRepository extends JpaRepository<Order, Long> {

}
