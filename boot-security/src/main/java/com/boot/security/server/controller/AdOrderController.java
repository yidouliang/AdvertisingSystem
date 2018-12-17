package com.boot.security.server.controller;

import java.util.Date;
import java.util.List;

import com.boot.security.server.dto.AdOrderDto;
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
import com.boot.security.server.dao.AdOrderDao;
import com.boot.security.server.model.AdOrder;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/adOrders")
public class AdOrderController {

    @Autowired
    private AdOrderDao adOrderDao;

    @PostMapping
    @ApiOperation(value = "保存")
    public AdOrder save(@RequestBody AdOrder adOrder) {
        adOrder.setCreatetime(new Date());
        adOrder.setUpdatetime(adOrder.getCreateTime());
        adOrder.setDatastate(1);
        adOrderDao.save(adOrder);

        return adOrder;
    }

    @GetMapping("/{id}")
    @ApiOperation(value = "根据id获取")
    public AdOrder get(@PathVariable Long id) {
        return adOrderDao.getById(id);
    }

    @PutMapping
    @ApiOperation(value = "修改")
    public AdOrder update(@RequestBody AdOrder adOrder) {
        adOrder.setUpdatetime(adOrder.getCreateTime());
        adOrderDao.update(adOrder);

        return adOrder;
    }

    @GetMapping
    @ApiOperation(value = "列表")
    public PageTableResponse list(PageTableRequest request) {
        return new PageTableHandler(new CountHandler() {

            @Override
            public int count(PageTableRequest request) {
                return adOrderDao.count(request.getParams());
            }
        }, new ListHandler() {

            @Override
            public List<AdOrderDto> list(PageTableRequest request) {

                return adOrderDao.list(request.getParams(), request.getOffset(), request.getLimit());
            }
        }).handle(request);
    }

    @DeleteMapping("/{id}")
    @ApiOperation(value = "删除")
    public void delete(@PathVariable Long id) {
        adOrderDao.delete(id);
    }
}
