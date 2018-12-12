package com.boot.security.server.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.boot.security.server.model.AdMktBox;

@Mapper
public interface AdMktBoxDao {

    @Select("select * from ad_mkt_box t where t.id = #{id}")
    AdMktBox getById(Long id);

    @Delete("delete from ad_mkt_box where id = #{id}")
    int delete(Long id);

    int update(AdMktBox adMktBox);
    
    @Options(useGeneratedKeys = true, keyProperty = "id")
    @Insert("insert into ad_mkt_box(boxname, boxcode, boxtype, boxperson, address, status, factorydate, persontelphone, longitude, latitude, areaid, areaname) values(#{boxname}, #{boxcode}, #{boxtype}, #{boxperson}, #{address}, #{status}, #{factorydate}, #{persontelphone}, #{longitude}, #{latitude}, #{areaid}, #{areaname})")
    int save(AdMktBox adMktBox);
    
    int count(@Param("params") Map<String, Object> params);

    List<AdMktBox> list(@Param("params") Map<String, Object> params, @Param("offset") Integer offset, @Param("limit") Integer limit);
}
