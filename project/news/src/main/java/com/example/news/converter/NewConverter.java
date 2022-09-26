package com.example.news.converter;

import com.example.news.dto.NewDTO;
import com.example.news.entity.NewsEntity;
import org.springframework.stereotype.Component;

@Component
public class NewConverter {

    public NewsEntity toEntity(NewDTO dto){
        NewsEntity entity = new NewsEntity();
        entity.setTitle(dto.getTitle());
        entity.setContent(dto.getContent());
        entity.setShortDescription(dto.getShortDescription());
        entity.setThumbnail(dto.getThumbnail());
        return entity;
    };

    public NewDTO toDTO(NewsEntity entity){
        NewDTO dto = new NewDTO();
        if (entity.getId() != null) {
            dto.setId(entity.getId());
        }
        dto.setTitle(entity.getTitle());
        dto.setContent(entity.getContent());
        dto.setShortDescription(entity.getShortDescription());
        dto.setThumbnail(entity.getThumbnail());
        dto.setCreatedDate(entity.getCreatedDate());
        dto.setCreatedBy(entity.getCreatedBy());
        dto.setModifiedDate(entity.getModifiedDate());
        dto.setModifiedBy(entity.getModifiedBy());
        dto.setCategoryCode(entity.getCategory().getCode());
        return dto;
    };

    public NewsEntity toEntity(NewDTO dto, NewsEntity entity){
        entity.setTitle(dto.getTitle());
        entity.setContent(dto.getContent());
        entity.setShortDescription(dto.getShortDescription());
        entity.setThumbnail(dto.getThumbnail());
        return entity;
    };
}
