package com.example.demo.User;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends JpaRepository<UserDb, Long>{
	Optional<UserDb> findByUsername(String username);
}
