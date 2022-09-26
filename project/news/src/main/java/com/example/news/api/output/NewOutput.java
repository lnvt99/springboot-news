package com.example.news.api.output;

import com.example.news.dto.NewDTO;

import java.util.ArrayList;
import java.util.List;

public class NewOutput {
    private Integer page;
    private Integer totalPage;
    private List<NewDTO> listResult = new ArrayList<>();


    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
    }

    public List<NewDTO> getListResult() {
        return listResult;
    }

    public void setListResult(List<NewDTO> listResult) {
        this.listResult = listResult;
    }
}
