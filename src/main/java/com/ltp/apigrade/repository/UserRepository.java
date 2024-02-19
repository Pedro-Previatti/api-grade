package com.ltp.apigrade.repository;

import org.springframework.data.repository.CrudRepository;

import com.ltp.apigrade.entity.User;

public interface UserRepository extends CrudRepository<User, Long> {
    User findByUsername(String username);
}
