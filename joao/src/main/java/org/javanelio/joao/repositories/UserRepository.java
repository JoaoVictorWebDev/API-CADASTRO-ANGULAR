package org.javanelio.joao.repositories;

import org.javanelio.joao.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface UserRepository extends JpaRepository<User, Long> {

}
