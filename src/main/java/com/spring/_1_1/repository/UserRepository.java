package com.spring._1_1.repository;

import com.spring._1_1.model.User;
import org.springframework.data.repository.CrudRepository;


public interface UserRepository extends CrudRepository<User, Long> {

}
