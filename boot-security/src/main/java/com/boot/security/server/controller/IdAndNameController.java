package com.boot.security.server.controller;


import com.boot.security.server.dao.AdvertisingCompanyDao;
import com.boot.security.server.dao.UserDao;
import com.boot.security.server.dto.IdAndNameDto;
import com.boot.security.server.model.SysUser;
import com.boot.security.server.service.UserService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created By Seven.wk
 * Description: 获取实体类中的id和name键值对
 * Created At 2018/09/28
 */
@RestController
@RequestMapping("/idAndName")
public class IdAndNameController {


    @Autowired
    private UserService userService;

    @Autowired
    private UserDao userDao;

    @Autowired
    private AdvertisingCompanyDao companyDao;

//    @GetMapping("/aiMktBox")
//    @ApiOperation(value = "获得aiBox的id和name键值对")
//    public List<IdAndNameDto> getMktBoxIdAndName(HttpServletRequest request) {
//        SysUser user = userService.getTokenUser(request);
//        Long operatorId = user.getOperatorid() == null ? 0 : user.getOperatorid();
//        List<Map<String, Object>> mapList = aiMktBoxDao.getIdAndName(operatorId);
//        return getIdAndName(mapList);
//    }

    @GetMapping("/assessor")
    @ApiOperation(value = "获得User的id和name键值对")
    public List<IdAndNameDto> getAssessorIdANdName(HttpServletRequest request){
        List<Map<Long, Object>> mapList = userDao.getIdAndName();
        return getIdAndNameL(mapList);
    }

    @GetMapping("/company")
    @ApiOperation(value = "获得User的id和name键值对")
    public List<IdAndNameDto> getCompanyIdANdName(HttpServletRequest request){
        List<Map<Long, Object>> mapList = companyDao.getIdAndName();
        return getIdAndNameL(mapList);
    }

    private List<IdAndNameDto> getIdAndNameL(List<Map<Long, Object>> mapList) {
        List<IdAndNameDto> idAndNameDtoList = new ArrayList<>();
        for(Map<Long, Object> kv : mapList) {
            IdAndNameDto idAndNameDto = new IdAndNameDto();
            for (Object o : kv.keySet()) {
                if(kv.get(o) instanceof Long)
                    idAndNameDto.setId(kv.get(o));
                else
                    idAndNameDto.setName(kv.get(o));
            }

            idAndNameDtoList.add(idAndNameDto);
        }
        return idAndNameDtoList;
    }

    private List<IdAndNameDto> getIdAndName(List<Map<String, Object>> mapList) {
        List<IdAndNameDto> idAndNameDtoList = new ArrayList<>();
        for(Map<String, Object> kv : mapList) {
            IdAndNameDto idAndNameDto = new IdAndNameDto();
            for (Object o : kv.keySet()) {
                if(kv.get(o) instanceof Long)
                    idAndNameDto.setId(kv.get(o));
                else
                    idAndNameDto.setName(kv.get(o));
            }

            idAndNameDtoList.add(idAndNameDto);
        }
        return idAndNameDtoList;
    }

}
