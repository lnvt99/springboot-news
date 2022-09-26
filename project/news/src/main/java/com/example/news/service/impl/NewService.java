package com.example.news.service.impl;

import com.example.news.converter.NewConverter;
import com.example.news.dto.NewDTO;
import com.example.news.entity.CategoryEntity;
import com.example.news.entity.NewsEntity;
import com.example.news.repository.ICategoryRepository;
import com.example.news.repository.INewsRepository;
import com.example.news.service.INewsServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class NewService implements INewsServices {

    @Autowired
    private INewsRepository newsRepository;

    @Autowired
    private ICategoryRepository categoryRepository;

    @Autowired
    private NewConverter newConverter;

    @Override
    public NewDTO save(NewDTO newDTO) {
        NewsEntity newsEntity = new NewsEntity();
        if(newDTO.getId() != null) {
            NewsEntity oldNewsEntity = newsRepository.findById(newDTO.getId()).orElse(null);
            newsEntity = newConverter.toEntity(newDTO, oldNewsEntity);
        }
        else {
            newsEntity = newConverter.toEntity(newDTO);
        }
        CategoryEntity categoryEntity  = categoryRepository.findOneByCode(newDTO.getCategoryCode());
        newsEntity.setCategory(categoryEntity);
        newsEntity = newsRepository.save(newsEntity);
        return newConverter.toDTO(newsEntity);
    }

    @Override
    public void delete(long[] ids) {
        for(long item: ids) {
            newsRepository.deleteById(item);
        }
    }

    @Override
    public List<NewDTO> findAll(Pageable pageable) {
        List<NewDTO> results = new ArrayList<>();
        List<NewsEntity> entities = newsRepository.findAll(pageable).getContent();
        for (NewsEntity item: entities) {
            NewDTO newDTO = newConverter.toDTO(item);
            results.add(newDTO);
        }
        return results;
    }

    @Override
    public List<NewDTO> findAll() {
        List<NewDTO> results = new ArrayList<>();
        List<NewsEntity> entities = newsRepository.findAll();
        for (NewsEntity item: entities) {
            NewDTO newDTO = newConverter.toDTO(item);
            results.add(newDTO);
        }
        return results;
    }

    @Override
    public int totalItem() {
        return (int) newsRepository.count();
    }

//    @Override
//    public NewDTO update(NewDTO newDTO) {
//        NewsEntity newsEntity = newConverter.toEntity(newDTO, oldNewsEntity);
//        CategoryEntity categoryEntity  = categoryRepository.findOneByCode(newDTO.getCategoryCode());
//        newsEntity.setCategory(categoryEntity);
//        newsEntity = newsRepository.save()
//        return null;
//    }
}
