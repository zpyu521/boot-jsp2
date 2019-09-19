package com.zpyu.bootjsp2.dao;

import com.zpyu.bootjsp2.entity.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author: zpyu521
 * @Date: 2019/9/19
 * @Description:
 * @Version: 1.0
 */
@Mapper
public interface DeptMapper {
    List<Dept> find();


}
