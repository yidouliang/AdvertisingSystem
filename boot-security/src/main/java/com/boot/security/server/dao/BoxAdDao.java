package com.boot.security.server.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.boot.security.server.model.BoxAd;

@Mapper
public interface BoxAdDao {

    @Select("select * from box_ad t where t.id = #{id}")
    BoxAd getById(Long id);

    @Delete("delete from box_ad where id = #{id}")
    int delete(Long id);

    int update(BoxAd boxAd);
    
    @Options(useGeneratedKeys = true, keyProperty = "id")
    @Insert("insert into box_ad(boxcode, adid, adsensetype, begintime, endtime, adplayroleid, satatus) values(#{boxcode}, #{adid}, #{adsensetype}, #{begintime}, #{endtime}, #{adplayroleid}, #{satatus})")
    int save(BoxAd boxAd);
    
    int count(@Param("params") Map<String, Object> params);

    List<BoxAd> list(@Param("params") Map<String, Object> params, @Param("offset") Integer offset, @Param("limit") Integer limit);
}
