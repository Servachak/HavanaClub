package com.HavanaClub.service;

import com.HavanaClub.entity.User;

import java.security.Principal;
import java.util.List;

public interface UserService {

    void save(User user) throws Exception;

    List<User> findAll();

    User findOne(int id);

    void delete(int id);

    void update(User user);

    User findUserWithOrders(int id);

    User findUserWithDrinks(int id);

    User findByName(String name);

    User findByUuid(String uuid);

    User findUserByNameWithDrinks(String name);
}
