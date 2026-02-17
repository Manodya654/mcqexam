package com.mcqexam.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.mcqexam.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}