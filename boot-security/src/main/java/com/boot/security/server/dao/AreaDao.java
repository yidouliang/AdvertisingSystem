package com.boot.security.server.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.boot.security.server.model.Area;

@Mapper
public interface AreaDao {

    @Select("select * from area t where t.id = #{id}")
    Area getById(Long id);

    @Delete("delete from area where id = #{id}")
    int delete(Long id);

    int update(Area area);
    
    @Options(useGeneratedKeys = true, keyProperty = "id")
    @Insert("insert into area(name, pid) values(#{name}, #{pid})")
    int save(Area area);
    
    int count(@Param("params") Map<String, Object> params);

    List<Area> list(@Param("params") Map<String, Object> params, @Param("offset") Integer offset, @Param("limit") Integer limit);
}
