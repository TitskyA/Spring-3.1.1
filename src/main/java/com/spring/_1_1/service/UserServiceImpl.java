package com.spring._1_1.service;

import com.spring._1_1.model.User;
import com.spring._1_1.repository.UserRepositoryImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepositoryImpl userRepository;

    public UserServiceImpl(UserRepositoryImpl userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User get(Long id) {
        return userRepository.get(id);
    }

    @Override
    public List<User> listUsers() { return userRepository.listUsers(); }

    @Override
    @Transactional
    public void add(User user) {
        userRepository.add(user);
    }

    @Override
    @Transactional
    public void update(User user) { userRepository.update(user); }

    @Override
    @Transactional
    public void delete(Long id) {
        userRepository.delete(id);
    }
}
