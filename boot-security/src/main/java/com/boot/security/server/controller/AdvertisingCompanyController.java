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
import com.boot.security.server.dao.AdvertisingCompanyDao;
import com.boot.security.server.model.AdvertisingCompany;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/advertisingCompanys")
public class AdvertisingCompanyController {

    @Autowired
    private AdvertisingCompanyDao advertisingCompanyDao;

    @PostMapping
    @ApiOperation(value = "保存")
    public AdvertisingCompany save(@RequestBody AdvertisingCompany advertisingCompany) {
        advertisingCompanyDao.save(advertisingCompany);

        return advertisingCompany;
    }

    @GetMapping("/{id}")
    @ApiOperation(value = "根据id获取")
    public AdvertisingCompany get(@PathVariable Long id) {
        return advertisingCompanyDao.getById(id);
    }

    @PutMapping
    @ApiOperation(value = "修改")
    public AdvertisingCompany update(@RequestBody AdvertisingCompany advertisingCompany) {
        advertisingCompanyDao.update(advertisingCompany);

        return advertisingCompany;
    }

    @GetMapping
    @ApiOperation(value = "列表")
    public PageTableResponse list(PageTableRequest request) {
        return new PageTableHandler(new CountHandler() {

            @Override
            public int count(PageTableRequest request) {
                return advertisingCompanyDao.count(request.getParams());
            }
        }, new ListHandler() {

            @Override
            public List<AdvertisingCompany> list(PageTableRequest request) {
                return advertisingCompanyDao.list(request.getParams(), request.getOffset(), request.getLimit());
            }
        }).handle(request);
    }

    @DeleteMapping("/{id}")
    @ApiOperation(value = "删除")
    public void delete(@PathVariable Long id) {
        advertisingCompanyDao.delete(id);
    }
}
