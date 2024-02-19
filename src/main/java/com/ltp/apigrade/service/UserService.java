package com.ltp.apigrade.service;

import com.ltp.apigrade.entity.User;

public interface UserService {
    User getUser(Long id);
    User getUser(String username);
    User saveUser(User user);
}
