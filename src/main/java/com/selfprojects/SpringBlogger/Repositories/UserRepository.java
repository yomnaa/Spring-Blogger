package com.selfprojects.SpringBlogger.Repositories;

import com.selfprojects.SpringBlogger.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Long> {
    Optional<User> findByUserName(String username);
}
