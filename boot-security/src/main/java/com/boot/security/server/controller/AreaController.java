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
import com.boot.security.server.dao.AreaDao;
import com.boot.security.server.model.Area;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/areas")
public class AreaController {

    @Autowired
    private AreaDao areaDao;

    @PostMapping
    @ApiOperation(value = "保存")
    public Area save(@RequestBody Area area) {
        areaDao.save(area);

        return area;
    }

    @GetMapping("/{id}")
    @ApiOperation(value = "根据id获取")
    public Area get(@PathVariable Long id) {
        return areaDao.getById(id);
    }

    @PutMapping
    @ApiOperation(value = "修改")
    public Area update(@RequestBody Area area) {
        areaDao.update(area);

        return area;
    }

    @GetMapping
    @ApiOperation(value = "列表")
    public PageTableResponse list(PageTableRequest request) {
        return new PageTableHandler(new CountHandler() {

            @Override
            public int count(PageTableRequest request) {
                return areaDao.count(request.getParams());
            }
        }, new ListHandler() {

            @Override
            public List<Area> list(PageTableRequest request) {
                return areaDao.list(request.getParams(), request.getOffset(), request.getLimit());
            }
        }).handle(request);
    }

    @DeleteMapping("/{id}")
    @ApiOperation(value = "删除")
    public void delete(@PathVariable Long id) {
        areaDao.delete(id);
    }
}
