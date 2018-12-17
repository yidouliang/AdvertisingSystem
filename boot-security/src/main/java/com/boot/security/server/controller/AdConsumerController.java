package com.boot.security.server.controller;

import java.util.List;

import com.boot.security.server.dto.AdConsumerDTO;
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
import com.boot.security.server.dao.AdConsumerDao;
import com.boot.security.server.model.AdConsumer;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/adConsumers")
public class AdConsumerController {

    @Autowired
    private AdConsumerDao adConsumerDao;

    @PostMapping
    @ApiOperation(value = "保存")
    public AdConsumer save(@RequestBody AdConsumer adConsumer) {
        adConsumerDao.save(adConsumer);

        return adConsumer;
    }

    @GetMapping("/{id}")
    @ApiOperation(value = "根据id获取")
    public AdConsumer get(@PathVariable Long id) {
        return adConsumerDao.getById(id);
    }

    @PutMapping
    @ApiOperation(value = "修改")
    public AdConsumer update(@RequestBody AdConsumer adConsumer) {
        adConsumerDao.update(adConsumer);

        return adConsumer;
    }

    @GetMapping
    @ApiOperation(value = "列表")
    public PageTableResponse list(PageTableRequest request) {
        return new PageTableHandler(new CountHandler() {

            @Override
            public int count(PageTableRequest request) {
                return adConsumerDao.count(request.getParams());
            }
        }, new ListHandler() {

            @Override
            public List<AdConsumerDTO> list(PageTableRequest request) {
                return adConsumerDao.list(request.getParams(), request.getOffset(), request.getLimit());
            }
        }).handle(request);
    }

    @DeleteMapping("/{id}")
    @ApiOperation(value = "删除")
    public void delete(@PathVariable Long id) {
        adConsumerDao.delete(id);
    }
}
