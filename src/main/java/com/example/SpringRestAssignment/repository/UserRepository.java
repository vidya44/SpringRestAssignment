package com.example.SpringRestAssignment.repository;



import com.example.SpringRestAssignment.bean.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {
    User findByName(String name);
}

