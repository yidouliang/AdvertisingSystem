package com.boot.security.server.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.boot.security.server.model.BoxAdsense;

@Mapper
public interface BoxAdsenseDao {

    @Select("select * from box_adsense t where t.id = #{id}")
    BoxAdsense getById(Long id);

    @Delete("delete from box_adsense where id = #{id}")
    int delete(Long id);

    int update(BoxAdsense boxAdsense);
    
    @Options(useGeneratedKeys = true, keyProperty = "id")
    @Insert("insert into box_adsense(boxcode, adsensetype, adsensestatus) values(#{boxcode}, #{adsensetype}, #{adsensestatus})")
    int save(BoxAdsense boxAdsense);
    
    int count(@Param("params") Map<String, Object> params);

    List<BoxAdsense> list(@Param("params") Map<String, Object> params, @Param("offset") Integer offset, @Param("limit") Integer limit);
}
