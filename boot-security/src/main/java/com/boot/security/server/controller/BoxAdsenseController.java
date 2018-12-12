package com.boot.security.server.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.boot.security.server.page.table.PageTableRequest;
import com.boot.security.server.page.table.PageTableHandler;
import com.boot.security.server.page.table.PageTableResponse;
import com.boot.security.server.page.table.PageTableHandler.CountHandler;
import com.boot.security.server.page.table.PageTableHandler.ListHandler;
import com.boot.security.server.dao.BoxAdsenseDao;
import com.boot.security.server.model.BoxAdsense;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/boxAdsenses")
public class BoxAdsenseController {

    @Autowired
    private BoxAdsenseDao boxAdsenseDao;

    @PostMapping
    @ApiOperation(value = "保存")
    public BoxAdsense save(@RequestBody BoxAdsense boxAdsense) {
        boxAdsenseDao.save(boxAdsense);

        return boxAdsense;
    }

    @GetMapping("/{id}")
    @ApiOperation(value = "根据id获取")
    public BoxAdsense get(@PathVariable Long id) {
        return boxAdsenseDao.getById(id);
    }

    @PutMapping
    @ApiOperation(value = "修改")
    public BoxAdsense update(@RequestBody BoxAdsense boxAdsense) {
        boxAdsenseDao.update(boxAdsense);

        return boxAdsense;
    }

    @GetMapping
    @ApiOperation(value = "列表")
    public PageTableResponse list(PageTableRequest request) {
        return new PageTableHandler(new CountHandler() {

            @Override
            public int count(PageTableRequest request) {
                return boxAdsenseDao.count(request.getParams());
            }
        }, new ListHandler() {

            @Override
            public List<BoxAdsense> list(PageTableRequest request) {
                return boxAdsenseDao.list(request.getParams(), request.getOffset(), request.getLimit());
            }
        }).handle(request);
    }

    @DeleteMapping("/{id}")
    @ApiOperation(value = "删除")
    public void delete(@PathVariable Long id) {
        boxAdsenseDao.delete(id);
    }
}
