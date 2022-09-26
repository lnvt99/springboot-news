package com.example.news.service;

import com.example.news.dto.NewDTO;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface INewsServices {
    NewDTO save(NewDTO newDTO);

    void delete(long[] ids);

    List<NewDTO> findAll(Pageable pageable);

    List<NewDTO> findAll();

    int totalItem();
}
