package com.fc.dao;

import com.fc.springcloud.entity.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DeptDao {
    public Boolean addDept(Dept dept);
    public Dept findById(Long id);
    public List<Dept> findAll();
}
