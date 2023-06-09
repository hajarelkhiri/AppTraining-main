package com.supportportal.repository;

import com.supportportal.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {

    User findUserByUsername(String username);

    User findUserByEmail(String email);
    User findTopByOrderByIdDesc();

    List<User> findByActivity(String activity);

}
