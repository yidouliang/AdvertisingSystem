package com.boot.security.server.controller;

import java.util.List;

import com.boot.security.server.dto.AdRecordDTO;
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
import com.boot.security.server.dao.AdRecordDao;
import com.boot.security.server.model.AdRecord;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/adRecords")
public class AdRecordController {

    @Autowired
    private AdRecordDao adRecordDao;

    @PostMapping
    @ApiOperation(value = "保存")
    public AdRecord save(@RequestBody AdRecord adRecord) {
        adRecordDao.save(adRecord);

        return adRecord;
    }

    @GetMapping("/{id}")
    @ApiOperation(value = "根据id获取")
    public AdRecord get(@PathVariable Long id) {
        return adRecordDao.getById(id);
    }

    @PutMapping
    @ApiOperation(value = "修改")
    public AdRecord update(@RequestBody AdRecord adRecord) {
        adRecordDao.update(adRecord);

        return adRecord;
    }

    @GetMapping
    @ApiOperation(value = "列表")
    public PageTableResponse list(PageTableRequest request) {
        return new PageTableHandler(new CountHandler() {

            @Override
            public int count(PageTableRequest request) {
                return adRecordDao.count(request.getParams());
            }
        }, new ListHandler() {

            @Override
            public List<AdRecordDTO> list(PageTableRequest request) {
                return adRecordDao.list(request.getParams(), request.getOffset(), request.getLimit());
            }
        }).handle(request);
    }

    @DeleteMapping("/{id}")
    @ApiOperation(value = "删除")
    public void delete(@PathVariable Long id) {
        adRecordDao.delete(id);
    }
}
