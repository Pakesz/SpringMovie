package com.example.demo.repository;

import com.example.demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    @Query(value = "select u from User u where u.status = :status")
    List<User> findByStatus(@Param("status") Integer status);

    @Query(value = "insert into u(u.name, u.email, u.password, i.status) values (:name, :email, :password, :status)")
    Boolean addNewUser(@Param("name") String name,@Param("email") String email,@Param("password") String password,@Param("status") Integer status);
}
