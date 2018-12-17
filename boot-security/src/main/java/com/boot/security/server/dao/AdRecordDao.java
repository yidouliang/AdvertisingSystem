package com.boot.security.server.dao;

import java.util.List;
import java.util.Map;

import com.boot.security.server.dto.AdRecordDTO;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.boot.security.server.model.AdRecord;

@Mapper
public interface AdRecordDao {

    @Select("select * from ad_record t where t.id = #{id}")
    AdRecord getById(Long id);

    @Delete("delete from ad_record where id = #{id}")
    int delete(Long id);

    int update(AdRecord adRecord);
    
    @Options(useGeneratedKeys = true, keyProperty = "id")
    @Insert("insert into ad_record(boxcode, adid, adsensetype, playdate, adcount, adplayroleid) values(#{boxcode}, #{adid}, #{adsensetype}, #{playdate}, #{adcount}, #{adplayroleid})")
    int save(AdRecord adRecord);
    
    int count(@Param("params") Map<String, Object> params);

    List<AdRecordDTO> list(@Param("params") Map<String, Object> params, @Param("offset") Integer offset, @Param("limit") Integer limit);
}
