package com.spring._1_1.service;

import com.spring._1_1.model.User;

import java.util.List;

public interface UserService {

    User get(Long id);

    List<User> listUsers();

    void add(User user);

    void delete(Long id);

}
