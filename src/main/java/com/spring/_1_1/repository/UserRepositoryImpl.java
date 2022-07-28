package com.spring._1_1.repository;

import com.spring._1_1.model.User;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class UserRepositoryImpl implements UserRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public User get(Long id) {
        return entityManager.find(User.class, id);
    }

    @Override
    public List<User> listUsers() {
        return entityManager.createQuery("SELECT u FROM User u ", User.class).getResultList();
    }

    @Override
    public void add(User user) { entityManager.persist(user); }

    @Override
    public void update(User user) { entityManager.merge(user); }

    @Override
    public void delete(Long id) {
        entityManager.remove(get(id));
    }
}
