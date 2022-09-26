package com.example.news.repository;

import com.example.news.dto.NewDTO;
import com.example.news.entity.NewsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface INewsRepository extends JpaRepository<NewsEntity, Long> {

}
