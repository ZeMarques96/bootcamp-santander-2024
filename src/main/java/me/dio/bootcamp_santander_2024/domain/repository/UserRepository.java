package me.dio.bootcamp_santander_2024.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import me.dio.bootcamp_santander_2024.domain.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
