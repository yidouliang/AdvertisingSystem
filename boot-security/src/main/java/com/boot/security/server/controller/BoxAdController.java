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
import com.boot.security.server.dao.BoxAdDao;
import com.boot.security.server.model.BoxAd;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/boxAds")
public class BoxAdController {

    @Autowired
    private BoxAdDao boxAdDao;

    @PostMapping
    @ApiOperation(value = "保存")
    public BoxAd save(@RequestBody BoxAd boxAd) {
        boxAdDao.save(boxAd);

        return boxAd;
    }

    @GetMapping("/{id}")
    @ApiOperation(value = "根据id获取")
    public BoxAd get(@PathVariable Long id) {
        return boxAdDao.getById(id);
    }

    @PutMapping
    @ApiOperation(value = "修改")
    public BoxAd update(@RequestBody BoxAd boxAd) {
        boxAdDao.update(boxAd);

        return boxAd;
    }

    @GetMapping
    @ApiOperation(value = "列表")
    public PageTableResponse list(PageTableRequest request) {
        return new PageTableHandler(new CountHandler() {

            @Override
            public int count(PageTableRequest request) {
                return boxAdDao.count(request.getParams());
            }
        }, new ListHandler() {

            @Override
            public List<BoxAd> list(PageTableRequest request) {
                return boxAdDao.list(request.getParams(), request.getOffset(), request.getLimit());
            }
        }).handle(request);
    }

    @DeleteMapping("/{id}")
    @ApiOperation(value = "删除")
    public void delete(@PathVariable Long id) {
        boxAdDao.delete(id);
    }
}
