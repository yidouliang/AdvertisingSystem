package com.boot.security.server.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.boot.security.server.model.AdvertisingRates;

@Mapper
public interface AdvertisingRatesDao {

    @Select("select * from advertising_rates t where t.id = #{id}")
    AdvertisingRates getById(Long id);

    @Delete("delete from advertising_rates where id = #{id}")
    int delete(Long id);

    int update(AdvertisingRates advertisingRates);
    
    @Options(useGeneratedKeys = true, keyProperty = "id")
    @Insert("insert into advertising_rates(type, areaid, secprice, monprice) values(#{type}, #{areaid}, #{secprice}, #{monprice})")
    int save(AdvertisingRates advertisingRates);
    
    int count(@Param("params") Map<String, Object> params);

    List<AdvertisingRates> list(@Param("params") Map<String, Object> params, @Param("offset") Integer offset, @Param("limit") Integer limit);
}
