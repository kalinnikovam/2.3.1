package com.example.web.service;

import java.util.List;
import com.example.web.models.User;
public interface UserService {

    List<User> getAllUsers();

    User getUserById(long id);

    void add(User user);

    void update(Long id, User newUser);

    void delete(long id);

}
