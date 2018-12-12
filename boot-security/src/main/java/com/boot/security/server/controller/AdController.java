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
import com.boot.security.server.dao.AdDao;
import com.boot.security.server.model.Ad;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/ads")
public class AdController {

    @Autowired
    private AdDao adDao;

    @PostMapping
    @ApiOperation(value = "保存")
    public Ad save(@RequestBody Ad ad) {
        adDao.save(ad);

        return ad;
    }

    @GetMapping("/{id}")
    @ApiOperation(value = "根据id获取")
    public Ad get(@PathVariable Long id) {
        return adDao.getById(id);
    }

    @PutMapping
    @ApiOperation(value = "修改")
    public Ad update(@RequestBody Ad ad) {
        adDao.update(ad);

        return ad;
    }

    @GetMapping
    @ApiOperation(value = "列表")
    public PageTableResponse list(PageTableRequest request) {
        return new PageTableHandler(new CountHandler() {

            @Override
            public int count(PageTableRequest request) {
                return adDao.count(request.getParams());
            }
        }, new ListHandler() {

            @Override
            public List<Ad> list(PageTableRequest request) {
                return adDao.list(request.getParams(), request.getOffset(), request.getLimit());
            }
        }).handle(request);
    }

    @DeleteMapping("/{id}")
    @ApiOperation(value = "删除")
    public void delete(@PathVariable Long id) {
        adDao.delete(id);
    }
}
