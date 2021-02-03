package com.manager.repository;

import com.manager.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Users, Integer> {
    Users findByEmailAndPassword(String email, String password);
    Users findByEmail(String email);
}
