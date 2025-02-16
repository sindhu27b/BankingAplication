package com.org.projects.repository;

import com.org.projects.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    //User table primary key is->id, so datatype of  Id is Long.Hence used above
     Boolean existsByEmail(String email);
     Boolean existsByAccountNumber(String accountNumber);
     User findByAccountNumber(String accountNumber);


    Optional<User> findByEmail(String email);
}
