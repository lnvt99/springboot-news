package com.example.news.repository;

import com.example.news.entity.DAOUser;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserDao extends CrudRepository<DAOUser, Integer> {
    DAOUser findByUsername(String username);
}
