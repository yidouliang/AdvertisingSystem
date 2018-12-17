package com.boot.security.server.dao;

import java.util.List;
import java.util.Map;

import com.boot.security.server.dto.AdPlayRoleDTO;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.boot.security.server.model.AdPlayRole;

@Mapper
public interface AdPlayRoleDao {

    @Select("select * from ad_play_role t where t.id = #{id}")
    AdPlayRole getById(Long id);

    @Delete("delete from ad_play_role where id = #{id}")
    int delete(Long id);

    int update(AdPlayRole adPlayRole);
    
    @Options(useGeneratedKeys = true, keyProperty = "id")
    @Insert("insert into ad_play_role(adtype, adplaytimeid, intervaltime) values(#{adtype}, #{adplaytimeid}, #{intervaltime})")
    int save(AdPlayRole adPlayRole);
    
    int count(@Param("params") Map<String, Object> params);

    List<AdPlayRoleDTO> list(@Param("params") Map<String, Object> params, @Param("offset") Integer offset, @Param("limit") Integer limit);
}
