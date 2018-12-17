package com.boot.security.server.controller;

import java.util.Date;
import java.util.List;

import com.boot.security.server.dto.AdOrderDetailDto;
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
import com.boot.security.server.dao.AdOrderDetailDao;
import com.boot.security.server.model.AdOrderDetail;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/adOrderDetails")
public class AdOrderDetailController {

    @Autowired
    private AdOrderDetailDao adOrderDetailDao;

    @PostMapping
    @ApiOperation(value = "保存")
    public AdOrderDetail save(@RequestBody AdOrderDetail adOrderDetail) {
        adOrderDetail.setCreatetime(new Date());
        adOrderDetail.setUpdatetime(adOrderDetail.getCreateTime());
        adOrderDetail.setDatastate(1);
        adOrderDetailDao.save(adOrderDetail);

        return adOrderDetail;
    }

    @GetMapping("/{id}")
    @ApiOperation(value = "根据id获取")
    public AdOrderDetail get(@PathVariable Long id) {
        return adOrderDetailDao.getById(id);
    }

    @PutMapping
    @ApiOperation(value = "修改")
    public AdOrderDetail update(@RequestBody AdOrderDetail adOrderDetail) {
        adOrderDetail.setUpdatetime(adOrderDetail.getCreateTime());
        adOrderDetailDao.update(adOrderDetail);

        return adOrderDetail;
    }

    @GetMapping
    @ApiOperation(value = "列表")
    public PageTableResponse list(PageTableRequest request) {
        return new PageTableHandler(new CountHandler() {

            @Override
            public int count(PageTableRequest request) {
                return adOrderDetailDao.count(request.getParams());
            }
        }, new ListHandler() {

            @Override
            public List<AdOrderDetailDto> list(PageTableRequest request) {
                return adOrderDetailDao.list(request.getParams(), request.getOffset(), request.getLimit());
            }
        }).handle(request);
    }

    @DeleteMapping("/{id}")
    @ApiOperation(value = "删除")
    public void delete(@PathVariable Long id) {
        adOrderDetailDao.delete(id);
    }
}
