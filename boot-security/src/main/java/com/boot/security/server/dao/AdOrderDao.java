package com.boot.security.server.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.boot.security.server.model.AdOrder;

@Mapper
public interface AdOrderDao {

    @Select("select * from ad_order t where t.id = #{id}")
    AdOrder getById(Long id);

    @Delete("delete from ad_order where id = #{id}")
    int delete(Long id);

    int update(AdOrder adOrder);
    
    @Options(useGeneratedKeys = true, keyProperty = "id")
    @Insert("insert into ad_order(orderserialnumber, operatorid, operatorname, adconsumerid, adconsumername, companyid, companyname, payment, paytype, paytime, paystatus, payurl, failreason, payserialnumber, createtime, updatetime, datastate) values(#{orderserialnumber}, #{operatorid}, #{operatorname}, #{adconsumerid}, #{adconsumername}, #{companyid}, #{companyname}, #{payment}, #{paytype}, #{paytime}, #{paystatus}, #{payurl}, #{failreason}, #{payserialnumber}, #{createtime}, #{updatetime}, #{datastate})")
    int save(AdOrder adOrder);
    
    int count(@Param("params") Map<String, Object> params);

    List<AdOrder> list(@Param("params") Map<String, Object> params, @Param("offset") Integer offset, @Param("limit") Integer limit);
}
