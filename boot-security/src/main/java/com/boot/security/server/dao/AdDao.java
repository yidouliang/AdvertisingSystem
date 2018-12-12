package com.boot.security.server.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.boot.security.server.model.Ad;

@Mapper
public interface AdDao {

    @Select("select * from ad t where t.id = #{id}")
    Ad getById(Long id);

    @Delete("delete from ad where id = #{id}")
    int delete(Long id);

    int update(Ad ad);
    
    @Options(useGeneratedKeys = true, keyProperty = "id")
    @Insert("insert into ad(assessorid, assessorname, companyid, companyname, adplayroleid, adname, adurl, adcoverurl, adalt, adnote, adsort, adprice, adduration, datastate, createtime, updatetime) values(#{assessorid}, #{assessorname}, #{companyid}, #{companyname}, #{adplayroleid}, #{adname}, #{adurl}, #{adcoverurl}, #{adalt}, #{adnote}, #{adsort}, #{adprice}, #{adduration}, #{datastate}, #{createtime}, #{updatetime})")
    int save(Ad ad);
    
    int count(@Param("params") Map<String, Object> params);

    List<Ad> list(@Param("params") Map<String, Object> params, @Param("offset") Integer offset, @Param("limit") Integer limit);
}
