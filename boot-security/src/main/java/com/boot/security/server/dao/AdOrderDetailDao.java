package com.boot.security.server.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.boot.security.server.model.AdOrderDetail;

@Mapper
public interface AdOrderDetailDao {

    @Select("select * from ad_order_detail t where t.id = #{id}")
    AdOrderDetail getById(Long id);

    @Delete("delete from ad_order_detail where id = #{id}")
    int delete(Long id);

    int update(AdOrderDetail adOrderDetail);
    
    @Options(useGeneratedKeys = true, keyProperty = "id")
    @Insert("insert into ad_order_detail(adid, adname, adplayroleid, advertisingratesid, adorderid, begintime, endtime, payment, createtime, updatetime, datastate, areaname, boxcode, boxname, advertisingpositionid, areaid) values(#{adid}, #{adname}, #{adplayroleid}, #{advertisingratesid}, #{adorderid}, #{begintime}, #{endtime}, #{payment}, #{createtime}, #{updatetime}, #{datastate}, #{areaname}, #{boxcode}, #{boxname}, #{advertisingpositionid}, #{areaid})")
    int save(AdOrderDetail adOrderDetail);
    
    int count(@Param("params") Map<String, Object> params);

    List<AdOrderDetail> list(@Param("params") Map<String, Object> params, @Param("offset") Integer offset, @Param("limit") Integer limit);
}
