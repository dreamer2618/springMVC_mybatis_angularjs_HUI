package com.dawn.bgSys.dao;

import com.dawn.bgSys.domain.Module;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface IModuleDao {
    int deleteByPrimaryKey(Long moduleId);

    int deleteByClassId(String classId);

    int insert(Module record);

    int insertSelective(Module record);

    Module selectByPrimaryKey(Long moduleId);

    List<Module> select(@Param("searchStr")String searchStr,@Param("status")String status,@Param("parentClassId")String parentClassId,@Param("selfClassId")String selfClassId);

    List<Map> selectForPerm(@Param("searchStr")String searchStr,@Param("permUserId")String permUserId,@Param("permType")String permType);

    Module selectByCode(String moduleCode);

    List<Map> selectStatusByClassId(@Param("status")String status,@Param("classId")String classId);

    int updateByPrimaryKeySelective(Module record);

    int updateByPrimaryKey(Module record);

    int updateStatusByClassId(@Param("status")Byte status,@Param("classId")String classId);
}