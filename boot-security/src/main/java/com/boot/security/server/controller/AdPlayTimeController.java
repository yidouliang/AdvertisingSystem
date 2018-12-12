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
import com.boot.security.server.dao.AdPlayTimeDao;
import com.boot.security.server.model.AdPlayTime;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/adPlayTimes")
public class AdPlayTimeController {

    @Autowired
    private AdPlayTimeDao adPlayTimeDao;

    @PostMapping
    @ApiOperation(value = "保存")
    public AdPlayTime save(@RequestBody AdPlayTime adPlayTime) {
        adPlayTimeDao.save(adPlayTime);

        return adPlayTime;
    }

    @GetMapping("/{id}")
    @ApiOperation(value = "根据id获取")
    public AdPlayTime get(@PathVariable Long id) {
        return adPlayTimeDao.getById(id);
    }

    @PutMapping
    @ApiOperation(value = "修改")
    public AdPlayTime update(@RequestBody AdPlayTime adPlayTime) {
        adPlayTimeDao.update(adPlayTime);

        return adPlayTime;
    }

    @GetMapping
    @ApiOperation(value = "列表")
    public PageTableResponse list(PageTableRequest request) {
        return new PageTableHandler(new CountHandler() {

            @Override
            public int count(PageTableRequest request) {
                return adPlayTimeDao.count(request.getParams());
            }
        }, new ListHandler() {

            @Override
            public List<AdPlayTime> list(PageTableRequest request) {
                return adPlayTimeDao.list(request.getParams(), request.getOffset(), request.getLimit());
            }
        }).handle(request);
    }

    @DeleteMapping("/{id}")
    @ApiOperation(value = "删除")
    public void delete(@PathVariable Long id) {
        adPlayTimeDao.delete(id);
    }
}
