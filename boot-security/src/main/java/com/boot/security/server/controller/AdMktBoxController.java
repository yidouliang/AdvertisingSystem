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
import com.boot.security.server.dao.AdMktBoxDao;
import com.boot.security.server.model.AdMktBox;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/adMktBoxs")
public class AdMktBoxController {

    @Autowired
    private AdMktBoxDao adMktBoxDao;

    @PostMapping
    @ApiOperation(value = "保存")
    public AdMktBox save(@RequestBody AdMktBox adMktBox) {
        adMktBoxDao.save(adMktBox);

        return adMktBox;
    }

    @GetMapping("/{id}")
    @ApiOperation(value = "根据id获取")
    public AdMktBox get(@PathVariable Long id) {
        return adMktBoxDao.getById(id);
    }

    @PutMapping
    @ApiOperation(value = "修改")
    public AdMktBox update(@RequestBody AdMktBox adMktBox) {
        adMktBoxDao.update(adMktBox);

        return adMktBox;
    }

    @GetMapping
    @ApiOperation(value = "列表")
    public PageTableResponse list(PageTableRequest request) {
        return new PageTableHandler(new CountHandler() {

            @Override
            public int count(PageTableRequest request) {
                return adMktBoxDao.count(request.getParams());
            }
        }, new ListHandler() {

            @Override
            public List<AdMktBox> list(PageTableRequest request) {
                return adMktBoxDao.list(request.getParams(), request.getOffset(), request.getLimit());
            }
        }).handle(request);
    }

    @DeleteMapping("/{id}")
    @ApiOperation(value = "删除")
    public void delete(@PathVariable Long id) {
        adMktBoxDao.delete(id);
    }
}
