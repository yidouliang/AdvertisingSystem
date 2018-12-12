package com.boot.security.server.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.boot.security.server.model.AdPlayTime;

@Mapper
public interface AdPlayTimeDao {

    @Select("select * from ad_play_time t where t.id = #{id}")
    AdPlayTime getById(Long id);

    @Delete("delete from ad_play_time where id = #{id}")
    int delete(Long id);

    int update(AdPlayTime adPlayTime);
    
    @Options(useGeneratedKeys = true, keyProperty = "id")
    @Insert("insert into ad_play_time(begintime, endtime) values(#{begintime}, #{endtime})")
    int save(AdPlayTime adPlayTime);
    
    int count(@Param("params") Map<String, Object> params);

    List<AdPlayTime> list(@Param("params") Map<String, Object> params, @Param("offset") Integer offset, @Param("limit") Integer limit);
}
