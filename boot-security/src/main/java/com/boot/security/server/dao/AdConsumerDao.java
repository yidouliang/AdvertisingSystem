package com.boot.security.server.dao;

import java.util.List;
import java.util.Map;

import com.boot.security.server.dto.AdConsumerDTO;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.boot.security.server.model.AdConsumer;

@Mapper
public interface AdConsumerDao {

    @Select("select * from ad_consumer t where t.id = #{id}")
    AdConsumer getById(Long id);

    @Delete("delete from ad_consumer where id = #{id}")
    int delete(Long id);

    int update(AdConsumer adConsumer);
    
    @Options(useGeneratedKeys = true, keyProperty = "id")
    @Insert("insert into ad_consumer(adconsumername, telphone, companyid, companyname, type, starcode, state, createtime, updatetime) values(#{adconsumername}, #{telphone}, #{companyid}, #{companyname}, #{type}, #{starcode}, #{state}, #{createtime}, #{updatetime})")
    int save(AdConsumer adConsumer);
    
    int count(@Param("params") Map<String, Object> params);

    List<AdConsumerDTO> list(@Param("params") Map<String, Object> params, @Param("offset") Integer offset, @Param("limit") Integer limit);
}
