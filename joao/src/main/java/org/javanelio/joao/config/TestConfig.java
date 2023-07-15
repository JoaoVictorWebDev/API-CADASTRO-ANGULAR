package org.javanelio.joao.config;

import org.javanelio.joao.entities.Order;
import org.javanelio.joao.entities.User;
import org.javanelio.joao.enums.OrderStatus;
import org.javanelio.joao.repositories.OrderRepository;
import org.javanelio.joao.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.Arrays;

import static org.javanelio.joao.enums.OrderStatus.PAID;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public void run(String... args)throws Exception{
        User u1 = new User(null, "Maria Brown", "maria@gmail.com", "2932932" , "1234560");
        User u2 = new User(null, "Charlie Brown", "Charlie@gmail.com", "2245932" , "1234560");
        Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), u1, OrderStatus.DELIVERED);
        Order o2 = new Order(null, Instant.parse("2010-04-20T19:53:07Z"), u2, OrderStatus.DELIVERED);

      userRepository.saveAll(Arrays.asList(u1,u2        ));
      orderRepository.saveAll(Arrays.asList(o1,o2));
    }
}
