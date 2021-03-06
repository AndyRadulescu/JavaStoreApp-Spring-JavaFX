package com.AndyRadulescu.store.repository;

import com.AndyRadulescu.store.model.User;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;

public interface UserRepository extends CrudRepository<User, Long> {

    @Transactional
    User findUserById(long id);

    User findUserByUserName(String name);
}
