package com.boot.security.server.controller;

import java.util.List;

import com.boot.security.server.dto.AdvertisingRatesDTO;
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
import com.boot.security.server.dao.AdvertisingRatesDao;
import com.boot.security.server.model.AdvertisingRates;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/advertisingRatess")
public class AdvertisingRatesController {

    @Autowired
    private AdvertisingRatesDao advertisingRatesDao;

    @PostMapping
    @ApiOperation(value = "保存")
    public AdvertisingRates save(@RequestBody AdvertisingRates advertisingRates) {
        advertisingRatesDao.save(advertisingRates);

        return advertisingRates;
    }

    @GetMapping("/{id}")
    @ApiOperation(value = "根据id获取")
    public AdvertisingRates get(@PathVariable Long id) {
        return advertisingRatesDao.getById(id);
    }

    @PutMapping
    @ApiOperation(value = "修改")
    public AdvertisingRates update(@RequestBody AdvertisingRates advertisingRates) {
        advertisingRatesDao.update(advertisingRates);

        return advertisingRates;
    }

    @GetMapping
    @ApiOperation(value = "列表")
    public PageTableResponse list(PageTableRequest request) {
        return new PageTableHandler(new CountHandler() {

            @Override
            public int count(PageTableRequest request) {
                return advertisingRatesDao.count(request.getParams());
            }
        }, new ListHandler() {

            @Override
            public List<AdvertisingRatesDTO> list(PageTableRequest request) {
                return advertisingRatesDao.list(request.getParams(), request.getOffset(), request.getLimit());
            }
        }).handle(request);
    }

    @DeleteMapping("/{id}")
    @ApiOperation(value = "删除")
    public void delete(@PathVariable Long id) {
        advertisingRatesDao.delete(id);
    }
}
