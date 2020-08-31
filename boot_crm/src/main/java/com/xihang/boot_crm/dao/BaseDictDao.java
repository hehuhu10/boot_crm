package com.xihang.boot_crm.dao;

import com.xihang.boot_crm.entity.BaseDict;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface BaseDictDao {
    // 根据类别代码查询数据字典
    public List<BaseDict> selectBaseDictByTypeCode(String typecode);
}
