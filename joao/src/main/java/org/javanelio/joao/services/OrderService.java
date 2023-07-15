package org.javanelio.joao.services;

import org.javanelio.joao.entities.Order;
import org.javanelio.joao.entities.User;
import org.javanelio.joao.repositories.OrderRepository;
import org.javanelio.joao.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;
    public List<Order> findAll() {
        return orderRepository.findAll();
    }

    public Order findById(Long id){
       Optional<Order> obj = orderRepository.findById(id);
       return obj.get();
    }
}
