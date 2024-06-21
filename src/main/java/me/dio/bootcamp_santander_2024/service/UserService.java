package me.dio.bootcamp_santander_2024.service;

import me.dio.bootcamp_santander_2024.domain.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);
}
