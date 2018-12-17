package com.boot.security.server.controller;

import java.util.List;

import com.boot.security.server.dto.AdPlayRoleDTO;
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
import com.boot.security.server.dao.AdPlayRoleDao;
import com.boot.security.server.model.AdPlayRole;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/adPlayRoles")
public class AdPlayRoleController {

    @Autowired
    private AdPlayRoleDao adPlayRoleDao;

    @PostMapping
    @ApiOperation(value = "保存")
    public AdPlayRole save(@RequestBody AdPlayRole adPlayRole) {
        adPlayRoleDao.save(adPlayRole);

        return adPlayRole;
    }

    @GetMapping("/{id}")
    @ApiOperation(value = "根据id获取")
    public AdPlayRole get(@PathVariable Long id) {
        return adPlayRoleDao.getById(id);
    }

    @PutMapping
    @ApiOperation(value = "修改")
    public AdPlayRole update(@RequestBody AdPlayRole adPlayRole) {
        adPlayRoleDao.update(adPlayRole);

        return adPlayRole;
    }

    @GetMapping
    @ApiOperation(value = "列表")
    public PageTableResponse list(PageTableRequest request) {
        return new PageTableHandler(new CountHandler() {

            @Override
            public int count(PageTableRequest request) {
                return adPlayRoleDao.count(request.getParams());
            }
        }, new ListHandler() {

            @Override
            public List<AdPlayRoleDTO> list(PageTableRequest request) {
                return adPlayRoleDao.list(request.getParams(), request.getOffset(), request.getLimit());
            }
        }).handle(request);
    }

    @DeleteMapping("/{id}")
    @ApiOperation(value = "删除")
    public void delete(@PathVariable Long id) {
        adPlayRoleDao.delete(id);
    }
}
