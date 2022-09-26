package com.example.news.api;

import com.example.news.api.output.NewOutput;
import com.example.news.dto.NewDTO;
import com.example.news.service.INewsServices;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;


@RestController
public class NewsAPI {

    @Autowired
    private INewsServices newsServices;

    @GetMapping(value = "/new")
    public NewOutput showNew(@RequestParam(value = "page", required = false) Integer page, @RequestParam(value = "limit", required = false) Integer limit) {
        NewOutput result = new NewOutput();
        if (page != null && limit != null) {
            result.setPage(page);
            Pageable pageable = PageRequest.of(page - 1, limit);
            result.setListResult(newsServices.findAll(pageable));
            result.setTotalPage((int) Math.ceil((double) (newsServices.totalItem()) / limit));
        } else {
            result.setListResult(newsServices.findAll());
        }

        return result;
    }

    @PostMapping(value = "/new")
    public NewDTO createNew(@RequestBody NewDTO model) {
        return newsServices.save(model);
    }

    @PutMapping(value = "/new/{id}")
    public NewDTO updateNew(@RequestBody NewDTO model, @PathVariable("id") long id) {
        model.setId(id);
        return newsServices.save(model);
    }

    @DeleteMapping(value = "/new")
    public NewDTO deleteNew(@RequestBody long[] ids) {
        newsServices.delete(ids);
        return null;
    }


}
