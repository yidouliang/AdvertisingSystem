package com.boot.security.server.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.boot.security.server.model.AdvertisingCompany;

@Mapper
public interface AdvertisingCompanyDao {

    @Select("select * from advertising_company t where t.id = #{id}")
    AdvertisingCompany getById(Long id);

    @Delete("delete from advertising_company where id = #{id}")
    int delete(Long id);

    int update(AdvertisingCompany advertisingCompany);

    @Options(useGeneratedKeys = true, keyProperty = "id")
    @Insert("insert into advertising_company(companyname, address, registrationdate, chairman, email, phone, businessscope, staffsize, companycode) values(#{companyname}, #{address}, #{registrationdate}, #{chairman}, #{email}, #{phone}, #{businessscope}, #{staffsize}, #{companycode})")
    int save(AdvertisingCompany advertisingCompany);

    int count(@Param("params") Map<String, Object> params);

    List<AdvertisingCompany> list(@Param("params") Map<String, Object> params, @Param("offset") Integer offset, @Param("limit") Integer limit);

    @Select("select id ,companyname from advertising_company")
    List<Map<Long, Object>> getIdAndName();
}
