package com.spring._1_1.repository;

import com.spring._1_1.model.User;

import java.util.List;

public interface UserRepository {

    User get(Long id);

    List<User> listUsers();

    void add(User user);

    void update(User user);

    void delete(Long id);

}
